package com.itokoton.basepage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.itokoton.util.Elements.ElementUtil;

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
	By LOGOUT_DOWNARROW_ICON = By.xpath("//i[@class='fa fa-caret-down']");
	By LOGOUT_SIGNIN_DIFF_USER = By.xpath("//a[starts-with(.,'Sign-in As Different User')]");
	By LOGGEDIN_USER = By.xpath("//table[@id='user-profile-dd']/descendant::tr/descendant::td/descendant::label");
	By header = By.cssSelector("h1.private-page__title");
	By HOME_PAGE_MENU = By.linkText("My View");

	public void Login(String userName, String userPassword) throws IOException, InterruptedException, AWTException {
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
		currentUName = userName;
		currentPassword = userPassword;
		VerifyLoginUser();
	}

	public void Logout() throws InterruptedException {
		eu.visibilityOfElementWait(LOGOUT_DOWNARROW_ICON);
		eu.SLEEP_2S();
		eu.click(LOGOUT_DOWNARROW_ICON);
		eu.SLEEP_2S();
		eu.visibilityOfElementWait(LOGOUT_SIGNIN_DIFF_USER);
		eu.click(LOGOUT_SIGNIN_DIFF_USER);
		eu.SLEEP_2S();

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

	public void VerifyLoginUser() throws InterruptedException {
		eu.SLEEP_4S();
		String user = eu.getText(LOGGEDIN_USER);
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
		eu.SLEEP_3S();
	}

	public boolean verifyHomePageHeader() {
		return eu.IsDisplayed(HOME_PAGE_MENU);
	}

	public String getHomePageHeader() {
		return eu.getText(HOME_PAGE_MENU);
	}
}
