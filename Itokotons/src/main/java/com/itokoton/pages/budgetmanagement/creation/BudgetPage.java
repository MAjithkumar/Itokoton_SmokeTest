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
	By BUDGET_CREATION_PAGE_MENU = By.xpath("//h5[text()='Budget Creation ']");

	public void NavigatetoBudgetCreationPage() {
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

	public boolean verifyBudgetPageHeader() {
		return eu.IsDisplayed(BUDGET_MENU);
	}

	public String getBudgetPageHeader() {
		return eu.getText(BUDGET_MENU);
	}
}
