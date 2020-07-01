package com.itokoton.util.ExcelUtils.budgetmanagement;

import java.io.IOException;
import java.util.ArrayList;

import com.itokoton.util.DTO.budgetmanagement.BudgetManagementDTO;
import com.itokoton.util.ExcelUtils.Xls_Reader;

public class BudgetmanagementUtil {
	public static Xls_Reader reader;
//	public static ArrayList<BudgetManagementDTO> budgetcreationdata = new ArrayList<BudgetManagementDTO>();

	public static ArrayList<BudgetManagementDTO> getbudgetcreationDetailsFromExcel(String dataFilePath)
			throws IOException {
		
		ArrayList<BudgetManagementDTO> budgetcreationDatas = new ArrayList<BudgetManagementDTO>();
		try {
			reader = new Xls_Reader(dataFilePath, "BudgetCreationInputData");
		} catch (Exception e) {
			e.printStackTrace();
		
		}
		for (int rowNum = 2; rowNum <= reader.getRowCount("BudgetCreationInputData"); rowNum++) {
			BudgetManagementDTO budgetcreationDetail = new BudgetManagementDTO();
			String Username = Xls_Reader.getCellData("BudgetCreationInputData", "Username", rowNum);
			String Password = Xls_Reader.getCellData("BudgetCreationInputData", "Password", rowNum);
			String GLCode1 = Xls_Reader.getCellData("BudgetCreationInputData", "GLCode1", rowNum);
			String GLAmount1 = Xls_Reader.getCellData("BudgetCreationInputData", "GLAmount1", rowNum);
			String GLCode2 = Xls_Reader.getCellData("BudgetCreationInputData", "GLCode2", rowNum);
			String GLAmount2 = Xls_Reader.getCellData("BudgetCreationInputData", "GLAmount2", rowNum);
			String ReviewerName = Xls_Reader.getCellData("BudgetCreationInputData", "ReviewerName", rowNum);
			String ReviewerRemarks = Xls_Reader.getCellData("BudgetCreationInputData", "ReviewerRemarks", rowNum);
			String ApproverName = Xls_Reader.getCellData("BudgetCreationInputData", "ApproverName", rowNum);
			String ApproverRemarks = Xls_Reader.getCellData("BudgetCreationInputData", "ApproverRemarks", rowNum);
			String BudgetReqNumber = Xls_Reader.getCellData("BudgetCreationInputData", "BudgetReqNumber", rowNum);

			budgetcreationDetail = new BudgetManagementDTO();
			budgetcreationDetail.setUsername(Username);
			budgetcreationDetail.setPassword(Password);
			budgetcreationDetail.setGLCode1(GLCode1);
			budgetcreationDetail.setGLAmount1(GLAmount1);
			budgetcreationDetail.setGLCode2(GLCode2);
			budgetcreationDetail.setGLAmount2(GLAmount2);
			budgetcreationDetail.setReviewerName(ReviewerName);
			budgetcreationDetail.setReviewerRemarks(ReviewerRemarks);
			budgetcreationDetail.setApproverName(ApproverName);
			budgetcreationDetail.setApproverRemarks(ApproverRemarks);
			budgetcreationDetail.setBudgetReqNumber(BudgetReqNumber);
			budgetcreationDatas.add(budgetcreationDetail);
			

		}
		
		return budgetcreationDatas;
		
	}

}
