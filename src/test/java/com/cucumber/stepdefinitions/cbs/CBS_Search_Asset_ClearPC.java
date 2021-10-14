package com.cucumber.stepdefinitions.cbs;

import org.apache.log4j.Logger;

import com.cucumber.listener.Reporter;
import Utilities.CLEAR_User_Function;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CBS_Search_Asset_ClearPC {

	static Logger log = Logger.getLogger(CBS_Search_Asset_ClearPC.class.getName());

@Then("^Click on Search icon$")
public void click_on_Search_icon() throws Throwable {
	CBS_ClearPC_Locators.getlocators();
	Thread.sleep(1000);
	//CLEAR_User_Function.click(CBS_ClearPC_Locators.CBS_LABEL_X);
	Thread.sleep(2000);
	//CLEAR_User_Function.click(CBS_ClearPC_Locators.Supportproject_x);
	Thread.sleep(2000);
	CLEAR_User_Function.click(CBS_ClearPC_Locators.Search_icon_x);
	CLEAR_User_Function.sleep(1000);
	CLEAR_User_Function.extentReportScreenShot();
	Reporter.addStepLog("Clicked on Search icon");
	log.info("Clicked on Search icon");
}

@Then("^Enter text value in Search field$")
public void enter_text_value_in_Search_field() throws Throwable
{
	CLEAR_User_Function.sendkeys(CBS_ClearPC_Locators.Search_Text_x,CBS_ClearPC_Locators.Search_Asset_d);
	CLEAR_User_Function.sleep(10000);
	CLEAR_User_Function.extentReportScreenShot();
	
	CLEAR_User_Function.waitFor();
	CLEAR_User_Function.Isdisplay(CBS_ClearPC_Locators.Search_Autosuggestion2_x);
	CLEAR_User_Function.waitFor();
	CLEAR_User_Function.gettext(CBS_ClearPC_Locators.Search_Autosuggestion2_x);
	CLEAR_User_Function.extentReportScreenShot();
	Reporter.addStepLog("Successfully displayed the Auto suggestion for the search data");
	log.info("Successfully displayed the Auto suggestion for the search data");

}

@Then("^Search for asset$")
public void search_for_asset() throws Throwable {
	CLEAR_User_Function.sleep(9000);
	CLEAR_User_Function.clickenter(CBS_ClearPC_Locators.Search_Text_x); 
	Thread.sleep(9000);
	CLEAR_User_Function.click(CBS_ClearPC_Locators.Asset_thumbnail_x);
	Thread.sleep(1000);
	String CFN= CLEAR_User_Function.gettext(CBS_ClearPC_Locators.Asset_title_x);
	System.out.println("Value of CFN: " + CFN);  
	CLEAR_User_Function.extentReportScreenShot();
	Reporter.addStepLog("Searched for an asset");
	log.info("Searched for an asset");  
}



@Then("^Validate Search asset is displaying correctly$")
public void validate_Search_asset_is_displaying_correctly() throws Throwable {
	CLEAR_User_Function.sleep(9000);
	String s = CLEAR_User_Function.gettext(CBS_ClearPC_Locators.Asset_title_x);
	String p = s.substring(0,12);
	System.out.println("Value of Asset Title: " + p); 
	log.info("Searching asset and displayed assets are same.");
	CLEAR_User_Function.extentReportScreenShot();
	Reporter.addStepLog("Search asset is displaying correctly");
	log.info("Searched asset is displaying correctly"); 
}

@Then("^Select Download Operation from dropdown for CBS Tenant$")
public void select_Download_Operation_from_dropdown_for_CBS_Tenant() throws Throwable {
	CLEAR_User_Function.click(CBS_ClearPC_Locators.Asset_3doticon_x);
	CLEAR_User_Function.sleep(10000);
	CLEAR_User_Function.javaclick(CBS_ClearPC_Locators.Download_x);
	CLEAR_User_Function.validateElement(CBS_ClearPC_Locators.Download_initiated_alert_x, "Fetching file for download. Large files may take several minutes to prepare.");
	//CLEAR_User_Function.AcceptAsperaPopup();
	CLEAR_User_Function.extentReportScreenShot();
	Reporter.addStepLog("Download Operation is initiated from dropdown");
	log.info("Download Operation is initiated from dropdown");
}

@Then("^Validate Downloaded filename is correct or not for CBS Tenant$")
public void validate_Downloaded_filename_is_correct_or_not_for_CBS_Tenant() throws Throwable {
	CLEAR_User_Function.EnterkeyforAsperaPopup();
	//CLEAR_User_Function.isFileDownloaded("C:\\Users\\amruthesh.girirao\\Downloads","check aspera.mp4");
}
    
    
}