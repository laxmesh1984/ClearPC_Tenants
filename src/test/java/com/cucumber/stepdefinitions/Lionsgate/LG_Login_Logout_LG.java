package com.cucumber.stepdefinitions.Lionsgate;

import org.apache.log4j.Logger;

import com.cucumber.listener.Reporter;
import Utilities.CLEAR_User_Function;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LG_Login_Logout_LG {

	static Logger log = Logger.getLogger(LG_Login_Logout_LG.class.getName());
	
	@Given("^Open Browser and naviagate to the LG portal$")
	public void Open_Browser_and_naviagate_to_the_LG_portal() throws Throwable {
		LG_ClearPC_Locators.getlocators();
		CLEAR_User_Function.geturl(LG_ClearPC_Locators.Prod_PORTAL_d);
		CLEAR_User_Function.extentReportScreenShot();
		Reporter.addStepLog("Navigated to Production Login Portal");
		log.info("Navigated to Production Login Portal");
	}

	@When("^Enter the valid user name in username input field LG portal$")
	public void Enter_the_valid_user_name_in_username_input_field_LG_portal() throws Throwable {
		CLEAR_User_Function.inserttext(LG_ClearPC_Locators.Prod_User_x,LG_ClearPC_Locators.Prod_User_d);
		CLEAR_User_Function.extentReportScreenShot();
		Reporter.addStepLog("Valid username is entered in usename field");
		log.info("Valid username is entered in usename field");
	}

	@Then("^Click on Continue button of LG portal$")
	public void Click_on_Continue_button_of_LG_portal() throws Throwable {
	    CLEAR_User_Function.click(LG_ClearPC_Locators.Prod_Continue_button_x);
	    System.out.print("Clicked on Continue button");
	    CLEAR_User_Function.extentReportScreenShot();
		Reporter.addStepLog("Clicked on Continue button");
		log.info("Clicked on Continue button");
	}

	@Then("^Enter the Valid password in the Password input field LG portal$")
	public void Enter_the_Valid_password_in_the_Password_input_field_LG_portal() throws Throwable {
		CLEAR_User_Function.waitFor();
		CLEAR_User_Function.inserttext(LG_ClearPC_Locators.Prod_Password_x,LG_ClearPC_Locators.Prod_pwd_wr_d);
		CLEAR_User_Function.extentReportScreenShot();
		Reporter.addStepLog("Entered valid password");
		log.info("Entered valid password");
	}

	@Then("^Click on Login button of LG portal$")
	public void Click_on_Login_button_of_LG_portal() throws Throwable {
	    CLEAR_User_Function.click(LG_ClearPC_Locators.Prod_Login_x);
	    CLEAR_User_Function.waitFor();
	    CLEAR_User_Function.extentReportScreenShot();
		Reporter.addStepLog("Clicked on Login button of PC CLEAR tenant");
		log.info("Clicked on Login button of PC CLEAR tenant");
	  }

	

	@Then("^Click on Logout button from LG portal$")
	public void Click_on_Logout_button_from_LG_portal() throws Throwable {
		CLEAR_User_Function.waitFor();
		CLEAR_User_Function.click(LG_ClearPC_Locators.Prod_Username_x);
		CLEAR_User_Function.sleep(1000);
	    CLEAR_User_Function.click(LG_ClearPC_Locators.Prod_Logout_x);
	    CLEAR_User_Function.waitFor();
	    CLEAR_User_Function.extentReportScreenShot();
		Reporter.addStepLog("Logged out successfully");
		log.info("Logged out successfully");
		Thread.sleep(1000);
	}

	@Then("^Quit the browser for LG portal$")
	public void Quit_the_browser_for_LG_portal() throws Throwable {
		Thread.sleep(1000);
		CLEAR_User_Function.validatevalue(LG_ClearPC_Locators.Prod_Login_x, "Login");
		CLEAR_User_Function.waitFor();
	    CLEAR_User_Function.quit();
	    Reporter.addStepLog("Browser is closed");
		log.info("Browser is closed");
	    
	}
	
	
}
