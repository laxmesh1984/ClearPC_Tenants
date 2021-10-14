package com.cucumber.stepdefinitions.cbs;

import org.apache.log4j.Logger;

import com.cucumber.listener.Reporter;
import com.cucumber.stepdefinitions.cbs.*;

import Utilities.CLEAR_User_Function;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CBS_Login_Logout_ClearPC {

	static Logger log = Logger.getLogger(CBS_Login_Logout_ClearPC.class.getName());
	
	@Given("^Open Browser and naviagate to the ClearPC portal$")
	public void Open_the_browser_and_navigate_to_the_ClearPC_Portal() throws Throwable {
		CBS_ClearPC_Locators.getlocators();
		CLEAR_User_Function.geturl(CBS_ClearPC_Locators.Prod_PORTAL_d);
		Thread.sleep(5000);		
		CLEAR_User_Function.extentReportScreenShot();
		Reporter.addStepLog("Navigated to Production Login Portal");
		log.info("Navigated to Production Login Portal");
	}

	@When("^Enter the valid user name in username input field$")
	public void enter_the_valid_user_name_in_username_input_field() throws Throwable {
		CLEAR_User_Function.inserttext(CBS_ClearPC_Locators.Prod_User_x,CBS_ClearPC_Locators.Prod_User_d);
		CLEAR_User_Function.extentReportScreenShot();
		Reporter.addStepLog("Valid username is entered in usename field");
		log.info("Valid username is entered in usename field");
	}

	@Then("^Click on Continue button of ClearPC$")
	public void click_on_Continue_button_of_ClearPC() throws Throwable
	{
	    CLEAR_User_Function.click(CBS_ClearPC_Locators.Prod_Continue_button_x);
	    System.out.print("Clicked on Continue button");
	    CLEAR_User_Function.extentReportScreenShot();
		Reporter.addStepLog("Clicked on Continue button");
		log.info("Clicked on Continue button");
	}

	@Then("^Enter the Valid password in the Password input field$")
	public void enter_the_valid_password_in_the_Password_input_field() throws Throwable 
	{
//		 CLEAR_User_Function.waitFor();
//		CLEAR_User_Function.click(CBS_ClearPC_Locators.Prod_Login_x);  
//		CLEAR_User_Function.Isdisplay(CBS_ClearPC_Locators.Password_invalid_x);
//		CLEAR_User_Function.waitFor();
//		CLEAR_User_Function.Isdisplay(CBS_ClearPC_Locators.Copy_Reset_Message_x);
//		CLEAR_User_Function.waitFor();
//		CLEAR_User_Function.click(CBS_ClearPC_Locators.Copy_Reset_close_x); 
		CLEAR_User_Function.waitFor();
		CLEAR_User_Function.inserttext(CBS_ClearPC_Locators.Prod_Password_x,CBS_ClearPC_Locators.Prod_pwd_wr_d);
		CLEAR_User_Function.extentReportScreenShot();
		Reporter.addStepLog("Entered valid password");
		log.info("Entered valid password");
	
	}

	@Then("^Click on Login button of ClearPC$")
	public void click_on_Login_button_of_ClearPC() throws Throwable 
	{
	    CLEAR_User_Function.click(CBS_ClearPC_Locators.Prod_Login_x);
	    CLEAR_User_Function.waitFor();
	    CLEAR_User_Function.extentReportScreenShot();
	    CLEAR_User_Function.waitFor();
	    CLEAR_User_Function.click(CBS_ClearPC_Locators.CBS_LABEL_X);
	    CLEAR_User_Function.waitFor();
	    CLEAR_User_Function.gettext(CBS_ClearPC_Locators.CBS_LABEL_X);	    
	 	Reporter.addStepLog("Clicked on Login button of PC CLEAR tenant");
		log.info("Clicked on Login button of PC CLEAR tenant");
	  }

	

	@Then("^Click on Logout button from ClearPC$")
	public void click_on_Logout_button_from_ClearPC() throws Throwable 
	{
		
		CLEAR_User_Function.waitFor();
		CLEAR_User_Function.click(CBS_ClearPC_Locators.Prod_Username_x);
		CLEAR_User_Function.sleep(4000);
	    CLEAR_User_Function.click(CBS_ClearPC_Locators.Prod_Logout_x);
	    CLEAR_User_Function.waitFor();
	    CLEAR_User_Function.extentReportScreenShot();
		Reporter.addStepLog("Logged out successfully");
		log.info("Logged out successfully");
		Thread.sleep(1000);
	}

	@Then("^Quit the browser for ClearPC$")
	public void quit_the_browser_for_ClearPC() throws Throwable {
		Thread.sleep(2000);
		CLEAR_User_Function.validatevalue(CBS_ClearPC_Locators.Prod_Login_x, "Login");
		CLEAR_User_Function.waitFor();
	    CLEAR_User_Function.quit();
	    Reporter.addStepLog("Browser is closed");
		log.info("Browser is closed");
	    
	}
	
	
}
