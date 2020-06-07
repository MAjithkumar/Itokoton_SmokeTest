package com.itokoton.basepage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.FindBy;

import com.itokoton.util.Elements.ElementUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginPage extends BasePage {
	static String currentUName, currentPassword;
	static boolean relogin = false;
	public static int rowIndex = 2, amendIndex = -1;
	public static int rowIndex1 = 2;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		eu = new ElementUtil(driver);
	}

//	Locators 
	@FindBy(xpath = "//i[@class='fa fa-caret-down']")
	static By LOGOUT_DOWNARROW_ICON;
	@FindBy(xpath = "//a[starts-with(.,'Sign-in As Different User')]")
	static By LOGOUT_SIGNIN_DIFF_USER;
	@FindBy(xpath = "//table[@id='user-profile-dd']/descendant::tr/descendant::td/descendant::label")
	static By LOGGEDIN_USER;

	public void Login(String userName, String userPassword) throws IOException, InterruptedException, AWTException {
		eu.inVisibilityOfSpinnerIcon();
		eu.SLEEP_4S();
		currentUName = userName;
		currentPassword = userPassword;
		eu.inVisibilityOfSpinnerIcon();
		StringSelection loginname = new StringSelection(userName);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(loginname, loginname);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_TAB);
		eu.SLEEP_3S();
		StringSelection loginname1 = new StringSelection(userPassword);
		Clipboard clipboard1 = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard1.setContents(loginname1, loginname1);
		Robot robot1 = new Robot();
		robot1.keyPress(KeyEvent.VK_CONTROL);
		robot1.keyPress(KeyEvent.VK_V);
		robot1.keyRelease(KeyEvent.VK_V);
		robot1.keyRelease(KeyEvent.VK_CONTROL);
		robot1.keyPress(KeyEvent.VK_TAB);
		robot1.keyPress(KeyEvent.VK_ENTER);
		eu.SLEEP_3S();
		VerifyLoginUser();
	}

	public void Logout() throws InterruptedException {
		eu.visibilityOfElementWait(LOGOUT_DOWNARROW_ICON);
		eu.click(LOGOUT_DOWNARROW_ICON);
		eu.inVisibilityOfSpinnerIcon();
		eu.SLEEP_2S();
		eu.visibilityOfElementWait(LOGOUT_SIGNIN_DIFF_USER);
		eu.click(LOGOUT_SIGNIN_DIFF_USER);
		eu.inVisibilityOfSpinnerIcon();
		if (relogin) {
			try {
				Login(currentUName, currentPassword);
			} catch (IOException e) {
				e.printStackTrace();
			} catch (AWTException e) {
				e.printStackTrace();
			}
		} else {
			if (rowIndex == 2 && amendIndex != -1) {
				rowIndex = amendIndex;
				amendIndex = -1;
			} else if (amendIndex != -1) {
				rowIndex = 2;
			} else {
				rowIndex++;
			}
		}
	}

	public void VerifyLoginUser() {
		String user = eu.getText(LOGGEDIN_USER);
		System.out.println("The logged in user name is -- " + user);
		if (!user.equals(currentUName)) {
			try {
				relogin = true;
				Logout();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			relogin = false;
		}
	}
}
