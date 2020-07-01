package com.itokoton.util.DTO.budgetmanagement;

public class BudgetManagementDTO {

	public String Username;
	public String Password;
	public String GLCode1;
	public String GLAmount1;
	public String GLCode2;
	public String GLAmount2;
	public String ReviewerName;
	public String ReviewerRemarks;
	public String ApproverName;
	public String ApproverRemarks;
	public String BudgetReqNumber;

	public BudgetManagementDTO() {

	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getGLCode1() {
		return GLCode1;
	}

	public void setGLCode1(String gLCode) {
		GLCode1 = gLCode;
	}

	public String getGLAmount1() {
		return GLAmount1;
	}

	public void setGLAmount1(String gLAmount1) {
		GLAmount1 = gLAmount1;
	}

	public String getGLCode2() {
		return GLCode2;
	}

	public void setGLCode2(String gLCode) {
		GLCode2 = gLCode;
	}

	public String getGLAmount2() {
		return GLAmount2;
	}

	public void setGLAmount2(String gLAmount2) {
		GLAmount2 = gLAmount2;
	}

	public String getReviewerName() {
		return ReviewerName;
	}

	public void setReviewerName(String reviewerName) {
		ReviewerName = reviewerName;
	}

	public String getReviewerRemarks() {
		return ReviewerRemarks;
	}

	public void setReviewerRemarks(String reviewerRemarks) {
		ReviewerRemarks = reviewerRemarks;
	}

	public String getApproverName() {
		return ApproverName;
	}

	public void setApproverName(String approverName) {
		ApproverName = approverName;
	}

	public String getApproverRemarks() {
		return ApproverRemarks;
	}

	public void setApproverRemarks(String approverRemarks) {
		ApproverRemarks = approverRemarks;
	}
	
	public String getBudgetReqNumber() {
		return BudgetReqNumber;
	}

	public void setBudgetReqNumber(String budgetReqNumber) {
		BudgetReqNumber = budgetReqNumber;
	}

}
