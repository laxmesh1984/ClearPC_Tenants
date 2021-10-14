package com.cucumber.stepdefinitions.Lionsgate;


import org.apache.log4j.Logger;
import com.cucumber.listener.Reporter;

import Utilities.CLEAR_User_Function;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LG_HTTPDownload_ClearPC {
	static Logger log = Logger.getLogger(LG_Streaming_ClearPC.class.getName());
	
	@Then("^Enter test file value in Search field LG portal$")
	public void enter_test_file_value_in_Search_field_LG_portal() throws Throwable {
		LG_ClearPC_Locators.getlocators();
		CLEAR_User_Function.sendkeys(LG_ClearPC_Locators.Search_Text_x,"PFTTES_Data sample");
		CLEAR_User_Function.sleep(1000);
		CLEAR_User_Function.extentReportScreenShot();
		Reporter.addStepLog("Text file is entered in search field"); 
		log.info("Text file is entered in search field");
	}
	
	@Then("^Search for test asset LG portal$")
	public void search_for_test_asset_LG_portal() throws Throwable {
		LG_ClearPC_Locators.getlocators();
		CLEAR_User_Function.clickenter(LG_ClearPC_Locators.Search_Text_x); 
		CLEAR_User_Function.sleep(1000);
		Thread.sleep(9000);
		Thread.sleep(1000);
		CLEAR_User_Function.extentReportScreenShot();
		Reporter.addStepLog("Searched for an asset");
		log.info("Searched for an asset");
	}
	
	@Then("^Select Download Operation without aspera from dropdown LG portal$")
	public void select_Download_Operation_without_aspera_from_dropdown_LG_portal() throws Throwable {
		CLEAR_User_Function.click(LG_ClearPC_Locators.Asset_3doticon_x);
		CLEAR_User_Function.sleep(10000);
		CLEAR_User_Function.javaclick(LG_ClearPC_Locators.Download_x);
		CLEAR_User_Function.validateElement(LG_ClearPC_Locators.Download_initiated_alert_x, "Fetching file for download. Large files may take several minutes to prepare.");
		Thread.sleep(600000);
		CLEAR_User_Function.extentReportScreenShot();		
		Thread.sleep(10000);
		CLEAR_User_Function.click(LG_ClearPC_Locators.Download_tab_x);
		Thread.sleep(5000);
		CLEAR_User_Function.validateElement(LG_ClearPC_Locators.Download_status_x, "Completed");
		Reporter.addStepLog("Download Operation is initiated from dropdown and file is downloaded successfully");
		log.info("Download Operation is initiated from dropdown and file is downloaded successfully");
		
		
	}
}
