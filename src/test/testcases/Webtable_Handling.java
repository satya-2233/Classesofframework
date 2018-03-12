package test.testcases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Webtable_Handling extends UserLibrary {
	
	public static boolean webtable() {
		
		boolean status=true;
		plog = "Application is up & Running";
		flog = "Unable to open application";
		OpenUrl(getData("URL"));
		
		//OpenUrl("http://www.testingmasters.com/hrm/symfony/web/index.php/auth/login");
		
		plog = "Able to enter username";
		flog = "Uable to enter username";
		SetText("//input[@id='txtUsername']",getData("UserName"));
		
		plog = "Able to enter password";
		flog = "Unable to enter password";
		SetText("//input[@id='txtPassword']", getData("Password"));
		
		ClickElement("//input[@id='btnLogin']");
		
		ClickElement(".//*[@id='menu_leave_viewLeaveModule']/b");
		
		ClickElement(".//*[@id='menu_leave_viewMyLeaveList']");
		
		List<WebElement> CheckBox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		int checkboxcount=CheckBox.size();
		System.out.println(" Nmber of checkboxes ::  "+checkboxcount);
		
		for(int i=0;i<=checkboxcount-1;i++){
			
		String textofcheckbox=CheckBox.get(i).getAttribute("value");
		//	String textofcheckbox=driver.findElement(By.xpath(".//*[@id='leaveList_chkSearchFilter_checkboxgroup']")).getAttribute("leaveList[chkSearchFilter][]");
			wait(5);
			System.out.println(" matched value of checkbox:  "+textofcheckbox);
			if( textofcheckbox.equalsIgnoreCase(getData("Nameofcheckbox"))){
				CheckBox.get(i).click();
				
			}
		}
		
		return status;
		
	}

}
