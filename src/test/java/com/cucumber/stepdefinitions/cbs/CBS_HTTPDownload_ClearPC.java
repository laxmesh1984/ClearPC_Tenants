package com.cucumber.stepdefinitions.cbs;


import org.apache.log4j.Logger;
import com.cucumber.listener.Reporter;
import com.cucumber.stepdefinitions.Turner.Turner_ClearPC_Locators;

import Utilities.CLEAR_User_Function;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CBS_HTTPDownload_ClearPC {
	static Logger log = Logger.getLogger(CBS_Streaming_ClearPC.class.getName());
	
	@Then("^Enter test file value in Search field$")
	public void Enter_test_file_value_in_Search_field() throws Throwable {
		CBS_ClearPC_Locators.getlocators();
		CLEAR_User_Function.sendkeys(CBS_ClearPC_Locators.Search_Text_x,"PFTTESTpdf2");
		CLEAR_User_Function.sleep(1000);
		CLEAR_User_Function.extentReportScreenShot();
		Reporter.addStepLog("Text file is entered in search field"); 
		log.info("Text file is entered in search field");
	}
	
	@Then("^Search for test asset$")
	public void Search_for_test_asset() throws Throwable {
		CBS_ClearPC_Locators.getlocators();
		CLEAR_User_Function.clickenter(CBS_ClearPC_Locators.Search_Text_x); 
		CLEAR_User_Function.sleep(1000);
		Thread.sleep(9000);
		Thread.sleep(1000);
		CLEAR_User_Function.extentReportScreenShot();
		Reporter.addStepLog("Searched for an asset");
		log.info("Searched for an asset");
	}
	
	@Then("^Select Download Operation without aspera from dropdown$")
	public void Select_Download_Operation_without_aspera_from_dropdown() throws Throwable 
	{
		CLEAR_User_Function.click(CBS_ClearPC_Locators.Asset_3doticon_x);
		CLEAR_User_Function.sleep(10000);
		CLEAR_User_Function.javaclick(CBS_ClearPC_Locators.Download_x);
		CLEAR_User_Function.Alertisdisplayed(CBS_ClearPC_Locators.Alert_MSG_X);
		CLEAR_User_Function.validateElement(CBS_ClearPC_Locators.Download_initiated_alert_x, "Fetching file for download. Large files may take several minutes to prepare.");
		Thread.sleep(10000);
		CLEAR_User_Function.extentReportScreenShot();
		Thread.sleep(25000);
		CLEAR_User_Function.click(CBS_ClearPC_Locators.Download_tab_x);
		Thread.sleep(25000);
		CLEAR_User_Function.click(CBS_ClearPC_Locators.Download_tab_x);
		Thread.sleep(25000);
		CLEAR_User_Function.validateElement(CBS_ClearPC_Locators.Download_status_x, "Completed");
		//CLEAR_User_Function.validateuploadstatus(CBS_ClearPC_Locators.Download_status_x,"Upload Completed","Failed","Inprogress");
		Reporter.addStepLog("Download Operation is initiated from dropdown and file is downloaded successfully");
		log.info("Download Operation is initiated from dropdown and file is downloaded successfully");
		
	}
}
