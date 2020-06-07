package com.itokoton.registration;

import java.awt.AWTException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.itokoton.basepage.BasePage;
import com.itokoton.pages.registration.vendor.VendorPage;
import com.itokoton.util.DTO.registration.RegistrationDTO;
import com.itokoton.util.ExcelUtils.Xls_Reader;

public class VendorPageTest {
	WebDriver driver;
	Properties prop;
	BasePage basePage;
	VendorPage vendorPage;
	public static ArrayList<RegistrationDTO> VendorData;
	String vendorDataFilePath;
	Xls_Reader reader;
	public static int rowIndex, amendIndex;
	public static int rowIndex1;

	@BeforeMethod
	public void setUp() throws Exception {
		basePage = new BasePage();
		prop = basePage.init_properties();
		driver = basePage.init_driver(prop);
		vendorDataFilePath = System.getProperty("user.dir") + ".\\input_data\\Vendor_TestData.xlsx";
	}

	@Test(priority = 0)
	public void Login() throws IOException, InterruptedException, AWTException {
		reader = new Xls_Reader(vendorDataFilePath, "VendorInputData");

		String username = Xls_Reader.getCellData("VendorInputData", "Username", rowIndex);

		System.out.println("username is ----" + username);
//		String password = Xls_Reader.getCellData("VendorInputData", "Password", rowIndex1);
//		System.out.println("password is -----" + password);
//		LoginPage loginPage = new LoginPage(driver);
//		loginPage.Login(username, password);
//		vendorPage.NavigatetoVendorPage();
//		basePage.Logout();
	}
}
