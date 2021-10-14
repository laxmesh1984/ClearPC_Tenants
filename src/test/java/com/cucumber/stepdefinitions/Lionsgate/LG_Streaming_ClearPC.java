package com.cucumber.stepdefinitions.Lionsgate;

import org.apache.log4j.Logger;

import com.cucumber.listener.Reporter;

import Utilities.CLEAR_User_Function;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LG_Streaming_ClearPC {

	static Logger log = Logger.getLogger(LG_Streaming_ClearPC.class.getName());

@Then("^Search for the asset LG portal$")
public void Search_for_the_asset_LG_portal() throws Throwable {
	LG_ClearPC_Locators.getlocators();
	CLEAR_User_Function.clickenter(LG_ClearPC_Locators.Search_Text_x); 
	CLEAR_User_Function.sleep(1000);
	Thread.sleep(9000);
	CLEAR_User_Function.click(LG_ClearPC_Locators.Asset_thumbnail_x);
	Thread.sleep(1000);
	CLEAR_User_Function.extentReportScreenShot();
	Reporter.addStepLog("Searched for an asset");
	log.info("Searched for an asset");  
}

@Then("^Validate Advance player functionality LG portal$")
public void Validate_Advance_player_functionality_LG_portal() throws Throwable {
	CLEAR_User_Function.sleep(1000);
	CLEAR_User_Function.click(LG_ClearPC_Locators.Streaming_PreviewPanel_x);
	CLEAR_User_Function.sleep(1000);
	//CLEAR_User_Function.click(ClearPC_Locators.Streaming_PreviewPanel_x);
	Thread.sleep(10000);
	CLEAR_User_Function.extentReportScreenShot();
	Reporter.addStepLog("Streaming is working in Preview Panel");
	log.info("Streaming is working in Preview Panel"); 
	CLEAR_User_Function.sleep(1000);	
	CLEAR_User_Function.sleep(9000);
	CLEAR_User_Function.Onhover(LG_ClearPC_Locators.Asset_displaying_x);
	CLEAR_User_Function.Doubleclick(LG_ClearPC_Locators.Asset_displaying_x);
	Thread.sleep(10000);
	CLEAR_User_Function.Onhover(LG_ClearPC_Locators.Player_playpause_x);
	CLEAR_User_Function.sleep(9000);
	CLEAR_User_Function.click(LG_ClearPC_Locators.Player_playpause_x);
	CLEAR_User_Function.sleep(9000);
	CLEAR_User_Function.click(LG_ClearPC_Locators.Player_slow_x);
	CLEAR_User_Function.sleep(10000);
	CLEAR_User_Function.extentReportScreenShot();
	Reporter.addStepLog("Player and Streaming is validated in Advance pop up");
	log.info("Player and Streaming is validated in Advance pop up");  	
}

@Then("^Validate Information player functionality LG portal$")
public void Validate_Information_player_functionality_LG_portal() throws Throwable {
	CLEAR_User_Function.Onhover(LG_ClearPC_Locators.Advance_popup_x);
	Thread.sleep(5000);
	CLEAR_User_Function.click(LG_ClearPC_Locators.Infor_popup_x);
	Thread.sleep(1000);
	CLEAR_User_Function.Onhover(LG_ClearPC_Locators.Player_playpause_x);
	Thread.sleep(1000);
	CLEAR_User_Function.click(LG_ClearPC_Locators.Player_playpause_x);
	Thread.sleep(1000);
	CLEAR_User_Function.click(LG_ClearPC_Locators.Player_slow_x);
	Thread.sleep(1000);
	CLEAR_User_Function.sleep(10000);
	CLEAR_User_Function.extentReportScreenShot();
	Reporter.addStepLog("Player and Streaming is validated in Information pop up");
	log.info("Player and Streaming is validated in Information pop up");  	
}


@Then("^Validate Editor player functionality LG portal$")
public void Validate_Editor_player_functionality_LG_portal() throws Throwable {
	CLEAR_User_Function.Onhover(LG_ClearPC_Locators.Advance_popup_x);
	Thread.sleep(10000);
	CLEAR_User_Function.click(LG_ClearPC_Locators.Editor_popup_x);
	Thread.sleep(1000);
	CLEAR_User_Function.Onhover(LG_ClearPC_Locators.Editor_player_pause_x);
	Thread.sleep(10000);
	CLEAR_User_Function.click(LG_ClearPC_Locators.Editor_player_stop_x);
	Thread.sleep(10000);
	CLEAR_User_Function.click(LG_ClearPC_Locators.Editor_player_pause_x);
	Thread.sleep(10000);
	CLEAR_User_Function.click(LG_ClearPC_Locators.Editor_playerbinbar_x);
	CLEAR_User_Function.sleep(10000);
	CLEAR_User_Function.click(LG_ClearPC_Locators.Editor_player_close_x);
	CLEAR_User_Function.sleep(5000);
	CLEAR_User_Function.click(LG_ClearPC_Locators.Edior_saveno_x);
	CLEAR_User_Function.extentReportScreenShot();
	Reporter.addStepLog("Player and Streaming is validated in Editor pop up");
	log.info("Player and Streaming is validated in Editor pop up");  	
}
}