package com.itokoton.budgetmanagement;

import java.awt.AWTException;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.itokoton.basepage.BasePage;
import com.itokoton.basepage.LoginPage;
import com.itokoton.pages.budgetmanagement.creation.BudgetCreation;
import com.itokoton.pages.budgetmanagement.creation.BudgetPage;
import com.itokoton.pages.budgetmanagement.creation.BudgetFlows;
import com.itokoton.util.DTO.budgetmanagement.BudgetManagementDTO;
import com.itokoton.util.Elements.Constants;
import com.itokoton.util.Elements.ElementUtil;
import com.itokoton.util.ExcelUtils.Xls_Reader;
import com.itokoton.util.ExcelUtils.budgetmanagement.BudgetmanagementUtil;

public class BudgetCreationPageTest {
	WebDriver driver;
	Properties prop;
	BasePage basePage;
	LoginPage loginPage;
	BudgetPage budgetPage;
	BudgetCreation budgetCreation;
	BudgetFlows budgetFlow;
	Xls_Reader reader;
	SoftAssert softAssert;
	ElementUtil eu;

	public static ArrayList<BudgetManagementDTO> BudgetData;
	public static int rowIndex = 2, amendIndex = -1;
	public static int rowIndex1 = 2;
	int i = 0;

	@BeforeTest
	public void setUp() throws Exception {
		basePage = new BasePage();
		prop = basePage.init_properties();
		driver = basePage.init_driver(prop);
		loginPage = new LoginPage(driver);
		budgetPage = new BudgetPage(driver);
		budgetCreation = new BudgetCreation(driver);
		budgetFlow = new BudgetFlows(driver);
		eu = new ElementUtil(driver);
	}

	@Test(priority = 0)
	public void Step1_LoggedInAsBudgetCreator() throws IOException, InterruptedException, AWTException {
		reader = new Xls_Reader(Constants.budgetDataFilePath, "BudgetCreationInputData");
		String username = Xls_Reader.getCellData("BudgetCreationInputData", "Username", rowIndex);
		String password = Xls_Reader.getCellData("BudgetCreationInputData", "Password", rowIndex1);
		loginPage.Login(username, password);
		eu.inVisibilityOfSpinnerIcon();
		String headerValue = loginPage.getHomePageHeader();
		System.out.println("home page header is: " + headerValue);
		Assert.assertEquals(headerValue, Constants.HOME_PAGE_TITLE, "home page header mismatched...");
	}

	@Test(priority = 1)
	public void Step2_NavigatetoBudgetCreationPage() {
		budgetPage.NavigatetoBudgetCreationPage();
		String budgetHeaderValue = budgetPage.getBudgetPageHeader();
		System.out.println("budget page header is: " + budgetHeaderValue);
		Assert.assertEquals(budgetHeaderValue, Constants.BUDGET_PAGE_TITLE, "budget page header mismatched...");
	}

	@Test(priority = 2)
	public void Step3_CreatingBudget() throws AWTException, IOException, InterruptedException {
		BudgetData = BudgetmanagementUtil.getbudgetcreationDetailsFromExcel(Constants.budgetDataFilePath);
		for (BudgetManagementDTO budgetManagementDTO : BudgetData) {
			budgetCreation.BudgetCreationPage(budgetManagementDTO);
		}
	}

	@Test(priority = 3)
	public void Step4_AddReviewer() throws AWTException, IOException, InterruptedException {
		for (BudgetManagementDTO budgetManagementDTO : BudgetData) {
			budgetFlow.AddingReviewer(Constants.budgetDataFilePath, budgetManagementDTO);
		}
	}

	@Test(priority = 4)
	public void Step5_LoggedoutFromBudgetCreator() throws AWTException, IOException, InterruptedException {
		loginPage.Logout();
	}

	@Test(priority = 5)
	public void Step6_LoggedInAsReviewer() throws AWTException, IOException, InterruptedException {
		String reviewerName = Xls_Reader.getCellData("BudgetCreationInputData", "ReviewerName", rowIndex);
		System.out.println("username is ----" + reviewerName);
		String password = Xls_Reader.getCellData("BudgetCreationInputData", "Password", rowIndex1);
		System.out.println("password is -----" + password);
		loginPage.Login(reviewerName, password);
	}

	@Test(priority = 6)
	public void Step7_ReviewBudget() throws IOException, InterruptedException, AWTException {
		for (BudgetManagementDTO budgetManagementDTO : BudgetData) {
			budgetFlow.ReviewerFlow(budgetManagementDTO);
		}
	}

	@Test(priority = 7)
	public void Step8_LoggedoutFromReviewer() throws AWTException, IOException, InterruptedException {
		loginPage.Logout();
	}

	@Test(priority = 8)
	public void Step9_LoggedInAsBudgetCreator() throws AWTException, IOException, InterruptedException {
		String username = Xls_Reader.getCellData("BudgetCreationInputData", "Username", rowIndex);
		System.out.println("username is ----" + username);
		String password = Xls_Reader.getCellData("BudgetCreationInputData", "Password", rowIndex1);
		System.out.println("password is -----" + password);
		loginPage.Login(username, password);
	}

	@Test(priority = 9)
	public void Step10_AddingApprover() throws InterruptedException {
		for (BudgetManagementDTO budgetManagementDTO : BudgetData) {
			budgetFlow.AddApprover(budgetManagementDTO);
		}
	}

	@Test(priority = 10)
	public void Step11_LoggedoutFromBudgetCreator() throws AWTException, IOException, InterruptedException {
		loginPage.Logout();
	}

	@Test(priority = 11)
	public void Step12_LoggedInAsApprover() throws AWTException, IOException, InterruptedException {
		String approverName = Xls_Reader.getCellData("BudgetCreationInputData", "ApproverName", rowIndex);
		System.out.println("username is ----" + approverName);
		String password = Xls_Reader.getCellData("BudgetCreationInputData", "Password", rowIndex1);
		System.out.println("password is -----" + password);
		loginPage.Login(approverName, password);
	}

	@Test(priority = 12)
	public void Step13_ApproveBudget() throws InterruptedException {
		for (BudgetManagementDTO budgetManagementDTO : BudgetData) {
			budgetFlow.ApproverFlows(budgetManagementDTO);
		}
	}
}
