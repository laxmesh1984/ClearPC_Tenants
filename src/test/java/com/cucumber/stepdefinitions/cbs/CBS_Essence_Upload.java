package com.cucumber.stepdefinitions.cbs;

import cucumber.api.java.en.Then;

import org.apache.log4j.Logger;
import Utilities.CLEAR_User_Function;

public class CBS_Essence_Upload {

static Logger log = Logger.getLogger(CBS_Streaming_ClearPC.class.getName());



@Then("^Double Click on Asset and go to essence tab for cbs$")
public void Double_Click_on_Asset_and_go_to_essence_tab_for_cbs() throws Throwable 
{
	CBS_ClearPC_Locators.getlocators();
	CLEAR_User_Function.click(CBS_ClearPC_Locators.sort_icon_x);
	CLEAR_User_Function.sleep(2000);
	CLEAR_User_Function.click(CBS_ClearPC_Locators.sort_desc_x);
	Thread.sleep(5000);
	CLEAR_User_Function.click(CBS_ClearPC_Locators.filter_x);
	Thread.sleep(1000);
	CLEAR_User_Function.click(CBS_ClearPC_Locators.image_checkbox_x);
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

@Then("^Click on Essence reupload Select File and Click Open button for cbs$")
public void click_on_Essence_reupload_Select_File_and_Click_Open_button_for_cbs() throws Throwable {
	CLEAR_User_Function.click(CBS_ClearPC_Locators.Three_dots_X);
	Thread.sleep(4000);
	CLEAR_User_Function.click(CBS_ClearPC_Locators.Reupload_X);
	Thread.sleep(4000);
	CLEAR_User_Function.click(CBS_ClearPC_Locators.UPdate_Method_X);
	Thread.sleep(1000);
	CLEAR_User_Function.sendDownArrowkeys(CBS_ClearPC_Locators.UPdate_Method_X);
	Thread.sleep(7000);
	CLEAR_User_Function.click(CBS_ClearPC_Locators.Browse_BTN_X);
	Thread.sleep(4000);
	CLEAR_User_Function.selectFileToUpload(CBS_ClearPC_Locators.Essenceupload_d);
	Thread.sleep(2000);
	CLEAR_User_Function.click(CBS_ClearPC_Locators.REupload_Alert_x);
	Thread.sleep(1000);
	CLEAR_User_Function.click(CBS_ClearPC_Locators.Close_POPUP_X);
	Thread.sleep(1000);
	CLEAR_User_Function.Alertisdisplayed(CBS_ClearPC_Locators.Alert_MSG_X);
//	String AlertMSG =CLEAR_User_Function.gettext(CBS_ClearPC_Locators.Alert_MSG_X);
//	log.info("AlertMSG is "+AlertMSG);
//	Assert.assertTrue((AlertMSG.contentEquals("Upload initiated successfully.")));
	//Thread.sleep(2000);
	CLEAR_User_Function.validateElement(CBS_ClearPC_Locators.Alert_MSG_X,"Upload initiated successfully.");
	Thread.sleep(6000);	
	CLEAR_User_Function.click(CBS_ClearPC_Locators.Asset_Viewer_close);	
	
}

	
	

}

