package com.itokoton.pages;

import org.openqa.selenium.By;

public class Pageobjects {
//	Home page
	public static By itokotonDashboard = By.className("logoimage");
	public static By loggedInUserName = By
			.xpath("//table[@id='user-profile-dd']/descendant::tr/descendant::td/descendant::label");

// Registration
	public static By registrationandScreeningMenu = By.linkText("Registration & Screening");
	public static By vendorRegistration = By.linkText("Vendor Registration");

	public static By hqApprovalMenu = By.linkText("HQ Approval");

	public static By vendorCreatebtn = By.xpath("//button[@title='Create Vendor']");
//Company Details
	public static By vendorTogglebutton = By.xpath("//i[@title='Section Toggle']");
	public static By vendorCompanyFirstName = By.xpath(
			"//p-autocomplete[@name='vendorDetail.contactDetails.CompanyName']/descendant::span/descendant::input");
	public static By vendorCompanyLastName = By
			.xpath("//p-autocomplete[@name='vendorDetail.contactDetails.Name']/descendant::span/descendant::input");
	public static By vendorAddress1 = By.xpath("//ndv-edit[@name='Address1']/input");
	public static By vendorAddress2 = By.xpath("//ndv-edit[@name='Address2']/input");
	public static By vendorAuthorizedSignatory = By.xpath("//ndv-edit[@name='AuthorizedSignatory']/input");
	public static By vendorTitle = By.xpath("//ndv-edit[@name='Title']/input");
	public static By vendorTelephone = By.xpath("//ndv-edit[@name='Telephone']/input");
	public static By vendorMobile = By.xpath("//ndv-edit[@name='Mobile']/input");
	public static By vendorFax = By.xpath("//ndv-edit[@name='Fax']/input");
	public static By vendorEmail = By.xpath("//ndv-edit[@name='Email']/input");
	public static By vendorShortName = By.xpath("//ndv-edit[@name='ShortName']/input");
	public static By vendorCity = By.xpath("//ndv-edit[@name='City']/input");
	public static By vendorCountryDropDownMenu = By.xpath("//p-dropdown[@name='companyCountry']/descendant::div");
	public static By vendorCountryInputDropDown = By.xpath(
			"//p-dropdown[@name='companyCountry']/descendant::div/descendant::div/following-sibling::div/following-sibling::div/following-sibling::div/descendant::div/input");
	public static By vendorCountrySelectDropDown = By.xpath(
			"//p-dropdown[@name='companyCountry']/descendant::div/descendant::div/following-sibling::div/following-sibling::div/following-sibling::div/descendant::div/following-sibling::div/ul/li");
	public static By vendorContactPerson = By.xpath("//ndv-edit[@name='ContactPerson']/input");
//Bank Details	
//	public static By vendorNoBankDetailsNow = By.xpath("//ndv-edit[@name='BeneficiaryName']/input");
	public static By vendorBeneficiaryName = By.xpath("//ndv-edit[@name='BeneficiaryName']/input");
	public static By vendorAccountNumber = By.xpath("//ndv-edit[@name='AccountNumber']/input");
	public static By vendorBranch = By.xpath("//ndv-edit[@name='branch']/input");
	public static By vendorBankAccountCurrencyDropDownMenu = By
			.xpath("//label[text()='Bank Account Currency ']/parent::div/descendant::p-dropdown/div");
	public static By vendorBankAccountCurrencyInputDropDown = By.xpath(
			"//label[text()='Bank Account Currency ']/parent::div/descendant::p-dropdown/div/descendant::div/following-sibling::div/descendant::div/input");
	public static By vendorBankAccountCurrencySelectDropDown = By.xpath(
			"//label[text()='Bank Account Currency ']/parent::div/descendant::p-dropdown/div/descendant::div/following-sibling::div/descendant::div/ul/li");
	public static By vendorIBANNO = By.xpath("//ndv-edit[@name='IBAN_Number']/input");
	public static By vendorBankCity = By.xpath("//div[@id='addMoreBankDivHolder']/div[4]/div[2]/ndv-edit/input");
	public static By vendorBankNameDropDownMenu = By
			.xpath("//label[text()='Bank Name ']/parent::div/descendant::p-dropdown/div");
	public static By vendorBankNameInputDropDown = By.xpath(
			"//label[text()='Bank Name ']/parent::div/descendant::p-dropdown/div/descendant::div/following-sibling::div/descendant::div/input");
	public static By vendorBankNameSelectDropDown = By.xpath(
			"//label[text()='Bank Name ']/parent::div/descendant::p-dropdown/div/descendant::div/following-sibling::div/descendant::div/ul/li");
	public static By vendorSwiftCode = By.xpath("//ndv-edit[@name='Swift_Code']/input");

	public static By vendorBankCountryDropDownMenu = By.xpath("//label[text()='Select  Country']/parent::div");
	public static By vendorBankCountryInputDropDown = By.xpath(
			"//label[text()='Select  Country']/parent::div/descendant::div/following-sibling::div/descendant::div/input");
	public static By vendorBankCountrySelectDropDown = By.xpath(
			"//label[text()='Select  Country']/parent::div/descendant::div/following-sibling::div/descendant::div/descendant::ul/descendant::li");

//	Terms & Conditions
	public static By vendorPaymentTermsDropDownMenu = By.xpath("//ndv-select[@name='PaymentTerm']/p-multiselect/div");
	public static By vendorPaymentTermsInputDropDown = By.xpath(
			"//ndv-select[@name='PaymentTerm']/p-multiselect/div/descendant::div/following-sibling::div/descendant::div/following-sibling::div/descendant::input");
	public static By vendorPaymentTermsSelectDropDown = By.xpath(
			"//ndv-select[@name='PaymentTerm']/p-multiselect/div/descendant::div/following-sibling::div/descendant::div/following-sibling::div/descendant::ul");

	public static By vendorShippingConditionsDropDownMenu = By
			.xpath("//ndv-select[@name='ShippingCondition']/p-multiselect/div");
	public static By vendorShippingConditionsInputDropDown = By.xpath(
			"//ndv-select[@name='ShippingCondition']/p-multiselect/div/descendant::div/following-sibling::div/descendant::div/following-sibling::div/descendant::input");
	public static By vendorShippingConditionsSelectDropDown = By.xpath(
			"//ndv-select[@name='ShippingCondition']/p-multiselect/div/descendant::div/following-sibling::div/descendant::div/following-sibling::div/descendant::ul");

	public static By vendorVendorTypeDropDownMenu = By.xpath("//p-dropdown[@name='vendorType']/descendant::div");
	public static By vendorVendorTypeInputDropDown = By.xpath(
			"//p-dropdown[@name='vendorType']/descendant::div/descendant::div/following-sibling::div/following-sibling::div/following-sibling::div/descendant::div/input");
	public static By vendorVendorTypeSelectDropDown = By.xpath(
			"//p-dropdown[@name='vendorType']/descendant::div/descendant::div/following-sibling::div/following-sibling::div/following-sibling::div/descendant::div/following-sibling::div");

	public static By vendorPaymentCurrencyDropDownMenu = By
			.xpath("//p-dropdown[@name='termsCurrency']/descendant::div");
	public static By vendorPaymentCurrencyInputDropDown = By.xpath(
			"//p-dropdown[@name='termsCurrency']/descendant::div/descendant::div/following-sibling::div/following-sibling::div/following-sibling::div/descendant::div/input");
	public static By vendorPaymentCurrencySelectDropDown = By.xpath(
			"//p-dropdown[@name='termsCurrency']/descendant::div/descendant::div/following-sibling::div/following-sibling::div/following-sibling::div/descendant::div/following-sibling::div");

	public static By vendorPlannedDeliveryTime = By.xpath("//ndv-edit[@name='PlannedDeliveryTime']/input");

	public static By vendorPurposeDropDownMenu = By.xpath("//p-dropdown[@name='purpose1']/descendant::div");
	public static By vendorPurposeInputDropDown = By.xpath(
			"//p-dropdown[@name='purpose1']/descendant::div/descendant::div/following-sibling::div/following-sibling::div/following-sibling::div/descendant::div/input");
	public static By vendorPurposeSelectDropDown = By.xpath(
			"//p-dropdown[@name='purpose1']/descendant::div/descendant::div/following-sibling::div/following-sibling::div/following-sibling::div/descendant::div/following-sibling::div");

	public static By vendorModeofPaymentDropDownMenu = By
			.xpath("//ndv-select[@name='ModeOfPayment']/p-multiselect/div");
	public static By vendorModeofPaymentInputDropDown = By.xpath(
			"//ndv-select[@name='ModeOfPayment']/p-multiselect/div/descendant::div/following-sibling::div/descendant::div/following-sibling::div/descendant::input");
	public static By vendorModeofPaymentSelectDropDown = By.xpath(
			"//ndv-select[@name='ModeOfPayment']/p-multiselect/div/descendant::div/following-sibling::div/descendant::div/following-sibling::div/descendant::ul");

	public static By vendorLCC = By.xpath("//ndv-edit[@name='LCCNumber']/input");
	public static By vendorVATRegistration = By.xpath("//ndv-edit[@name='VATRegistrationNumber']/input");

	public static By vendorVendorCategoryDropDownMenu = By
			.xpath("//p-dropdown[@name='vendorCategory']/descendant::div");
	public static By vendorVendorCategoryInputDropDown = By.xpath(
			"//p-dropdown[@name='vendorCategory']/descendant::div/descendant::div/following-sibling::div/following-sibling::div/following-sibling::div/descendant::div/input");
	public static By vendorVendorCategorySelectDropDown = By.xpath(
			"//p-dropdown[@name='vendorCategory']/descendant::div/descendant::div/following-sibling::div/following-sibling::div/following-sibling::div/descendant::div/following-sibling::div");

	public static By vendorVATPercentage = By.xpath("//ndv-edit[@name='VATPercentage']/input");

	public static By vendorIncotermsDropDownMenu = By.xpath("//ndv-select[@name='incomeTerms']/p-multiselect/div");
	public static By vendorIncotermsInputDropDown = By.xpath(
			"//ndv-select[@name='incomeTerms']/p-multiselect/div/descendant::div/following-sibling::div/descendant::div/following-sibling::div/descendant::input");
	public static By vendorIncotermstSelectDropDown = By.xpath(
			"//ndv-select[@name='incomeTerms']/p-multiselect/div/descendant::div/following-sibling::div/descendant::div/following-sibling::div/descendant::ul");

// Attachment Details

	public static By attachmentAccordian = By.xpath("//p-header[text()=' Attachment Detail ']");
	public static By vendorIssueCalendarIcon1 = By.xpath(
			"//div[@title='Trade License / Company Registration']/parent::span/parent::td/following-sibling::td/following-sibling::td/descendant::span/div/ndv-date/p-calendar/span/button");
	public static By vendorIssueDate1 = By.cssSelector(".ui-datepicker-today.ng-star-inserted");
	public static By vendorExpiryCalendarIcon1 = By.xpath(
			"/html/body/app/main/pages/div/div/manageapprovalcomponent/vendorscreening/div[1]/div[2]/p-tabview/div/div/p-tabpanel/div/div[3]/form/div[1]/p-accordion/div/p-accordiontab[4]/div[2]/div/div/div/div/p-datatable/div/div[1]/table/tbody/tr[1]/td[5]/span/div/ndv-date/p-calendar/span/button/span[1]");
	public static By vendorExpiryDate1 = By.cssSelector(".ui-datepicker-today.ng-star-inserted");
	public static By vendorAttachment1 = By.cssSelector(".fa.fa-upload.attachment-icon");

	public static By vendorAttachmentRemarks1 = By.xpath("//ndv-edit[@id='attachmentDetail.Remark']/input");

	public static By vendorIssueCalendarIcon2 = By.xpath(
			"/html/body/app/main/pages/div/div/manageapprovalcomponent/vendorscreening/div[1]/div[2]/p-tabview/div/div/p-tabpanel/div/div[3]/form/div[1]/p-accordion/div/p-accordiontab[4]/div[2]/div/div/div/div/p-datatable/div/div[1]/table/tbody/tr[2]/td[4]/span/div/ndv-date/p-calendar/span/button/span[1]");
	public static By vendorIssueDate2 = By.cssSelector(".ui-datepicker-today.ng-star-inserted");
	public static By vendorExpiryCalendarIcon2 = By.xpath(
			"/html/body/app/main/pages/div/div/manageapprovalcomponent/vendorscreening/div[1]/div[2]/p-tabview/div/div/p-tabpanel/div/div[3]/form/div[1]/p-accordion/div/p-accordiontab[4]/div[2]/div/div/div/div/p-datatable/div/div[1]/table/tbody/tr[2]/td[5]/span/div/ndv-date/p-calendar/span/button/span[1]");
	public static By vendorExpiryDate2 = By.cssSelector(".ui-datepicker-today.ng-star-inserted");
	public static By vendorAttachment2 = By.xpath(
			"/html/body/app/main/pages/div/div/manageapprovalcomponent/vendorscreening/div[1]/div[2]/p-tabview/div/div/p-tabpanel/div/div[3]/form/div[1]/p-accordion/div/p-accordiontab[4]/div[2]/div/div/div/div/p-datatable/div/div[1]/table/tbody/tr[2]/td[6]/span/div/i");

	public static By vendorIssueCalendarIcon3 = By.xpath(
			"/html/body/app/main/pages/div/div/manageapprovalcomponent/vendorscreening/div[1]/div[2]/p-tabview/div/div/p-tabpanel/div/div[3]/form/div[1]/p-accordion/div/p-accordiontab[4]/div[2]/div/div/div/div/p-datatable/div/div[1]/table/tbody/tr[3]/td[4]/span/div/ndv-date/p-calendar/span/button/span[1]");
	public static By vendorIssueDate3 = By.cssSelector(".ui-datepicker-today.ng-star-inserted");
	public static By vendorExpiryCalendarIcon3 = By.xpath(
			"/html/body/app/main/pages/div/div/manageapprovalcomponent/vendorscreening/div[1]/div[2]/p-tabview/div/div/p-tabpanel/div/div[3]/form/div[1]/p-accordion/div/p-accordiontab[4]/div[2]/div/div/div/div/p-datatable/div/div[1]/table/tbody/tr[3]/td[5]/span/div/ndv-date/p-calendar/span/button/span[1]");
	public static By vendorExpiryDate3 = By.cssSelector(".ui-datepicker-today.ng-star-inserted");
	public static By vendorAttachment3 = By.xpath(
			"/html/body/app/main/pages/div/div/manageapprovalcomponent/vendorscreening/div[1]/div[2]/p-tabview/div/div/p-tabpanel/div/div[3]/form/div[1]/p-accordion/div/p-accordiontab[4]/div[2]/div/div/div/div/p-datatable/div/div[1]/table/tbody/tr[3]/td[6]/span/div/i");

// Legal Department Details

	public static By legalDepSpecialComment = By.xpath(
			"//p-editor[@name='lComment']/descendant::div/descendant::div/following-sibling::div/descendant::div/descendant::p");

	public static By legalDepInternalNote = By.xpath(
			"//p-editor[@name='lNote']/descendant::div/descendant::div/following-sibling::div/descendant::div/descendant::p");

	public static By legalDepAttachment1 = By.xpath(
			"/html/body/app/main/pages/div/div/manageapprovalcomponent/vendorscreening/div[1]/div[2]/p-tabview/div/div/p-tabpanel/div/div[3]/form/div[1]/p-accordion/div/p-accordiontab[5]/div[2]/div/div/div/div[3]/div/p-datatable/div/div[1]/table/tbody/tr[1]/td[3]/span/div/i");
	public static By legalDepAttachmentRemarks1 = By.xpath(
			"/html/body/app/main/pages/div/div/manageapprovalcomponent/vendorscreening/div[1]/div[2]/p-tabview/div/div/p-tabpanel/div/div[3]/form/div[1]/p-accordion/div/p-accordiontab[5]/div[2]/div/div/div/div[3]/div/p-datatable/div/div[1]/table/tbody/tr[1]/td[4]/span/div/ndv-edit/input");
	public static By legalDepAttachment2 = By.xpath(
			"/html/body/app/main/pages/div/div/manageapprovalcomponent/vendorscreening/div[1]/div[2]/p-tabview/div/div/p-tabpanel/div/div[3]/form/div[1]/p-accordion/div/p-accordiontab[5]/div[2]/div/div/div/div[3]/div/p-datatable/div/div[1]/table/tbody/tr[2]/td[3]/span/div/i");
	public static By legalDepAttachmentRemarks2 = By.xpath(
			"/html/body/app/main/pages/div/div/manageapprovalcomponent/vendorscreening/div[1]/div[2]/p-tabview/div/div/p-tabpanel/div/div[3]/form/div[1]/p-accordion/div/p-accordiontab[5]/div[2]/div/div/div/div[3]/div/p-datatable/div/div[1]/table/tbody/tr[1]/td[4]/span/div/ndv-edit/input");
// Control Department Details
	public static By controlDepSpecialComment = By.xpath(
			"//p-editor[@name='cComment']/descendant::div/descendant::div/following-sibling::div/descendant::div[1]");

	public static By controlDepInternalNote = By.xpath(
			"//p-editor[@name='cNote']/descendant::div/descendant::div/following-sibling::div/descendant::div[1]");

	public static By controlDepAttachment1 = By.xpath(
			"/html/body/app/main/pages/div/div/manageapprovalcomponent/vendorscreening/div[1]/div[2]/p-tabview/div/div/p-tabpanel/div/div[3]/form/div[1]/p-accordion/div/p-accordiontab[6]/div[2]/div/div/div/div[3]/div/p-datatable/div/div[1]/table/tbody/tr[1]/td[3]/span/div/i");
	public static By controlDepAttachmentRemarks1 = By.xpath(
			"/html/body/app/main/pages/div/div/manageapprovalcomponent/vendorscreening/div[1]/div[2]/p-tabview/div/div/p-tabpanel/div/div[3]/form/div[1]/p-accordion/div/p-accordiontab[6]/div[2]/div/div/div/div[3]/div/p-datatable/div/div[1]/table/tbody/tr[1]/td[4]/span/div/ndv-edit/input");
	public static By controlDepAttachment2 = By.xpath(
			"/html/body/app/main/pages/div/div/manageapprovalcomponent/vendorscreening/div[1]/div[2]/p-tabview/div/div/p-tabpanel/div/div[3]/form/div[1]/p-accordion/div/p-accordiontab[6]/div[2]/div/div/div/div[3]/div/p-datatable/div/div[1]/table/tbody/tr[2]/td[3]/span/div/i");

// My view Page
	public static By myViewScreen = By.xpath("//span[text()='My View']");
	public static By vendorMainDashboardVendorCount = By.xpath(
			"/html/body/app/main/pages/div/div/manageapprovalcomponent/dashboard/div/div/div[3]/div[2]/p-datatable/div/div[1]/table/tbody/tr[4]/td[3]");
	public static By vendorMainDashboardGridRequestNumColFilIcon = By
			.xpath("//span[text()='Request Number']/parent::div/descendant::i");
	public static By vendorMainDashboardGridRequestNumColFilInput = By
			.xpath("//span[text()='Request Number']/parent::div/following-sibling::div/descendant::input");
	public static By vendorMainDashboardGridRequestNumSelectResult = By.xpath(
			"//p-datatable[contains(@class,'masterTable')]/descendant::div/descendant::table/descendant::tr[2]/descendant::td[1]");

// Bottom Buttons
	public static By approvalRemarks = By.name("ApprovalRemark");
	public static By draftButton = By.xpath("//button[@title='Draft']");
	public static By submitButton = By.xpath("//button[text()=' Submit ']");
	public static By addApproverButton = By.xpath("//button[@title='Add Approver']");
	public static By backButton = By.xpath("//button[text()='Back']");

//	Logout
	public static By logoutDownArrowButton = By.xpath("//i[@class='fa fa-caret-down']");
	public static By logoutsignInAsDiffUser = By.xpath("//a[starts-with(.,'Sign-in As Different User')]");

//	Req number generated pop up
	public static By reqNumberPopUp = By.xpath(
			"//div[@id='commonMessageAlert']/descendant::div/descendant::div/descendant::div/descendant::h4[text()='Message From Itokoton']");
	public static By reqNumberGetText = By
			.xpath("//div[@id='commonMessageAlert']/descendant::div/descendant::div/descendant::div/descendant::div");
	public static By reqNumberOKButton = By.xpath(
			"//div[@id='commonMessageAlert']/descendant::div/descendant::div/descendant::div/following-sibling::div/following-sibling::div/descendant::button");
	public static By vendorSearchInput = By.xpath(
			"//p-tabpanel[@header='Vendor Search']/descendant::div/descendant::div/descendant::div/descendant::div/descendant::div/descendant::div/descendant::div/descendant::input[@placeholder='Quick Search']");
	public static By selectVendorReq = By.xpath("//span[@title='View']");

//	Vendor Approval screen
	public static By vendorApprovalTab = By.xpath("//span[text()='Vendor Approval']");
	public static By vendorApprovalSearchInput = By.xpath(
			"//p-tabpanel[@header='Vendor Approval']/descendant::div/descendant::div/descendant::div/descendant::div/descendant::div/descendant::div/descendant::input[@placeholder='Quick Search']");
	public static By holdButton = By.xpath("//button[text()=' Hold ']");
	public static By selectVendorApprovalReq = By.xpath(
			"//p-datatable[@tablestyleclass='VendorApprovalSerach']/descendant::div/descendant::div/descendant::table/descendant::tbody/descendant::tr/descendant::td/descendant::span/descendant::span");
	public static By amendButton = By.xpath("//button[text()=' Amend ']");
	public static By approveButton = By.xpath("//button[text()=' Approve ']");
	public static By amendUpdateButton = By.xpath("//button[text()=' Update ']");

//	Spinner id
	public static By spinnerInvisible = By.id("spin_modal_overlay");

//	HQ Approval screen
	public static By hqApprovalSearchInput = By.xpath("//input[@placeholder='Global Filter']");
	public static By hqApprovalClickCheckBox = By.xpath(
			"/html/body/app/main/pages/div/div/manageapprovalcomponent/changehistoryreport/div/div[3]/div/p-datatable/div/div[1]/table/tbody/tr/td[1]/span/span/p-checkbox/div/div[2]");
	public static By hqApprovalGenerateButton = By.xpath("//button[text()='Generate']");
	public static By hqRemarks = By.id("HQRemarks");
	public static By hqAttachment = By
			.xpath("//label[text()='Attachment']/parent::div/descendant::div/descendant::i[@class='fa fa-upload ']");
	public static By hqReleasePayee = By.xpath("//button[text()='Release Payee']");

}