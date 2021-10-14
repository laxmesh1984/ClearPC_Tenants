package com.cucumber.stepdefinitions.Lionsgate;

import org.apache.log4j.Logger;

import com.cucumber.listener.Reporter;

import Utilities.CLEAR_User_Function;
import cucumber.api.java.en.Then;

public class LG_AddandEditFolder {
	
	static Logger log = Logger.getLogger(LG_AddandEditFolder.class.getName());
	
	@Then("^Navigate to Tenant Project Folder LG portal$")
	public void Navigate_to_Tenant_Project_Folder_LG_portal() throws Throwable {
		LG_ClearPC_Locators.getlocators();
		Thread.sleep(1000);
		CLEAR_User_Function.click(LG_ClearPC_Locators.LG_Tenent_X);
		Thread.sleep(1000);
		CLEAR_User_Function.click(LG_ClearPC_Locators.Supportproject_x);
		Thread.sleep(1000);
		CLEAR_User_Function.extentReportScreenShot();
		Reporter.addStepLog("Navigated to LG Project Folder");
		log.info("Navigated to LG Project Folder");
	    
	}
	
	@Then("^Click on Add Folder icon LG portal$")
	public void Click_on_Add_Folder_icon_LG_portal() throws Throwable {
		CLEAR_User_Function.click(LG_ClearPC_Locators.Add_Folder_x);
		CLEAR_User_Function.sleep(1000);
		CLEAR_User_Function.extentReportScreenShot();
		Reporter.addStepLog("Clicked on Add Folder button");
		log.info("Clicked on Add Folder button");
	    
	}

	@Then("^Enter Title in Add Folder pop up LG portal$")
	public void Enter_Title_in_Add_Folder_pop_up_LG_portal() throws Throwable {
		CLEAR_User_Function.sleep(500);
		CLEAR_User_Function.click(LG_ClearPC_Locators.Add_Folder_Title_x);
		String foldername = CLEAR_User_Function.randomtext(LG_ClearPC_Locators.Add_Folder_Title_x);
		CLEAR_User_Function.Writetofile("Foldername=", "Foldername", foldername);
		CLEAR_User_Function.extentReportScreenShot();
		Reporter.addStepLog("Succesfully entered Folder Name");
		log.info("Succesfully entered Folder Name");	
	    
	}

	@Then("^Validate Folder is Created sucessfully LG portal$")
	public void Validate_Folder_is_Created_sucessfully_LG_portal() throws Throwable {
		CLEAR_User_Function.sleep(500);
		CLEAR_User_Function.click(LG_ClearPC_Locators.Save_Folder_x);
		Thread.sleep(5000);
	    CLEAR_User_Function.validateElement(LG_ClearPC_Locators.Add_Folder_Alert_x, "Folder created successfully");
	    CLEAR_User_Function.extentReportScreenShot();
		Reporter.addStepLog("Folder created successfully");
		log.info("Folder created successfully");	
	}

	@Then("^Validate Newly created folder is searchable LG portal$")
	public void Validate_Newly_created_folder_is_searchable_LG_portal() throws Throwable {
		CLEAR_User_Function.click(LG_ClearPC_Locators.Search_icon_x); 
		CLEAR_User_Function.sleep(1000);
		Thread.sleep(9000);
		CLEAR_User_Function.readfile3(LG_ClearPC_Locators.Search_Text_x,LG_ClearPC_Locators.Asset_displaying_x);
		CLEAR_User_Function.clickenter(LG_ClearPC_Locators.Search_Text_x);
		CLEAR_User_Function.extentReportScreenShot();
		Reporter.addStepLog("Created Folder is seachable");
		log.info("Created Folder is seachable");	
	}

	@Then("^Validate Newly created folder is editable LG portal$")
	public void Validate_Newly_created_folder_is_editable_LG_portal() throws Throwable {
		Thread.sleep(1000);
		CLEAR_User_Function.click(LG_ClearPC_Locators.Asset_3doticon_x);
		CLEAR_User_Function.sleep(1000);
		CLEAR_User_Function.click(LG_ClearPC_Locators.Edit_Folder_x);
		CLEAR_User_Function.sleep(9000);
	    CLEAR_User_Function.sendkeys(LG_ClearPC_Locators.Add_Folder_Title_x, "_Edited1");
	    CLEAR_User_Function.sleep(500);
		CLEAR_User_Function.click(LG_ClearPC_Locators.Save_Folder_x);
		Thread.sleep(1000);
		CLEAR_User_Function.validateElement(LG_ClearPC_Locators.Add_Folder_Alert_x, "Folder updated successfully");
		CLEAR_User_Function.extentReportScreenShot();
		Reporter.addStepLog("Newly Created Folder is editable");
		log.info("Newly Created Folder is editable");	
	}

	@Then("^Validate edited folder is searchable LG portal$")
	public void Validate_edited_folder_is_searchable_LG_portal() throws Throwable {
		Thread.sleep(2000);
		CLEAR_User_Function.click(LG_ClearPC_Locators.Search_icon_x);
		Thread.sleep(2000);
		//CLEAR_User_Function.click(ClearPC_Locators.RemoveText_x); 
		Thread.sleep(10000);
		CLEAR_User_Function.readfile3(LG_ClearPC_Locators.Search_Text_x,LG_ClearPC_Locators.Asset_displaying_x);
		CLEAR_User_Function.clickenter(LG_ClearPC_Locators.Search_Text_x);
		CLEAR_User_Function.extentReportScreenShot();
		Reporter.addStepLog("Newly Created Folder is searchable");
		log.info("Newly Created Folder is searchable");
	}
}
