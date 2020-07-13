package com.itokoton.pages.budgetmanagement.creation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import com.itokoton.util.DTO.budgetmanagement.BudgetManagementDTO;
import com.itokoton.util.Elements.ElementUtil;
import com.itokoton.util.ExcelUtils.Xls_Reader;

public class BudgetCreation {
	WebDriver driver;
	ElementUtil eu;

	public static ArrayList<BudgetManagementDTO> budgetManagementDTO;

	public BudgetCreation(WebDriver driver) {
		this.driver = driver;
		eu = new ElementUtil(driver);
	}

//	Locators
	By BUDGET_CREATION = By.xpath("//span[text()='Budget Creation']");
	By BUDGET_SEARCH_BUTTON = By.xpath("//button[text()=' Search ']");
	By BUDGET_RESET_BUTTON = By.xpath("//button[text()=' Reset ']");
	By GLCODE = By.xpath("//span[text()='GL Code']");
	By GLCODE_FILTER = By.xpath("//span[text()='GL Code']/parent::div/descendant::i");
	By GLCODE_FILTER_SEARCH = By.xpath(
			"//span[text()='GL Code']/parent::div/following-sibling::div/descendant::input[@placeholder='Search']");
	By GL_AMOUNT = By.xpath("//input[@id='ActualBudgetAmount_0']");
	By SEARCH_RETURNED_ZERO_RESULTS = By.xpath("//span[text()='Select all values']");

	public void BudgetCreationPage(BudgetManagementDTO budgetmanagementdto) throws AWTException, InterruptedException {
		eu.visibilityOfElementWait(BUDGET_CREATION);
		eu.click(BUDGET_CREATION);
		eu.inVisibilityOfSpinnerIcon();
		eu.visibilityOfElementWait(BUDGET_SEARCH_BUTTON);
		eu.click(BUDGET_SEARCH_BUTTON);
		if (driver.findElements(SEARCH_RETURNED_ZERO_RESULTS).size() > 0) {
			eu.click(BUDGET_RESET_BUTTON);
			eu.inVisibilityOfSpinnerIcon();
			eu.SLEEP_2S();
			driver.navigate().refresh();
			eu.inVisibilityOfSpinnerIcon();
			eu.SLEEP_2S();
			eu.click(BUDGET_RESET_BUTTON);
			eu.inVisibilityOfSpinnerIcon();
			eu.SLEEP_2S();
			eu.visibilityOfElementWait(BUDGET_SEARCH_BUTTON);
			eu.click(BUDGET_SEARCH_BUTTON);
		}
		eu.inVisibilityOfSpinnerIcon();
		eu.visibilityOfElementWait(GLCODE);
		eu.click(GLCODE);
		eu.visibilityOfElementWait(GLCODE_FILTER);
		eu.click(GLCODE_FILTER);
		eu.visibilityOfElementWait(GLCODE_FILTER_SEARCH);
		eu.sendKeys(GLCODE_FILTER_SEARCH, budgetmanagementdto.GLCode1);
		eu.visibilityOfElementWait(GL_AMOUNT);
		eu.SLEEP_2S();
		eu.sendKeys(GL_AMOUNT, budgetmanagementdto.GLAmount1);
		eu.click(GLCODE_FILTER_SEARCH);
		driver.findElement(GLCODE_FILTER_SEARCH).sendKeys(Keys.chord(Keys.CONTROL, "a"));
		eu.sendKeys(GLCODE_FILTER_SEARCH, budgetmanagementdto.GLCode2);
		eu.SLEEP_3S();
		eu.visibilityOfElementWait(GL_AMOUNT);
		eu.click(GL_AMOUNT);
		eu.sendKeys(GL_AMOUNT, budgetmanagementdto.GLAmount2);
	}

}
