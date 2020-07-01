package com.itokoton.pages.budgetmanagement.creation;

import java.awt.AWTException;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.itokoton.util.DTO.budgetmanagement.BudgetManagementDTO;
import com.itokoton.util.Elements.ElementUtil;
import com.itokoton.util.ExcelUtils.Xls_Reader;

public class BudgetFlows {

	WebDriver driver;
	ElementUtil eu;
	Xls_Reader reader;
	public static ArrayList<BudgetManagementDTO> budgetManagementdto;

	String reqNum;

	public BudgetFlows(WebDriver driver) {
		this.driver = driver;
		eu = new ElementUtil(driver);
	}

	By BUDGET_MENU = By.xpath("//span[text()='Budget Management']");
	By ADD_REVIEWER_BUTTON = By.xpath("//button[text()=' Add Reviewer ']");
	By SELECT_REVIEWER = By.xpath("//select[@id='exampleSelect2']");
	By ADD_BUTTON = By.xpath("//button[text()=' Add']");
	By CONFIRM_BUTTON = By.xpath("//button[text()=' Confirm']");
	By REVIEW_BUTTON = By.xpath("//button[text()=' Review ']");
	By GET_REQUEST_NUMBER = By
			.xpath("//h4[text()=' Message From Itokoton']/parent::div/following-sibling::div/descendant::div");
	By OK_BUTTON = By.xpath("//button[@class='budget_btm_btn'][text()='OK']");
	By APPROVER_VIEW = By.xpath("//span[text()='Approver view']");
	By AWAITING_REVIEW_COUNT = By.xpath("//span[text()='Awaiting Review']/parent::td/following-sibling::td/span");
	By APPROVAL_NUMBER = By.xpath("//th[text()='Approval Number']");
	By APPROVAL_NUMBER_FILTER = By
			.xpath("//th[text()='Approval Number']/parent::span/following-sibling::span/following-sibling::i");
	By APPROVAL_NUMBER_FILTER_SEARCH = By
			.xpath("//th[text()='Approval Number']/parent::span/parent::div/following-sibling::div/input");
	By REQUEST_NUMBER_HYPERLINK = By.xpath("//span[@id='AssignRequestbtn']");
	By APPROVAL_REMARKS = By.xpath("//textarea[@id='ApprovalRemark']");
	By APPROVAL_REMARKS_ATTACHMENT = By
			.xpath("//label[text()='Attachment']/parent::div/descendant::div/descendant::div/descendant::div/i");
	By REVIEWED_BUTTON = By.xpath("//button[@class='budget_btm_btn ng-star-inserted'][@title='Reviewed']");
	// Approver_Flow
	By BUDGET_MANAGEMENT_DASHBOARD = By.xpath(
			"//span[text()='Budget Management']/parent::a/following-sibling::ul/descendant::span[text()='Dashboard']");
	By BUDGET_MYVIEW = By.xpath("//span[text()='My View']");
	By BUDGET_CODE = By.xpath("//th[text()='Budget Code']");
	By BUDGET_CODE_FILTER = By.xpath("//th[text()='Budget Code']/parent::span/following-sibling::i");
	By BUDGET_CODE_FILTER_SEARCH = By
			.xpath("//th[text()='Budget Code']/parent::span/parent::div/following-sibling::div/input");
	By ADD_APPROVER_BUTTON = By.xpath("//button[text()=' Add Approver ']");
	By SELECT_APPROVER = By.xpath("//select[@id='exampleSelect2']");
	By SUBMIT_BUTTON = By.xpath("//button[text()=' Submit ']");
	By BUDGET_APPROVAL_COUNT = By.xpath("//span[text()='Budget Approval']/parent::td/following-sibling::td/span");
	By APPROVE_BUTTON = By.xpath("//button[text()=' Approve ']");

	public void AddingReviewer(String budgetDataFilePath, BudgetManagementDTO budgetManagementdto)
			throws InterruptedException, AWTException {
		try {
			eu.SLEEP_8S();
			eu.visibilityOfElementWait(ADD_REVIEWER_BUTTON);
			eu.click(ADD_REVIEWER_BUTTON);
			eu.visibilityOfElementWait(SELECT_REVIEWER);
			WebElement select1 = driver.findElement(SELECT_REVIEWER);
			select1.click();
			eu.SLEEP_2S();
			String reviewerName = budgetManagementdto.ReviewerName;
			Select sel = new Select(select1);
			sel.selectByVisibleText(reviewerName);
			eu.SLEEP_2S();
			eu.visibilityOfElementWait(ADD_BUTTON);
			eu.click(ADD_BUTTON);
			eu.visibilityOfElementWait(CONFIRM_BUTTON);
			eu.click(CONFIRM_BUTTON);
			eu.visibilityOfElementWait(REVIEW_BUTTON);
			eu.click(REVIEW_BUTTON);
			eu.inVisibilityOfSpinnerIcon();
			eu.SLEEP_2S();
			eu.visibilityOfElementWait(GET_REQUEST_NUMBER);
			String budcode = eu.getText(GET_REQUEST_NUMBER);
			String budgetReqNumber = budcode.split(": ")[1];
			reqNum = budgetReqNumber;
			Xls_Reader.setCellData("BudgetCreationInputData", "BudgetReqNumber", 2, budgetReqNumber);
			eu.SLEEP_5S();
			eu.visibilityOfElementWait(OK_BUTTON);
			eu.click(OK_BUTTON);
			eu.inVisibilityOfSpinnerIcon();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void ReviewerFlow(BudgetManagementDTO budgetManagementdto) throws AWTException, InterruptedException {
		eu.inVisibilityOfSpinnerIcon();
		eu.visibilityOfElementWait(APPROVER_VIEW);
		eu.click(APPROVER_VIEW);
		eu.inVisibilityOfSpinnerIcon();
		eu.visibilityOfElementWait(AWAITING_REVIEW_COUNT);
		eu.click(AWAITING_REVIEW_COUNT);
		eu.inVisibilityOfSpinnerIcon();
		eu.visibilityOfElementWait(APPROVAL_NUMBER);
		eu.SLEEP_2S();
		eu.click(APPROVAL_NUMBER);
		eu.visibilityOfElementWait(APPROVAL_NUMBER_FILTER);
		eu.SLEEP_2S();
		eu.click(APPROVAL_NUMBER_FILTER);
		eu.visibilityOfElementWait(APPROVAL_NUMBER_FILTER_SEARCH);
		eu.sendKeys(APPROVAL_NUMBER_FILTER_SEARCH, reqNum);
		WebElement REQUESTNUMBERHYPERLINK = driver.findElement(By.xpath("//span[@id='AssignRequestbtn']"));
		eu.jseScrollIntoView(REQUESTNUMBERHYPERLINK);
		eu.SLEEP_2S();
		eu.visibilityOfElementWait(REQUEST_NUMBER_HYPERLINK);
		eu.click(REQUEST_NUMBER_HYPERLINK);
		eu.inVisibilityOfSpinnerIcon();
		eu.visibilityOfElementWait(APPROVAL_REMARKS);
		eu.sendKeys(APPROVAL_REMARKS, budgetManagementdto.ReviewerRemarks);
		eu.click(REVIEWED_BUTTON);
		eu.inVisibilityOfSpinnerIcon();
	}

	public void AddApprover(BudgetManagementDTO budgetManagementdto) throws InterruptedException {

		eu.inVisibilityOfSpinnerIcon();
		if (!!driver.findElement(BUDGET_MYVIEW).isDisplayed() || !!driver.findElement(BUDGET_MYVIEW).isEnabled()) {
			eu.visibilityOfElementWait(BUDGET_MENU);
			eu.click(BUDGET_MENU);
			eu.visibilityOfElementWait(BUDGET_MANAGEMENT_DASHBOARD);
			eu.click(BUDGET_MANAGEMENT_DASHBOARD);
		}

		eu.visibilityOfElementWait(BUDGET_MYVIEW);
		eu.click(BUDGET_MYVIEW);
		eu.inVisibilityOfSpinnerIcon();
		eu.visibilityOfElementWait(BUDGET_CODE);
		eu.click(BUDGET_CODE);
		eu.visibilityOfElementWait(BUDGET_CODE_FILTER);
		eu.click(BUDGET_CODE_FILTER);
		eu.visibilityOfElementWait(BUDGET_CODE_FILTER_SEARCH);
		eu.sendKeys(BUDGET_CODE_FILTER_SEARCH, reqNum);
		eu.inVisibilityOfSpinnerIcon();
		eu.SLEEP_2S();
		eu.visibilityOfElementWait(REQUEST_NUMBER_HYPERLINK);
		eu.click(REQUEST_NUMBER_HYPERLINK);
		eu.inVisibilityOfSpinnerIcon();
		eu.visibilityOfElementWait(ADD_APPROVER_BUTTON);
		eu.click(ADD_APPROVER_BUTTON);
		eu.inVisibilityOfSpinnerIcon();
		eu.visibilityOfElementWait(SELECT_APPROVER);
		WebElement addApprover = driver.findElement(SELECT_APPROVER);
		addApprover.click();
		eu.SLEEP_2S();
		String approverName = budgetManagementdto.ApproverName;
		Select sel = new Select(addApprover);
		sel.selectByVisibleText(approverName);
		eu.SLEEP_2S();
		eu.visibilityOfElementWait(ADD_BUTTON);
		eu.click(ADD_BUTTON);
		eu.visibilityOfElementWait(CONFIRM_BUTTON);
		eu.click(CONFIRM_BUTTON);
		eu.visibilityOfElementWait(SUBMIT_BUTTON);
		eu.click(SUBMIT_BUTTON);
		eu.inVisibilityOfSpinnerIcon();

	}

	public void Approver(BudgetManagementDTO budgetManagementdto) throws InterruptedException {

		eu.inVisibilityOfSpinnerIcon();
		eu.visibilityOfElementWait(BUDGET_MENU);
		eu.click(BUDGET_MENU);
		eu.visibilityOfElementWait(BUDGET_MANAGEMENT_DASHBOARD);
		eu.click(BUDGET_MANAGEMENT_DASHBOARD);
		eu.visibilityOfElementWait(APPROVER_VIEW);
		eu.click(APPROVER_VIEW);
		eu.inVisibilityOfSpinnerIcon();
		eu.visibilityOfElementWait(BUDGET_APPROVAL_COUNT);
		eu.click(BUDGET_APPROVAL_COUNT);
		eu.inVisibilityOfSpinnerIcon();
		eu.visibilityOfElementWait(APPROVAL_NUMBER);
		eu.click(APPROVAL_NUMBER);
		eu.visibilityOfElementWait(APPROVAL_NUMBER_FILTER);
		eu.SLEEP_2S();
		eu.click(APPROVAL_NUMBER_FILTER);
		eu.visibilityOfElementWait(APPROVAL_NUMBER_FILTER_SEARCH);
		eu.sendKeys(APPROVAL_NUMBER_FILTER_SEARCH, reqNum);
		eu.SLEEP_2S();
		eu.visibilityOfElementWait(REQUEST_NUMBER_HYPERLINK);
		eu.click(REQUEST_NUMBER_HYPERLINK);
		eu.inVisibilityOfSpinnerIcon();
		eu.visibilityOfElementWait(APPROVAL_REMARKS);
		eu.sendKeys(APPROVAL_REMARKS, budgetManagementdto.ApproverRemarks);
		eu.visibilityOfElementWait(APPROVE_BUTTON);
		eu.click(APPROVE_BUTTON);
		eu.inVisibilityOfSpinnerIcon();

	}

}
