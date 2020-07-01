package com.itokoton.pages.budgetmanagement.creation;

import org.openqa.selenium.By;


import org.openqa.selenium.WebDriver;

import com.itokoton.util.Elements.ElementUtil;

public class BudgetPage {
	
	WebDriver driver;
	ElementUtil eu;

	public BudgetPage(WebDriver driver) {
		this.driver = driver;
		eu = new ElementUtil(driver);
	}

//	Locators
	By ITOKOTON_DASHBOARD = By.className("logoimage");
	By BUDGET_MENU = By.xpath("//span[text()='Budget Management']");
	By BUDGET_CREATION = By.xpath("//span[text()='Budget Creation']");

	public void NavigatetoBudgetPage() {
		eu.visibilityOfElementWait(ITOKOTON_DASHBOARD);
		eu.visibilityOfElementWait(BUDGET_MENU);
		eu.actionsMoveToElement(BUDGET_MENU);
		eu.inVisibilityOfSpinnerIcon();
		eu.click(BUDGET_MENU);
		eu.inVisibilityOfSpinnerIcon();
		eu.visibilityOfElementWait(BUDGET_MENU);
		eu.click(BUDGET_MENU);
		eu.visibilityOfElementWait(BUDGET_CREATION);
	}

}
