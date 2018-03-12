package test.testcases;

import test.resources.generic.WebLibrary;

/* ######################################################################################################
 * Class Name: UserLib
 * Description: Contains the methods which are used for the common functionalities of the application
 * Author: Ankit Reddy
 * Date Created: 14-Feb-2016
 * ######################################################################################################
 */
public class UserLibrary extends WebLibrary 
{
	/*
	 * ######################################################################################################
	 *  Method Name: Login
	 *  Description: To Login to a HRM Application,Based on UID,Password
	 *  Input Parameters:URL,UID,Password
	 *  Output: True/False 
	 *  Author: Veerendra 
	 *  Date Created:21-Aug-2016
	 * ######################################################################################################
	 */
	public static boolean Login(String URL, String UID, String Password) 
	{
		boolean status;

		plog = "Application is up & Running";
		flog= "Unable to open the application";
		OpenUrl(URL);
		
		plog = "Able to enter username";
		flog = "Unable to enter username";
		SetText("//input[@id='txtUsername']", UID);
		
		plog = "able to enter password";
		flog = "unable to enter password";
		SetText("//input[@id='txtPassword']", Password);
		
		plog = "Able to eclik on login";
		flog = "Unable to click on login";
		ClickElement("//input[@id='btnLogin']");
		
		plog = "Login is successful";
		flog = "LOgin is not successful";
		status = Exist("//a[@id='welcome']"); 
		
		return status;
	}

	public static boolean Logout() 
	{
		Boolean status;
		ClickElement("//a[contains(text(),'Welcome')]");
		status = ClickElement("//a[text()='Logout']");
		if (status)
			LogEventWithScreeshot("info", "Clicked on Logout");
		else
			LogEventWithScreeshot("fail", "Unable to clickon Clicked on Logout");

		status = Exist("//input[@id='txtUsername']");
		if (status)
			LogEventWithScreeshot("pass", "Logout is successful");
		else
			LogEventWithScreeshot("fail", "Logout is Not successful");
		return status;
	}
}
