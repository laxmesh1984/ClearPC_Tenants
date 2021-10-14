package com.cucumber.stepdefinitions.Turner;


import org.apache.log4j.Logger;
import com.cucumber.listener.Reporter;
import com.cucumber.stepdefinitions.cbs.CBS_ClearPC_Locators;

import Utilities.CLEAR_User_Function;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Turner_HTTPDownload_ClearPC {
	static Logger log = Logger.getLogger(Turner_Streaming_ClearPC.class.getName());
	
	@Then("^Enter test file value in Search field Turner portal$")
	public void Enter_test_file_value_in_Search_field_Turner_portal() throws Throwable {
		Turner_ClearPC_Locators.getlocators();
		CBS_ClearPC_Locators.getlocators();
		CLEAR_User_Function.sendkeys(Turner_ClearPC_Locators.Search_Text_x,"PFTTESTpdf2");
		CLEAR_User_Function.sleep(1000);
		CLEAR_User_Function.extentReportScreenShot();
		Reporter.addStepLog("Text file is entered in search field"); 
		log.info("Text file is entered in search field");
	}
	
	@Then("^Search for test asset Turner portal$")
	public void Search_for_test_asset_Turner_portal() throws Throwable {
		Turner_ClearPC_Locators.getlocators();
		CLEAR_User_Function.clickenter(Turner_ClearPC_Locators.Search_Text_x); 
		CLEAR_User_Function.sleep(1000);
		Thread.sleep(9000);
		Thread.sleep(1000);
		CLEAR_User_Function.extentReportScreenShot();
		Reporter.addStepLog("Searched for an asset");
		log.info("Searched for an asset");
	}
	
	@Then("^Select Download Operation without aspera from dropdown Turner portal$")
	public void Select_Download_Operation_without_aspera_from_dropdown_Turner_portal() throws Throwable 
	{
		CLEAR_User_Function.click(Turner_ClearPC_Locators.Asset_3doticon_x);
		CLEAR_User_Function.sleep(10000);
		CLEAR_User_Function.javaclick(Turner_ClearPC_Locators.Download_x);
		CLEAR_User_Function.sleep(7000);
		CLEAR_User_Function.Alertisdisplayed(CBS_ClearPC_Locators.Alert_MSG_X);
		CLEAR_User_Function.validateElement(Turner_ClearPC_Locators.Download_initiated_alert_x, "Fetching file for download. Large files may take several minutes to prepare.");
		Thread.sleep(200000);
		CLEAR_User_Function.extentReportScreenShot();		
		Thread.sleep(15000);
		CLEAR_User_Function.click(Turner_ClearPC_Locators.Download_tab_x);
		Thread.sleep(5000);
		//CLEAR_User_Function.validatedownloadstatus(Turner_ClearPC_Locators.Download_status_x, "Completed","Failed","Inprogress");
		CLEAR_User_Function.validateElement(Turner_ClearPC_Locators.Download_status_x, "Completed");
		Reporter.addStepLog("Download Operation is initiated from dropdown and file is downloaded successfully");
		log.info("Download Operation is initiated from dropdown and file is downloaded successfully");
		

		
		
	}
}
