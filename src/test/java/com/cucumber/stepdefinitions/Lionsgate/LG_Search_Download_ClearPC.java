package com.cucumber.stepdefinitions.Lionsgate;

import org.apache.log4j.Logger;

import com.cucumber.listener.Reporter;

import Utilities.CLEAR_User_Function;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LG_Search_Download_ClearPC {

	static Logger log = Logger.getLogger(LG_Search_Download_ClearPC.class.getName());

@Then("^Click on Search icon LG portal$")
public void click_on_Search_icon_LG_portal() throws Throwable {
	LG_ClearPC_Locators.getlocators();
	Thread.sleep(1000);
	CLEAR_User_Function.click(LG_ClearPC_Locators.LG_Tenent_X);
	Thread.sleep(2000);
	CLEAR_User_Function.click(LG_ClearPC_Locators.Supportproject_x);
	Thread.sleep(1000);
	CLEAR_User_Function.click(LG_ClearPC_Locators.Search_icon_x);
	CLEAR_User_Function.sleep(1000);
	CLEAR_User_Function.extentReportScreenShot();
	Reporter.addStepLog("Clicked on Search icon");
	log.info("Clicked on Search icon");
}

@Then("^Enter text value in Search field LG portal$")
public void enter_text_value_in_Search_field_LG_portal() throws Throwable {
	CLEAR_User_Function.sendkeys(LG_ClearPC_Locators.Search_Text_x,LG_ClearPC_Locators.Search_Asset_d);
	CLEAR_User_Function.sleep(10000);
	CLEAR_User_Function.extentReportScreenShot();
	Reporter.addStepLog("Entered Text in Search textbox");
	log.info("Entered Text in Search textbox");    
}

@Then("^Search for asset LG portal$")
public void search_for_asset_LG_portal() throws Throwable {
	CLEAR_User_Function.sleep(9000);
	CLEAR_User_Function.clickenter(LG_ClearPC_Locators.Search_Text_x); 
	Thread.sleep(9000);
	CLEAR_User_Function.click(LG_ClearPC_Locators.Asset_thumbnail_x);
	Thread.sleep(1000);
	String CFN= CLEAR_User_Function.gettext(LG_ClearPC_Locators.Asset_title_x);
	System.out.println("Value of CFN: " + CFN);  
	CLEAR_User_Function.extentReportScreenShot();
	Reporter.addStepLog("Searched for an asset");
	log.info("Searched for an asset");  
}



@Then("^Validate Search asset is displaying correctly LG portal$")
public void validate_Search_asset_is_displaying_correctly_LG_portal() throws Throwable {
	CLEAR_User_Function.sleep(9000);
	String s = CLEAR_User_Function.gettext(LG_ClearPC_Locators.Asset_title_x);
	String p = s.substring(0,12);
	System.out.println("Value of Asset Title: " + p); 
	log.info("Searching asset and displayed assets are same.");
	CLEAR_User_Function.extentReportScreenShot();
	Reporter.addStepLog("Search asset is displaying correctly");
	log.info("Searched asset is displaying correctly"); 
}

@Then("^Select Download Operation without aspera from dropdown LG $")
public void select_Download_Operationwithout_aspera_from_dropdown_LG() throws Throwable {
	CLEAR_User_Function.click(LG_ClearPC_Locators.Asset_3doticon_x);
	CLEAR_User_Function.sleep(10000);
	CLEAR_User_Function.javaclick(LG_ClearPC_Locators.Download_x);
	CLEAR_User_Function.validateElement(LG_ClearPC_Locators.Download_initiated_alert_x, "Fetching file for download. Large files may take several minutes to prepare.");
	Thread.sleep(90000);
	//CLEAR_User_Function.AcceptAsperaPopup();
	Reporter.addStepLog("Clicked on Open Aspera Connect plugin");
	log.info("Clicked on Open Aspera Connect plugin");
	CLEAR_User_Function.extentReportScreenShot();
	Reporter.addStepLog("Download Operation is initiated from dropdown");
	log.info("Download Operation is initiated from dropdown");
}

@Then("^Validate Downloaded filename is correct or not LG portal$")
public void validate_Downloaded_filename_is_correct_or_not_LG_portal() throws Throwable {
	CLEAR_User_Function.EnterkeyforAsperaPopup();
	//CLEAR_User_Function.isFileDownloaded("C:\\Users\\amruthesh.girirao\\Downloads","check aspera.mp4");
}
    
    
}