package test.testcases;

import org.openqa.selenium.By;

public class Module1 extends UserLibrary
{
	public static void TC01_AddEmergencyContactsAndVerify()
	{	
		boolean status;
		enableTakingScreenshots();
//		enableHighlight();
		
		status = Login(getData("URL"), getData("UserName"), getData("Password"));
		
		plog = "Able to eclik on My Info";
		flog = "Unable to click on My Info";
		ClickElement("//b[text()='My Info']");
		
		plog = "Able to eclik on Personal Details";
		flog = "Unable to click on Personal Details";
		ClickElement("//a[text()='Personal Details']");
		
		plog = "Able to eclik on Edit";
		flog = "Unable to click on Edit";
		ClickElement("//input[@id='btnSave']");
		
		plog = "able to enter FirstName";
		flog = "unable to enter FirstName";
		SetText("//input[@id='personal_txtEmpFirstName']", "Userfirstname");
		
		plog = "able to enter LastName";
		flog = "unable to enter LastName";
		SetText("//input[@id='personal_txtEmpLastName']", "UserLastName");
		
		plog = "able to enter LicExpDate";
		flog = "unable to enter LicExpDate";
		SetTextAndEscape("//input[@id='personal_txtLicExpDate']", "2020-12-29");
		
		plog = "Able to select Marital Status";
		flog = "Unable to select Marital Status";
		ClickElement("//select[@id='personal_cmbMarital']/option[text()='Married']");
		
		plog = "Able to eclik on Save";
		flog = "Unable to click on Save";
		ClickElement("//input[@id='btnSave']");
		
		plog = "Details are Successfully Saved";
		flog = "Unable to Save the details";
		Exist("//div[contains(text(),'Successfully Saved')]");
		
		ClickElement("//a[@id='welcome']");
		plog = "Able to click on Logout";
		flog = "Unable to clik on logout";
		ClickElement("//a[text()='Logout']");
		
		plog = "Logout is successful";
		flog = "Logout is not successful";
		status = Exist("//input[@id='txtUsername']");
	}
	
	public static void TC02_AddDependenciesAndVerify()
	{
		boolean status;
		enableTakingScreenshots();
		enableHighlight();
		
		status = Login(getData("URL"), getData("UserName"), getData("Password"));
		if(status ==false) return;
		
		plog = "Able to eclik on My Info";
		flog = "Unable to click on My Info";
		ClickElement("//b[text()='My Info']");
		
		plog = "Able to click on dependants";
		flog = "Unable to Click on dependants";
		ClickElement("//a[text()='Dependents']");
		
		
		plog = "Able to click on add Button";
		flog = "Unable to click on add button";
		ClickElement("//input[@id='btnAddDependent']");
		
		plog="able to enter name";
		flog="unable toenter name";
	SetText("//input[@id='dependent_name']",getData("Name"));
	
	plog="able to select relationship";
	flog="unable to select relationship";
	ClickElement("//select[@id='dependent_relationshipType']/option[text()='" + getData("Relationship") + "']");
	
	plog="able to select date of birth";
	flog="unable to select date of birth";
	SetTextAndEscape("//input[@id='dependent_dateOfBirth']",getData("DOB"));
		
	disableHighlight();	
	plog="able to save";
	flog="unable to save";
	ClickElement("//input[@value='Save']");
		
	plog="details are successfully saved";
	flog="details are bot successfully saved";
	Exist("//div[contains(text(),'Successfully Saved')]");
	
	
	ClickElement("//a[@id='welcome']");
	plog = "Able to click on Logout";
	flog = "Unable to clik on logout";
	ClickElement("//a[text()='Logout']");
	
	plog = "Logout is successful";
	flog = "Logout is not successful";
	status = Exist("//input[@id='txtUsername']");
		
	}
}
