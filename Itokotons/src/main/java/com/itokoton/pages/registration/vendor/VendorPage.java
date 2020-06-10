package com.itokoton.pages.registration.vendor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.itokoton.basepage.BasePage;
import com.itokoton.util.Elements.ElementUtil;

public class VendorPage extends BasePage {

	WebDriver driver;
	ElementUtil eu;

	public VendorPage(WebDriver driver) {
		this.driver = driver;
		eu = new ElementUtil(driver);
	}

//	Locators
	By ITOKOTON_DASHBOARD = By.className("logoimage");
	By REGISTRATION_MENU = By.linkText("Registration & Screening");
	By VENDOR_REGISTRATION_MENU = By.linkText("Vendor Registration");
	By VENDOR_CREATE_BUTTON = By.xpath("//button[@title='Create Vendor']");

	public void NavigatetoVendorPage() {
		eu.visibilityOfElementWait(ITOKOTON_DASHBOARD);
		eu.visibilityOfElementWait(REGISTRATION_MENU);
		eu.actionsMoveToElement(REGISTRATION_MENU);
		eu.inVisibilityOfSpinnerIcon();
		eu.click(REGISTRATION_MENU);
		eu.visibilityOfElementWait(VENDOR_REGISTRATION_MENU);
		eu.click(VENDOR_REGISTRATION_MENU);
		eu.visibilityOfElementWait(VENDOR_REGISTRATION_MENU);
		eu.visibilityOfElementWait(VENDOR_CREATE_BUTTON);
	}
}
