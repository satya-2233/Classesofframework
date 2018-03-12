package com.otherpak;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import test.testcases.UserLibrary;

public class AmazonLogin extends UserLibrary{
	
	public static void AZN_login(){
		
		OpenUrl(getData("URL"));
		SetText(".//*[@id='txtUsername']", getData("UserName"));
		SetText(".//*[@id='txtPassword']", getData("Password"));
		ClickElement(".//*[@id='btnLogin']");

		
		ClickElement(".//*[@id='menu_leave_viewLeaveModule']/b");
		ClickElement(".//*[@id='menu_leave_viewMyLeaveList']");
		
		///////alll check boxes
		
		List<WebElement> alldwpath=driver.findElements(By.xpath("//input[@type='checkbox']"));
		int checkboxcount=alldwpath.size();
		System.out.println(" count of  check boxes "+checkboxcount);
		String textofCB=driver.findElement(By.xpath("//input[@type='checkbox']")).getAttribute("Value");
		for(int i=0;i<=checkboxcount-1;i++){
			
			if(textofCB.equalsIgnoreCase("Rejected")){
				alldwpath.get(i).click();
				System.out.println("done");
			}
		}
		
	}

}
