package com.itokoton.registration;

import java.awt.AWTException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.itokoton.basepage.BasePage;
import com.itokoton.pages.registration.vendor.VendorPage;
import com.itokoton.util.ExcelUtils.Xls_Reader;

public class VendorPageTest {
	public static int rowIndex, amendIndex;
	public static int rowIndex1;
	String vendorDataFilePath;

	WebDriver driver;
	Properties prop;
	BasePage basePage;
	VendorPage vendorPage;

	@BeforeMethod
	public void setUp() throws Exception {
		BasePage bp = new BasePage();
		prop = basePage.init_properties();
		driver = basePage.init_driver(prop);
		vendorDataFilePath = System.getProperty("user.dir") + ".\\input_data\\Vendor_TestData.xlsx";
	}

	@Test(priority = 0)
	public void Login() throws IOException, InterruptedException, AWTException {
		String username = Xls_Reader.getCellData("VendorInputdatas", "Username", rowIndex);
		System.out.println(username);
		String password = Xls_Reader.getCellData("VendorInputdatas", "Password", rowIndex1);
		System.out.println(password);
		basePage.Login(username, password);
		vendorPage.NavigatetoVendorPage();
		basePage.Logout();
	}
}
