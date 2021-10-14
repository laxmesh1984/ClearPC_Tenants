package com.cucumber.stepdefinitions.Turner;

import cucumber.api.java.en.Then;

import java.time.LocalDate;
import java.util.Calendar;

import org.apache.log4j.Logger;
import org.apache.poi.util.SystemOutLogger;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import com.cucumber.listener.Reporter;
import com.cucumber.stepdefinitions.*;
import com.cucumber.stepdefinitions.cbs.CBS_ClearPC_Locators;

import Utilities.CLEAR_User_Function;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.it.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import org.apache.log4j.Logger;

public class Turner_Essence_Download {
	
	static Logger log = Logger.getLogger(Turner_Essence_Download.class.getName());
	
	@Then("^Navigate inside test subfolder Turner portal to download$")
	public void Navigate_inside_test_subfolder_Turner_portal_to_download() throws Throwable {
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
	
	@Then("^Click on Download Option Turner portal$")
	public void Click_on_Download_Option_Turner_portal() throws Throwable 
	{
		Turner_ClearPC_Locators.getlocators();
		Thread.sleep(3000);
		CLEAR_User_Function.Onhover(Turner_ClearPC_Locators.Three_dots_X);
		Thread.sleep(1000);
		CLEAR_User_Function.click(Turner_ClearPC_Locators.Essence_Download_x);
		Thread.sleep(8000);
		CLEAR_User_Function.sendkeys(Turner_ClearPC_Locators.Confirm_Password_x, Turner_ClearPC_Locators.Prod_pwd_wr_d);
		Thread.sleep(3000);
		CLEAR_User_Function.click(Turner_ClearPC_Locators.Confirm_x);
		CLEAR_User_Function.extentReportScreenShot();
		Reporter.addStepLog("Essence Download is selected");
		log.info("Essence Download is selected");
	}

	@Then("^Validate Essence Download is initiated Turner portal$")
	public void Validate_Essence_Download_is_initiated_Turner_portal() throws Throwable {
		Thread.sleep(5000);
		CLEAR_User_Function.Alertisdisplayed(CBS_ClearPC_Locators.Alert_MSG_X);
		CLEAR_User_Function.validateElement(Turner_ClearPC_Locators.Download_initiated_alert_x, "Fetching file for download. Large files may take several minutes to prepare.");
		CLEAR_User_Function.extentReportScreenShot();
		Reporter.addStepLog("Essence Download is initiated");
		log.info("Essence Download is initiated");
		Thread.sleep(2000);
		CLEAR_User_Function.click(Turner_ClearPC_Locators.Asset_Viewer_close);
		Thread.sleep(3000);
	}
}
