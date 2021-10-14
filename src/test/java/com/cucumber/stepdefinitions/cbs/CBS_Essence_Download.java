package com.cucumber.stepdefinitions.cbs;

import cucumber.api.java.en.Then;

import org.apache.log4j.Logger;
import com.cucumber.listener.Reporter;
import Utilities.CLEAR_User_Function;

public class CBS_Essence_Download {
	
	static Logger log = Logger.getLogger(CBS_Streaming_ClearPC.class.getName());
	
	@Then("^Double Click on Asset document and go to essence tab for cbs$")
	public void Double_Click_on_Asset_document_and_go_to_essence_tab_for_cbs() throws Throwable 
	{
		CBS_ClearPC_Locators.getlocators();
		CLEAR_User_Function.click(CBS_ClearPC_Locators.sort_icon_x);
		CLEAR_User_Function.sleep(2000);
		CLEAR_User_Function.click(CBS_ClearPC_Locators.sort_desc_x);
		Thread.sleep(5000);
		CLEAR_User_Function.click(CBS_ClearPC_Locators.filter_x);
		Thread.sleep(1000);
		CLEAR_User_Function.click(CBS_ClearPC_Locators.document_checkbox_x);
		Thread.sleep(5000);
		CLEAR_User_Function.Doubleclick(CBS_ClearPC_Locators.Asset_thumbnail_x);
		CLEAR_User_Function.sleep(10000);
		CLEAR_User_Function.click(CBS_ClearPC_Locators.Advance_popup_x);
		CLEAR_User_Function.sleep(10000);
		CLEAR_User_Function.click(CBS_ClearPC_Locators.Information_DropDown_X);
		Thread.sleep(8000);
		CLEAR_User_Function.click(CBS_ClearPC_Locators.Essence_tab_X);
		Thread.sleep(3000);
		
	}
	
	@Then("^Click on Download Option$")
	public void click_on_Download_Option() throws Throwable 
	{
		CBS_ClearPC_Locators.getlocators();
		Thread.sleep(3000);
		CLEAR_User_Function.Onhover(CBS_ClearPC_Locators.Three_dots_X);
		Thread.sleep(1000);
		CLEAR_User_Function.click(CBS_ClearPC_Locators.Essence_Download_x);
		Thread.sleep(8000);
		CLEAR_User_Function.sendkeys(CBS_ClearPC_Locators.Confirm_Password_x, CBS_ClearPC_Locators.Prod_pwd_wr_d);
		Thread.sleep(3000);
		CLEAR_User_Function.click(CBS_ClearPC_Locators.Confirm_x);
		CLEAR_User_Function.extentReportScreenShot();
		Reporter.addStepLog("Essence Download is selected");
		log.info("Essence Download is selected");
	}

	@Then("^Validate Essence Download is initiated$")
	public void validate_Essence_Download_is_initiated() throws Throwable 
	{
		Thread.sleep(5000);
		CLEAR_User_Function.Alertisdisplayed(CBS_ClearPC_Locators.Alert_MSG_X);
		CLEAR_User_Function.validateElement(CBS_ClearPC_Locators.Download_initiated_alert_x, "Fetching file for download. Large files may take several minutes to prepare.");
		CLEAR_User_Function.extentReportScreenShot();
		Reporter.addStepLog("Essence Download is initiated");
		log.info("Essence Download is initiated");
		Thread.sleep(2000);
		CLEAR_User_Function.click(CBS_ClearPC_Locators.Asset_Viewer_close);
		Thread.sleep(3000);
	}
}
