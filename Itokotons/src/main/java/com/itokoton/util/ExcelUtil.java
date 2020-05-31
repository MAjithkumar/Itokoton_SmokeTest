package com.itokoton.util;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class ExcelUtil {
	public static Xls_Reader reader;
	private static Constants vendorDetail = new Constants();

	public static ArrayList<Constants> getVendorDetailsFromExcel(String dataFilePath) throws IOException {
		ArrayList<Constants> vendorData = new ArrayList<Constants>();
		try {
			reader = new Xls_Reader(dataFilePath, "VendorInputdatas");
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (int rowNum = 2; rowNum <= reader.getRowCount("VendorInputdatas"); rowNum++) {
			String companyFirstName = Xls_Reader.getCellData("VendorInputdatas", "CompanyFirstName", rowNum);
			String companyLastName = Xls_Reader.getCellData("VendorInputdatas", "CompanyLastName", rowNum);
			String address1 = Xls_Reader.getCellData("VendorInputdatas", "Address1", rowNum);
			String address2 = Xls_Reader.getCellData("VendorInputdatas", "Address2", rowNum);
			String autorizedSignatory = Xls_Reader.getCellData("VendorInputdatas", "AutorizedSignatory", rowNum);
			String autorizedTitle = Xls_Reader.getCellData("VendorInputdatas", "AutorizedTitle", rowNum);
			String telephone = Xls_Reader.getCellData("VendorInputdatas", "Telephone", rowNum);
			String mobile = Xls_Reader.getCellData("VendorInputdatas", "Mobile", rowNum);
			String fax = Xls_Reader.getCellData("VendorInputdatas", "Fax", rowNum);
			String email = Xls_Reader.getCellData("VendorInputdatas", "Email", rowNum);
			String shortName = Xls_Reader.getCellData("VendorInputdatas", "ShortName", rowNum);
			String city = Xls_Reader.getCellData("VendorInputdatas", "City", rowNum);
			String country = Xls_Reader.getCellData("VendorInputdatas", "Country", rowNum);
			String contact = Xls_Reader.getCellData("VendorInputdatas", "Contact", rowNum);
			String accountnumber = Xls_Reader.getCellData("VendorInputdatas", "Accountnumber", rowNum);
			String branch = Xls_Reader.getCellData("VendorInputdatas", "Branch", rowNum);
			String bankAccountCurrency = Xls_Reader.getCellData("VendorInputdatas", "BankAccountCurrency", rowNum);
			String Ibanno = Xls_Reader.getCellData("VendorInputdatas", "Ibanno", rowNum);
			String Bankcity = Xls_Reader.getCellData("VendorInputdatas", "Bankcity", rowNum);
			String Bankname = Xls_Reader.getCellData("VendorInputdatas", "Bankname", rowNum);
			String Swiftcode = Xls_Reader.getCellData("VendorInputdatas", "Swiftcode", rowNum);
			String Bankcountry = Xls_Reader.getCellData("VendorInputdatas", "Bankcountry", rowNum);

			String paymentTerms = Xls_Reader.getCellData("VendorInputdatas", "Paymentterms", rowNum);
			String shippingCondition = Xls_Reader.getCellData("VendorInputdatas", "ShippingCondition", rowNum);
			String vendortype = Xls_Reader.getCellData("VendorInputdatas", "Vendortype", rowNum);
			String paymentCurrency = Xls_Reader.getCellData("VendorInputdatas", "PaymentCurrency", rowNum);
			String plannedDeliveryTime = Xls_Reader.getCellData("VendorInputdatas", "PlannedDeliveryTime", rowNum);
			String purpose = Xls_Reader.getCellData("VendorInputdatas", "Purpose", rowNum);
			String modeofPayment = Xls_Reader.getCellData("VendorInputdatas", "ModeofPayment", rowNum);
			String lCC = Xls_Reader.getCellData("VendorInputdatas", "LCC#", rowNum);
			String vATRegistration = Xls_Reader.getCellData("VendorInputdatas", "VATRegistration", rowNum);
			String incoterms = Xls_Reader.getCellData("VendorInputdatas", "Incoterms", rowNum);
			String vendorCategory = Xls_Reader.getCellData("VendorInputdatas", "VendorCategory", rowNum);
			String vAT = Xls_Reader.getCellData("VendorInputdatas", "VAT", rowNum);
			String attremarks1 = Xls_Reader.getCellData("VendorInputdatas", "Attremarks1", rowNum);
			String attremarks2 = Xls_Reader.getCellData("VendorInputdatas", "Attremarks2", rowNum);
			String attremarks3 = Xls_Reader.getCellData("VendorInputdatas", "Attremarks3", rowNum);
			String attremarks4 = Xls_Reader.getCellData("VendorInputdatas", "Attremarks4", rowNum);
			String attremarks5 = Xls_Reader.getCellData("VendorInputdatas", "Attremarks5", rowNum);
			String attremarks6 = Xls_Reader.getCellData("VendorInputdatas", "Attremarks6", rowNum);
			String legalspecialcomment = Xls_Reader.getCellData("VendorInputdatas", "Legalspecialcomment", rowNum);
			String legalinternalnotes = Xls_Reader.getCellData("VendorInputdatas", "Legalinternalnotes", rowNum);
			String controlspecialcomment = Xls_Reader.getCellData("VendorInputdatas", "Controlspecialcomment", rowNum);
			String controlinternalnotes = Xls_Reader.getCellData("VendorInputdatas", "Controlinternalnotes", rowNum);

			vendorDetail = new Constants();
			vendorDetail.setcompanyFirstName(companyFirstName);
			vendorDetail.setCompanyLastName(companyLastName);
			vendorDetail.setAddress1(address1);
			vendorDetail.setAddress2(address2);
			vendorDetail.setAutorizedSignatory(autorizedSignatory);
			vendorDetail.setAutorizedTitle(autorizedTitle);
			vendorDetail.setTelephone(telephone);
			vendorDetail.setMobile(mobile);
			vendorDetail.setFax(fax);
			vendorDetail.setEmail(email);
			vendorDetail.setShortName(shortName);
			vendorDetail.setCity(city);
			vendorDetail.setCountry(country);
			vendorDetail.setContact(contact);
			vendorDetail.setAccountnumber(accountnumber);
			vendorDetail.setBranch(branch);
			vendorDetail.setBankAccountCurrency(bankAccountCurrency);
			vendorDetail.setIbanno(Ibanno);
			vendorDetail.setBankcity(Bankcity);
			vendorDetail.setBankname(Bankname);
			vendorDetail.setSwiftcode(Swiftcode);
			vendorDetail.setBankcountry(Bankcountry);
			vendorDetail.setPaymentTerms(paymentTerms);
			vendorDetail.setShippingCondition(shippingCondition);
			vendorDetail.setVendortype(vendortype);
			vendorDetail.setPaymentCurrency(paymentCurrency);
			vendorDetail.setPlannedDeliveryTime(plannedDeliveryTime);
			vendorDetail.setPurpose(purpose);
			vendorDetail.setModeofPayment(modeofPayment);
			vendorDetail.setlCC(lCC);
			vendorDetail.setvATRegistration(vATRegistration);
			vendorDetail.setIncoterms(incoterms);
			vendorDetail.setVendorCategory(vendorCategory);
			vendorDetail.setvAT(vAT);
			vendorDetail.setAttremarks1(attremarks1);
			vendorDetail.setAttremarks2(attremarks2);
			vendorDetail.setAttremarks3(attremarks3);
			vendorDetail.setAttremarks4(attremarks4);
			vendorDetail.setAttremarks5(attremarks5);
			vendorDetail.setAttremarks6(attremarks6);
			vendorDetail.setLegalspecialcomment(legalspecialcomment);
			vendorDetail.setLegalinternalnotes(legalinternalnotes);
			vendorDetail.setControlspecialcomment(controlspecialcomment);
			vendorDetail.setControlinternalnotes(controlinternalnotes);

		}
		return vendorData;
	}

}
