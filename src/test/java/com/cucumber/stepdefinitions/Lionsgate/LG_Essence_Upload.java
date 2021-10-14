package com.cucumber.stepdefinitions.Lionsgate;

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

public class LG_Essence_Upload {

static Logger log = Logger.getLogger(LG_Streaming_ClearPC.class.getName());



@Then("^Double Click on Asset and go to essence tab LG portal$")
public void Double_Click_on_Asset_and_go_to_essence_tab_LG_portal() throws Throwable {
	LG_ClearPC_Locators.getlocators();
	Thread.sleep(3000);
	CLEAR_User_Function.Doubleclick(LG_ClearPC_Locators.Asset_thumbnail_x);
	CLEAR_User_Function.sleep(2000);
	CLEAR_User_Function.click(LG_ClearPC_Locators.Advance_Btn_X);
	CLEAR_User_Function.sleep(8000);
	CLEAR_User_Function.click(LG_ClearPC_Locators.Information_DropDown_X);
	Thread.sleep(4000);
	CLEAR_User_Function.click(LG_ClearPC_Locators.Essence_tab_X);
	Thread.sleep(3000);
	
}

@Then("^Click on Essence reupload Select File and Click Open button LG portal$")
public void Click_on_Essence_reupload_Select_File_and_Click_Open_button_LG_portal() throws Throwable {
	CLEAR_User_Function.click(LG_ClearPC_Locators.Three_dots_X);
	Thread.sleep(4000);
	CLEAR_User_Function.click(LG_ClearPC_Locators.Reupload_X);
	Thread.sleep(4000);
	CLEAR_User_Function.click(LG_ClearPC_Locators.UPdate_Method_X);
	Thread.sleep(1000);
	CLEAR_User_Function.sendDownArrowkeys(LG_ClearPC_Locators.UPdate_Method_X);
	Thread.sleep(7000);
	CLEAR_User_Function.click(LG_ClearPC_Locators.Browse_BTN_X);
	Thread.sleep(4000);
	CLEAR_User_Function.selectFileToUpload(LG_ClearPC_Locators.Essenceupload_d);
	Thread.sleep(2000);
	CLEAR_User_Function.click(LG_ClearPC_Locators.REupload_Alert_x);
	CLEAR_User_Function.click(LG_ClearPC_Locators.Close_POPUP_X);
	
	String AlertMSG =CLEAR_User_Function.gettext(LG_ClearPC_Locators.Alert_MSG_X);
	log.info("AlertMSG is "+AlertMSG);
	Assert.assertTrue((AlertMSG.contentEquals("Upload initiated successfully.")));
	
	
	CLEAR_User_Function.click(LG_ClearPC_Locators.Asset_Viewer_close);	
	
}

	
	

}

