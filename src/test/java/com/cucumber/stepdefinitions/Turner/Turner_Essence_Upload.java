package com.cucumber.stepdefinitions.Turner;

import cucumber.api.java.en.Then;

import java.time.LocalDate;
import java.util.Calendar;

import org.apache.log4j.Logger;
import org.apache.poi.util.SystemOutLogger;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import com.cucumber.listener.Reporter;
import com.cucumber.stepdefinitions.cbs.*;

import Utilities.CLEAR_User_Function;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.it.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import org.apache.log4j.Logger;

public class Turner_Essence_Upload {

static Logger log = Logger.getLogger(Turner_Streaming_ClearPC.class.getName());

@Then("^Navigate inside test subfolder Turner portal$")
public void Navigate_inside_test_subfolder_Turner_portal() throws Throwable {
	Turner_ClearPC_Locators.getlocators();
	CBS_ClearPC_Locators.getlocators();
	//CLEAR_User_Function.click(Turner_ClearPC_Locators.Turner_Tenent_X);
	Thread.sleep(2000);
	CLEAR_User_Function.Doubleclick(Turner_ClearPC_Locators.Prod_folder_X);
	log.info("folder selected for HTTP UPload");
	Reporter.addStepLog("Searched for an asset");
	CLEAR_User_Function.sleep(5000);
	CLEAR_User_Function.Doubleclick(CBS_ClearPC_Locators.Turner_Move_Folder_x);
	log.info("Automation folder selected for HTTP UPload");
	CLEAR_User_Function.sleep(5000);

}


@Then("^Double Click on Asset and go to essence tab Turner portal$")
public void Double_Click_on_Asset_and_go_to_essence_tab_Turner_portal() throws Throwable 
{
	Turner_ClearPC_Locators.getlocators();
	CBS_ClearPC_Locators.getlocators();
	CLEAR_User_Function.click(Turner_ClearPC_Locators.sort_icon_x);
	CLEAR_User_Function.sleep(2000);
	CLEAR_User_Function.click(Turner_ClearPC_Locators.sort_desc_x);
	Thread.sleep(5000);
	CLEAR_User_Function.click(CBS_ClearPC_Locators.filter_x);
	Thread.sleep(2000);
	CLEAR_User_Function.click(CBS_ClearPC_Locators.image_checkbox_x);
	Thread.sleep(5000);
//	CLEAR_User_Function.click(CBS_ClearPC_Locators.Search_icon_x);
//	CLEAR_User_Function.sleep(1000);
//	CLEAR_User_Function.sendkeys(CBS_ClearPC_Locators.Search_Text_x,CBS_ClearPC_Locators.Search_image_d);
//	Thread.sleep(4000);
	CLEAR_User_Function.Doubleclick(Turner_ClearPC_Locators.Asset_thumbnail_x);
	CLEAR_User_Function.sleep(2000);
	CLEAR_User_Function.click(Turner_ClearPC_Locators.Advance_Btn_X);
	CLEAR_User_Function.sleep(8000);
	CLEAR_User_Function.click(Turner_ClearPC_Locators.Information_DropDown_X);
	Thread.sleep(4000);
	CLEAR_User_Function.click(Turner_ClearPC_Locators.Essence_tab_X);
	Thread.sleep(3000);
	
}

@Then("^Click on Essence reupload Select File and Click Open button Turner portal$")
public void Click_on_Essence_reupload_Select_File_and_Click_Open_button_Turner_portal() throws Throwable {
	

	CLEAR_User_Function.click(Turner_ClearPC_Locators.Three_dots_X);
	Thread.sleep(6000);
	CLEAR_User_Function.click(Turner_ClearPC_Locators.Reupload_X);
	Thread.sleep(4000);
	CLEAR_User_Function.click(Turner_ClearPC_Locators.UPdate_Method_X);
	Thread.sleep(1000);
	CLEAR_User_Function.sendDownArrowkeys(Turner_ClearPC_Locators.UPdate_Method_X);
	Thread.sleep(7000);
	CLEAR_User_Function.click(Turner_ClearPC_Locators.Browse_BTN_X);
	Thread.sleep(4000);
	CLEAR_User_Function.selectFileToUpload(Turner_ClearPC_Locators.Essenceupload_d);
	Thread.sleep(2000);
	CLEAR_User_Function.click(Turner_ClearPC_Locators.REupload_Alert_x);
	CLEAR_User_Function.click(Turner_ClearPC_Locators.Close_POPUP_X);
	Thread.sleep(2000);
	CLEAR_User_Function.Alertisdisplayed(CBS_ClearPC_Locators.Alert_MSG_X);
	
//	String AlertMSG =CLEAR_User_Function.gettext(Turner_ClearPC_Locators.Alert_MSG_X);
//	log.info("AlertMSG is "+AlertMSG);
//	Assert.assertTrue((AlertMSG.contentEquals("Upload initiated successfully.")));
		CLEAR_User_Function.validateElement(CBS_ClearPC_Locators.Alert_MSG_X,"Upload initiated successfully.");
		Thread.sleep(6000);
	
	
	CLEAR_User_Function.click(Turner_ClearPC_Locators.Asset_Viewer_close);	
	
}

	
	

}

