package com.itokoton.util.ExcelUtils.registration;

import java.io.IOException;
import java.util.ArrayList;

import com.itokoton.util.DTO.registration.RegistrationDTO;
import com.itokoton.util.ExcelUtils.Xls_Reader;

public class RegistrationUtil {
	public static Xls_Reader reader;
	private static RegistrationDTO vendorDetail = new RegistrationDTO();

	public static ArrayList<RegistrationDTO> getVendorDetailsFromExcel(String dataFilePath) throws IOException {
		ArrayList<RegistrationDTO> vendorData = new ArrayList<RegistrationDTO>();
		try {
			reader = new Xls_Reader(dataFilePath, "VendorInputData");
		} catch (Exception e) {
			e.printStackTrace();
		}
		for (int rowNum = 2; rowNum <= reader.getRowCount("VendorInputData"); rowNum++) {
			String Username = Xls_Reader.getCellData("VendorInputData", "Username", rowNum);
			String Password = Xls_Reader.getCellData("VendorInputData", "Password", rowNum);
			String CompanyFirstName = Xls_Reader.getCellData("VendorInputData", "CompanyFirstName", rowNum);
			String CompanyLastName = Xls_Reader.getCellData("VendorInputData", "CompanyLastName", rowNum);
			String Address1 = Xls_Reader.getCellData("VendorInputData", "Address1", rowNum);
			String Address2 = Xls_Reader.getCellData("VendorInputData", "Address2", rowNum);
			String AutorizedSignatory = Xls_Reader.getCellData("VendorInputData", "AutorizedSignatory", rowNum);
			String AutorizedTitle = Xls_Reader.getCellData("VendorInputData", "AutorizedTitle", rowNum);
			String Telephone = Xls_Reader.getCellData("VendorInputData", "Telephone", rowNum);
			String Mobile = Xls_Reader.getCellData("VendorInputData", "Mobile", rowNum);
			String Fax = Xls_Reader.getCellData("VendorInputData", "Fax", rowNum);
			String Email = Xls_Reader.getCellData("VendorInputData", "Email", rowNum);
			String ShortName = Xls_Reader.getCellData("VendorInputData", "ShortName", rowNum);
			String City = Xls_Reader.getCellData("VendorInputData", "City", rowNum);
			String Country = Xls_Reader.getCellData("VendorInputData", "Country", rowNum);
			String Contact = Xls_Reader.getCellData("VendorInputData", "Contact", rowNum);
			String Accountnumber = Xls_Reader.getCellData("VendorInputData", "Accountnumber", rowNum);
			String Branch = Xls_Reader.getCellData("VendorInputData", "Branch", rowNum);
			String BankAccountCurrency = Xls_Reader.getCellData("VendorInputData", "BankAccountCurrency", rowNum);
			String Ibanno = Xls_Reader.getCellData("VendorInputData", "Ibanno", rowNum);
			String Bankcity = Xls_Reader.getCellData("VendorInputData", "Bankcity", rowNum);
			String Bankname = Xls_Reader.getCellData("VendorInputData", "Bankname", rowNum);
			String Swiftcode = Xls_Reader.getCellData("VendorInputData", "Swiftcode", rowNum);
			String Bankcountry = Xls_Reader.getCellData("VendorInputData", "Bankcountry", rowNum);
			String Paymentterms = Xls_Reader.getCellData("VendorInputData", "Paymentterms", rowNum);
			String ShippingCondition = Xls_Reader.getCellData("VendorInputData", "ShippingCondition", rowNum);
			String Vendortype = Xls_Reader.getCellData("VendorInputData", "Vendortype", rowNum);
			String PaymentCurrency = Xls_Reader.getCellData("VendorInputData", "PaymentCurrency", rowNum);
			String PlannedDeliveryTime = Xls_Reader.getCellData("VendorInputData", "PlannedDeliveryTime", rowNum);
			String Purpose = Xls_Reader.getCellData("VendorInputData", "Purpose", rowNum);
			String ModeofPayment = Xls_Reader.getCellData("VendorInputData", "ModeofPayment", rowNum);
			String LCC = Xls_Reader.getCellData("VendorInputData", "LCC#", rowNum);
			String VATRegistration = Xls_Reader.getCellData("VendorInputData", "VATRegistration", rowNum);
			String Incoterms = Xls_Reader.getCellData("VendorInputData", "Incoterms", rowNum);
			String VendorCategory = Xls_Reader.getCellData("VendorInputData", "VendorCategory", rowNum);
			String VAT = Xls_Reader.getCellData("VendorInputData", "VAT", rowNum);
			String Attremarks1 = Xls_Reader.getCellData("VendorInputData", "Attremarks1", rowNum);
			String Attremarks2 = Xls_Reader.getCellData("VendorInputData", "Attremarks2", rowNum);
			String Attremarks3 = Xls_Reader.getCellData("VendorInputData", "Attremarks3", rowNum);
			String Attremarks4 = Xls_Reader.getCellData("VendorInputData", "Attremarks4", rowNum);
			String Attremarks5 = Xls_Reader.getCellData("VendorInputData", "Attremarks5", rowNum);
			String Attremarks6 = Xls_Reader.getCellData("VendorInputData", "Attremarks6", rowNum);
			String Legalspecialcomment = Xls_Reader.getCellData("VendorInputData", "Legalspecialcomment", rowNum);
			String Legalinternalnotes = Xls_Reader.getCellData("VendorInputData", "Legalinternalnotes", rowNum);
			String Controlspecialcomment = Xls_Reader.getCellData("VendorInputData", "Controlspecialcomment", rowNum);
			String Controlinternalnotes = Xls_Reader.getCellData("VendorInputData", "Controlinternalnotes", rowNum);

			vendorDetail = new RegistrationDTO();
			vendorDetail.setUsername(Username);
			vendorDetail.setPassword(Password);
			vendorDetail.setCompanyFirstName(CompanyFirstName);
			vendorDetail.setCompanyLastName(CompanyLastName);
			vendorDetail.setAddress1(Address1);
			vendorDetail.setAddress2(Address2);
			vendorDetail.setAutorizedSignatory(AutorizedSignatory);
			vendorDetail.setAutorizedTitle(AutorizedTitle);
			vendorDetail.setTelephone(Telephone);
			vendorDetail.setMobile(Mobile);
			vendorDetail.setFax(Fax);
			vendorDetail.setEmail(Email);
			vendorDetail.setShortName(ShortName);
			vendorDetail.setCity(City);
			vendorDetail.setCountry(Country);
			vendorDetail.setContact(Contact);
			vendorDetail.setAccountnumber(Accountnumber);
			vendorDetail.setBranch(Branch);
			vendorDetail.setBankAccountCurrency(BankAccountCurrency);
			vendorDetail.setIbanno(Ibanno);
			vendorDetail.setBankcity(Bankcity);
			vendorDetail.setBankname(Bankname);
			vendorDetail.setSwiftcode(Swiftcode);
			vendorDetail.setBankcountry(Bankcountry);
			vendorDetail.setPaymentterms(Paymentterms);
			vendorDetail.setShippingCondition(ShippingCondition);
			vendorDetail.setVendortype(Vendortype);
			vendorDetail.setPaymentCurrency(PaymentCurrency);
			vendorDetail.setPlannedDeliveryTime(PlannedDeliveryTime);
			vendorDetail.setPurpose(Purpose);
			vendorDetail.setModeofPayment(ModeofPayment);
			vendorDetail.setLCC(LCC);
			vendorDetail.setVATRegistration(VATRegistration);
			vendorDetail.setIncoterms(Incoterms);
			vendorDetail.setVendorCategory(VendorCategory);
			vendorDetail.setVAT(VAT);
			vendorDetail.setAttremarks1(Attremarks1);
			vendorDetail.setAttremarks2(Attremarks2);
			vendorDetail.setAttremarks3(Attremarks3);
			vendorDetail.setAttremarks4(Attremarks4);
			vendorDetail.setAttremarks5(Attremarks5);
			vendorDetail.setAttremarks6(Attremarks6);
			vendorDetail.setLegalspecialcomment(Legalspecialcomment);
			vendorDetail.setLegalinternalnotes(Legalinternalnotes);
			vendorDetail.setControlspecialcomment(Controlspecialcomment);
			vendorDetail.setControlinternalnotes(Controlinternalnotes);
		}
		return vendorData;
	}

}
