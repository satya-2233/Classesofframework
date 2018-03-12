package test.testcases;

import com.thoughtworks.selenium.webdriven.commands.Click;

public class Module2 extends UserLibrary
{
	public static void TC01_WorkExperience_Add_Edit_Delete()
	{
		boolean status;
		enableHighlight();
		
		plog = "Application is up & Running";
		flog = "Unable to open application";
		OpenUrl("http://www.testingmasters.com/hrm/symfony/web/index.php/auth/login");
		
		plog = "Able to enter username";
		flog = "Uable to enter username";
		SetText("//input[@id='txtUsername']", "Ankit");
		
		plog = "Able to enter password";
		flog = "Unable to enter password";
		SetText("//input[@id='txtPassword']", "tmasters5150");
		ClickElement("//input[@id='btnLogin']");
		Exist("//a[@id='welcome']");
		ClickElement("//b[text()='My Info']");
		ClickElement("//a[text()='Qualifications']");
		
//		SetImplicitWait(1);
//		status = Exist("//input[@id='workCheckAll']");
//		System.out.println(status);
//		SetImplicitWait(10);
//		if(status)
//		{
//			ClickElement("//input[@id='workCheckAll']");
//			ClickElement("//input[@id='delWorkExperience']");
//			Exist("//div[contains(text(),'Successfully Deleted')]");
//			Exist("//p[@id='actionWorkExperience']/following-sibling::table//td[text()='No Records Found']");
//		}
//		
//		ClickElement("//input[@id='addWorkExperience']");
//		String CompanyName = "Tmasters_" + getTimeStamp();
//		SetText("//input[@id='experience_employer']", CompanyName);
//		SetText("//input[@id='experience_jobtitle']", "QAE1");
//		SetTextAndEscape("//input[@id='experience_from_date']", "2012-08-25");
//		SetTextAndEscape("//input[@id='experience_to_date']", "2016-08-25");
//		SetText("//textarea[@id='experience_comments']", "Comments");
//		ClickElement("//input[@id='btnWorkExpSave']");
//		Exist("//div[contains(text(),'Successfully Saved')]");
//		Exist("//p[@id='actionWorkExperience']/following-sibling::table//a[text()='" + CompanyName + "']");
//		ClickElement("//p[@id='actionWorkExperience']/following-sibling::table//a[text()='" + CompanyName + "']");
//		String NewCompanyName = "New_" + CompanyName;
//		SetText("//input[@id='experience_employer']", NewCompanyName);
//		ClickElement("//input[@id='btnWorkExpSave']");
//		Exist("//div[contains(text(),'Successfully Saved')]");
//		Exist("//p[@id='actionWorkExperience']/following-sibling::table//a[text()='" + NewCompanyName + "']");
//		ClickElement("//a[text()='" + NewCompanyName + "']/../preceding-sibling::td/input[@type='checkbox']");
//		ClickElement("//input[@id='delWorkExperience']");
//		Exist("//div[contains(text(),'Successfully Deleted')]");
//		ClickElement("//a[@id='welcome']");
//		ClickElement("//a[text()='Logout']");
		
		
	}
}
