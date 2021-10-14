package com.cucumber.stepdefinitions.Turner;

import org.apache.log4j.Logger;

import com.cucumber.listener.Reporter;
import com.cucumber.stepdefinitions.Turner.Turner_ClearPC_Locators;
import com.cucumber.stepdefinitions.Turner.Turner_Streaming_ClearPC;

import Utilities.CLEAR_User_Function;
import cucumber.api.java.en.Then;

public class Turner_Upload_File_Rename_Delete 
{
	static Logger log = Logger.getLogger(Turner_Streaming_ClearPC.class.getName());
	
	

	@Then("^Click on three dots icon on the thumbnail Turner portal$")
	public void Click_on_three_dots_icon_on_the_thumbnail_Turner_portal() throws Throwable 
	{
		
		Thread.sleep(2000);
		CLEAR_User_Function.click(Turner_ClearPC_Locators.Asset_3doticon_x);
		
	 
	}

	@Then("^Click on delete button from down Turner portal$")
	public void Click_on_delete_button_from_down_Turner_portal() throws Throwable 
	{
		Thread.sleep(2000);
		CLEAR_User_Function.scrollToWebElement(Turner_ClearPC_Locators.Delete_x);
		Thread.sleep(2000);
		CLEAR_User_Function.click(Turner_ClearPC_Locators.Delete_x);
		Thread.sleep(1000);
		//CLEAR_User_Function.click(Turner_ClearPC_Locators.Paste_Alert_x);
		CLEAR_User_Function.PopUpExists(Turner_ClearPC_Locators.Alert_popup_x,Turner_ClearPC_Locators.Yes_Alert_x);		
		Thread.sleep(1000);
		CLEAR_User_Function.validateElement(Turner_ClearPC_Locators.Add_Folder_Alert_x,"File(s) deleted successfully");
		Thread.sleep(6000);
		CLEAR_User_Function.click(Turner_ClearPC_Locators.Search_icon_x);
		Thread.sleep(2000);
		CLEAR_User_Function.clear(Turner_ClearPC_Locators.Search_Text_x);
		Thread.sleep(2000);	
		CLEAR_User_Function.inserttext(Turner_ClearPC_Locators.Search_Text_x, Turner_ClearPC_Locators.Search_file_d);
		Thread.sleep(1000);
		CLEAR_User_Function.clickenter(Turner_ClearPC_Locators.Search_Text_x);
		Thread.sleep(2000);
		CLEAR_User_Function.validateElement(Turner_ClearPC_Locators.Search_results_x,"No results found for given search criteria.");
		Thread.sleep(1000);
	}
	
	@Then("^Search for uploaded asset Turner portal$")
	public void Search_for_uploaded_asset_Turner_portal() throws Throwable 
	{
		CLEAR_User_Function.sleep(9000);
		CLEAR_User_Function.inserttext(Turner_ClearPC_Locators.Search_Text_x, Turner_ClearPC_Locators.Search_file_d);
		Thread.sleep(2000);
		CLEAR_User_Function.clickenter(Turner_ClearPC_Locators.Search_Text_x); 
		Thread.sleep(9000);
		CLEAR_User_Function.extentReportScreenShot();
		Reporter.addStepLog("Searched for an asset");
		log.info("Searched for an asset");  
	}

}
