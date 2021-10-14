package com.cucumber.stepdefinitions.Turner;

import org.apache.log4j.Logger;

import com.cucumber.listener.Reporter;
import com.cucumber.stepdefinitions.cbs.CBS_ClearPC_Locators;

import Utilities.CLEAR_User_Function;
import cucumber.api.java.en.Then;

public class Turner_AddandEditFolder {
	
	static Logger log = Logger.getLogger(Turner_AddandEditFolder.class.getName());
	public String TUR_Folder_Edited;
	public String TUR_Foldername_edited;
	
	@Then("^Navigate to Tenant Project Folder Turner portal$")
	public void Navigate_to_Tenant_Project_Folder_Turner_portal() throws Throwable {
		Turner_ClearPC_Locators.getlocators();
		CBS_ClearPC_Locators.getlocators();
		Thread.sleep(1000);
		//CLEAR_User_Function.click(Turner_ClearPC_Locators.Turner_Tenent_X);
		Thread.sleep(3000);
		CLEAR_User_Function.click(CBS_ClearPC_Locators.Folder_toggle_x);
		Thread.sleep(3000);
		CLEAR_User_Function.click(CBS_ClearPC_Locators.Turner_Move_Folder_x);		
		CLEAR_User_Function.extentReportScreenShot();
		Reporter.addStepLog("Navigated to Turner Project Folder");
		log.info("Navigated to Turner Project Folder");
	    
	}
	
	@Then("^Click on Add Folder icon Turner portal$")
	public void Click_on_Add_Folder_icon_Turner_portal() throws Throwable
	{
		Thread.sleep(20000);
		CLEAR_User_Function.click(Turner_ClearPC_Locators.Add_Folder_x);
		CLEAR_User_Function.sleep(2000);
		CLEAR_User_Function.extentReportScreenShot();
		Reporter.addStepLog("Clicked on Add Folder button");
		log.info("Clicked on Add Folder button");
	    
	}

	@Then("^Enter Title in Add Folder pop up Turner portal$")
	public void Enter_Title_in_Add_Folder_pop_up_Turner_portal() throws Throwable 
	{
		CLEAR_User_Function.sleep(3000);
		CLEAR_User_Function.click(Turner_ClearPC_Locators.Add_Folder_Title_x);
		String TUR_Folder_Edited = CLEAR_User_Function.randomtext(Turner_ClearPC_Locators.Add_Folder_Title_x);
		CLEAR_User_Function.Writetofile("Foldername=", "Foldername", TUR_Folder_Edited);
		CLEAR_User_Function.extentReportScreenShot();
		Reporter.addStepLog("Succesfully entered Folder Name");
		log.info("Succesfully entered Folder Name");	
	    
	}

	@Then("^Validate Folder is Created sucessfully Turner portal$")
	public void Validate_Folder_is_Created_sucessfully_Turner_portal() throws Throwable {
		CLEAR_User_Function.sleep(2000);
		CLEAR_User_Function.click(Turner_ClearPC_Locators.Save_Folder_x);
		Thread.sleep(7000);
		CLEAR_User_Function.Alertisdisplayed(CBS_ClearPC_Locators.Add_Folder_Alert_x);
	    CLEAR_User_Function.validateElement(Turner_ClearPC_Locators.Add_Folder_Alert_x, "Folder created successfully");
	    CLEAR_User_Function.extentReportScreenShot();
		Reporter.addStepLog("Folder created successfully");
		log.info("Folder created successfully");	
	}

	@Then("^Validate Newly created folder is searchable Turner portal$")
	public void Validate_Newly_created_folder_is_searchable_Turner_portal() throws Throwable
	{
		CLEAR_User_Function.sleep(1000);
		CLEAR_User_Function.click(Turner_ClearPC_Locators.Search_icon_x); 
		CLEAR_User_Function.sleep(1000);
		Thread.sleep(10000);
//		CLEAR_User_Function.readfile3(Turner_ClearPC_Locators.Search_Text_x,Turner_ClearPC_Locators.Asset_displaying_x);
//		CLEAR_User_Function.clickenter(Turner_ClearPC_Locators.Search_Text_x);
		String Folder_created = CLEAR_User_Function.getvalue("Foldername");
		//CLEAR_User_Function.readfile3(CBS_ClearPC_Locators.Search_Text_x,CBS_ClearPC_Locators.Asset_displaying_x);
		CLEAR_User_Function.sendkeys(CBS_ClearPC_Locators.Search_Text_x,Folder_created);
		CLEAR_User_Function.clickenter(CBS_ClearPC_Locators.Search_Text_x);
		CLEAR_User_Function.extentReportScreenShot();
		Reporter.addStepLog("Created Folder is seachable");
		log.info("Created Folder is seachable");	
	}

	@Then("^Validate Newly created folder is editable Turner portal$")
	public void Validate_Newly_created_folder_is_editable_Turner_portal() throws Throwable 
	{
		Thread.sleep(3000);
		CLEAR_User_Function.click(Turner_ClearPC_Locators.Asset_3doticon_x);
		CLEAR_User_Function.sleep(1000);
		CLEAR_User_Function.click(Turner_ClearPC_Locators.Edit_Folder_x);
		CLEAR_User_Function.sleep(9000);
	    CLEAR_User_Function.sendkeys(Turner_ClearPC_Locators.Add_Folder_Title_x, "_Edited1");
	    CLEAR_User_Function.sleep(2000);	
		CLEAR_User_Function.click(CBS_ClearPC_Locators.Fodler_path_x);
		CLEAR_User_Function.sleep(2000);
		TUR_Foldername_edited = CLEAR_User_Function.getattributehtml(CBS_ClearPC_Locators.Add_Folder_Title_x);
	     CLEAR_User_Function.Writetofile("Foldername_edited=","Foldername_edited",TUR_Foldername_edited);
	     CLEAR_User_Function.sleep(1000);
	    System.out.println("Folder name is edited " +TUR_Foldername_edited);
	    CLEAR_User_Function.sleep(1000);
		CLEAR_User_Function.click(CBS_ClearPC_Locators.Save_Folder_x);
		Thread.sleep(5000);
		CLEAR_User_Function.Alertisdisplayed(CBS_ClearPC_Locators.Add_Folder_Alert_x);
		CLEAR_User_Function.validateElement(CBS_ClearPC_Locators.Add_Folder_Alert_x,"Folder updated successfully");
		CLEAR_User_Function.extentReportScreenShot();
//	    CLEAR_User_Function.sleep(500);
//		CLEAR_User_Function.click(Turner_ClearPC_Locators.Save_Folder_x);
//		Thread.sleep(1000);
//		CLEAR_User_Function.validateElement(Turner_ClearPC_Locators.Add_Folder_Alert_x, "Folder updated successfully");
//		CLEAR_User_Function.extentReportScreenShot();
//		Reporter.addStepLog("Newly Created Folder is editable");
//		log.info("Newly Created Folder is editable");	
	}

	@Then("^Validate edited folder is searchable Turner portal$")
	public void Validate_edited_folder_is_searchable_Turner_portal() throws Throwable {
		Thread.sleep(2000);
		CLEAR_User_Function.click(Turner_ClearPC_Locators.Search_icon_x);
		Thread.sleep(2000);
		CLEAR_User_Function.click(Turner_ClearPC_Locators.RemoveText_x); 
		Thread.sleep(10000);
		//CLEAR_User_Function.readfile3(Turner_ClearPC_Locators.Search_Text_x,Turner_ClearPC_Locators.Asset_displaying_x);
		CLEAR_User_Function.sendkeys(CBS_ClearPC_Locators.Search_Text_x,TUR_Foldername_edited);
		CLEAR_User_Function.clickenter(Turner_ClearPC_Locators.Search_Text_x);
		CLEAR_User_Function.extentReportScreenShot();
		Thread.sleep(20000);
		CLEAR_User_Function.Isdisplay(CBS_ClearPC_Locators.Folder_edited_x);
		CLEAR_User_Function.validateElement(CBS_ClearPC_Locators.Folder_edited_x,TUR_Foldername_edited);
		Reporter.addStepLog("Newly Created Folder is searchable");
		log.info("Newly Created Folder is searchable");
	}
}
