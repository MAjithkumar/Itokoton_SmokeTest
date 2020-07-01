package com.itokoton.registration;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.itokoton.basepage.BasePage;
import com.itokoton.basepage.LoginPage;
import com.itokoton.pages.registration.vendor.VendorPage;
import com.itokoton.util.DTO.registration.RegistrationDTO;
import com.itokoton.util.Elements.Constants;
import com.itokoton.util.Elements.ElementUtil;
import com.itokoton.util.ExcelUtils.Xls_Reader;
import com.itokoton.util.ExcelUtils.registration.RegistrationUtil;

public class VendorPageTest {
	WebDriver driver;
	Properties prop;
	BasePage basePage;
	LoginPage loginPage;
	VendorPage vendorPage;
	String vendorDataFilePath;
	Xls_Reader reader;
	SoftAssert softAssert;
	ElementUtil eu;
	public static ArrayList<RegistrationDTO> VendorData;

	public static int rowIndex = 2, amendIndex = -1;
	public static int rowIndex1 = 2;

	@BeforeMethod
	public void setUp() throws Exception {
		basePage = new BasePage();
		prop = basePage.init_properties();
		driver = basePage.init_driver(prop);
		loginPage = new LoginPage(driver);
		vendorPage = new VendorPage(driver);
		eu = new ElementUtil(driver);
		vendorDataFilePath = System.getProperty("user.dir") + ".\\input_data\\Vendor_TestData.xlsx";
	}

	@Test(priority = 0)
	public void Login() throws IOException, InterruptedException, AWTException {
		reader = new Xls_Reader(vendorDataFilePath, "VendorInputData");
		String username = Xls_Reader.getCellData("VendorInputData", "Username", rowIndex);
		System.out.println("username is ----" + username);
		String password = Xls_Reader.getCellData("VendorInputData", "Password", rowIndex1);
		System.out.println("password is -----" + password);
		loginPage.Login(username, password);
		eu.inVisibilityOfSpinnerIcon();
		String headerValue = loginPage.getHomePageHeader();
		System.out.println("home page header is: " + headerValue);
		Assert.assertEquals(headerValue, Constants.HOME_PAGE_TITLE, "home page header mismatched...");
		vendorPage.NavigatetoVendorPage();
	}
}
