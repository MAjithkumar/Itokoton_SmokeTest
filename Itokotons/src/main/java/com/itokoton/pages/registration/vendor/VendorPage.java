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
	@FindBy(className = "logoimage")
	static By ITOKOTON_DASHBOARD;
	@FindBy(linkText = "Registration & Screening")
	static By REGISTRATION_MENU;
	@FindBy(linkText = "Vendor Registration")
	static By VENDOR_REGISTRATION_MENU;
	@FindBy(xpath = "//button[@title='Create Vendor']")
	static By VENDOR_CREATE_BUTTON;

	public void NavigatetoVendorPage() {
		eu.visibilityOfElementWait(ITOKOTON_DASHBOARD);
		eu.visibilityOfElementWait(REGISTRATION_MENU);
		eu.ActionsMoveToElement(REGISTRATION_MENU);
		String REGISTRATION_MENU_TOOLTIP = eu.getText(REGISTRATION_MENU);
		System.out.println("The tooltip of the master tab is :   " + REGISTRATION_MENU_TOOLTIP);
		eu.inVisibilityOfSpinnerIcon();
		eu.click(REGISTRATION_MENU);
		eu.visibilityOfElementWait(VENDOR_REGISTRATION_MENU);
		eu.click(VENDOR_REGISTRATION_MENU);
		eu.visibilityOfElementWait(VENDOR_REGISTRATION_MENU);
		eu.visibilityOfElementWait(VENDOR_CREATE_BUTTON);
	}
}
