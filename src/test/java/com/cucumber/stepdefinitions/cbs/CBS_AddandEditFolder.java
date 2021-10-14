package com.cucumber.stepdefinitions.cbs;

import org.apache.log4j.Logger;

import com.cucumber.listener.Reporter;

import Utilities.CLEAR_User_Function;
import cucumber.api.java.en.Then;
import com.cucumber.stepdefinitions.cbs.CBS_ClearPC_Locators;;

public class CBS_AddandEditFolder {
	
	static Logger log = Logger.getLogger(CBS_AddandEditFolder.class.getName());
	public String Folder_Edited;
	public String Foldername_edited;
	
	@Then("^Navigate to Tenant Project Folder$")
	public void Navigate_to_Tenant_Project_Folder() throws Throwable {
		CBS_ClearPC_Locators.getlocators();
		Thread.sleep(1000);
		//CLEAR_User_Function.click(CBS_ClearPC_Locators.CBS_LABEL_X);
		Thread.sleep(1000);
		///CLEAR_User_Function.click(CBS_ClearPC_Locators.Supportproject_x);
		Thread.sleep(3000);
		CLEAR_User_Function.click(CBS_ClearPC_Locators.Folder_toggle_x);
		Thread.sleep(3000);
		CLEAR_User_Function.click(CBS_ClearPC_Locators.folder_From_X);
		CLEAR_User_Function.extentReportScreenShot();
		Reporter.addStepLog("Navigated to CBS Project Folder");
		log.info("Navigated to CBS Project Folder");
	    
	}
	
	@Then("^Click on Add Folder icon$")
	public void click_on_Add_Folder_icon() throws Throwable 
	{
		CLEAR_User_Function.sleep(15000);
		CLEAR_User_Function.click(CBS_ClearPC_Locators.Add_Folder_x);
		CLEAR_User_Function.sleep(2000);
		CLEAR_User_Function.extentReportScreenShot();
		Reporter.addStepLog("Clicked on Add Folder button");
		log.info("Clicked on Add Folder button");
	    
	}

	@Then("^Enter Title in Add Folder pop up$")
	public void enter_Title_in_Add_Folder_pop_up() throws Throwable 
	{
		CLEAR_User_Function.sleep(3000);
		CLEAR_User_Function.click(CBS_ClearPC_Locators.Add_Folder_Title_x);
		String foldername = CLEAR_User_Function.randomtext(CBS_ClearPC_Locators.Add_Folder_Title_x);
		CLEAR_User_Function.Writetofile("Foldername=","Foldername",foldername);
		CLEAR_User_Function.extentReportScreenShot();
		Reporter.addStepLog("Succesfully entered Folder Name");
		log.info("Succesfully entered Folder Name");	
	    
	}

	@Then("^Validate Folder is Created sucessfully$")
	public void validate_Folder_is_Created_sucessfully() throws Throwable
	{
		CLEAR_User_Function.sleep(2000);
		CLEAR_User_Function.click(CBS_ClearPC_Locators.Save_Folder_x);
		Thread.sleep(8000);
		CLEAR_User_Function.Alertisdisplayed(CBS_ClearPC_Locators.Add_Folder_Alert_x);
	    CLEAR_User_Function.validateElement(CBS_ClearPC_Locators.Add_Folder_Alert_x, "Folder created successfully");
	    CLEAR_User_Function.extentReportScreenShot();
		Reporter.addStepLog("Folder created successfully");
		log.info("Folder created successfully");	
	}

	@Then("^Validate Newly created folder is searchable$")
	public void validate_Newly_created_folder_is_searchable() throws Throwable 
	{
		CLEAR_User_Function.sleep(6000);
		CLEAR_User_Function.click(CBS_ClearPC_Locators.Search_icon_x); 
		CLEAR_User_Function.sleep(1000);
		Thread.sleep(9000);
		String Folder_created = CLEAR_User_Function.getvalue("Foldername");
		//CLEAR_User_Function.readfile3(CBS_ClearPC_Locators.Search_Text_x,CBS_ClearPC_Locators.Asset_displaying_x);
		CLEAR_User_Function.sendkeys(CBS_ClearPC_Locators.Search_Text_x,Folder_created);
		CLEAR_User_Function.clickenter(CBS_ClearPC_Locators.Search_Text_x);
		CLEAR_User_Function.extentReportScreenShot();
		Reporter.addStepLog("Created Folder is seachable");
		log.info("Created Folder is seachable");	
	}

	@Then("^Validate Newly created folder is editable$")
	public void validate_Newly_created_folder_is_editable() throws Throwable
	{
		CLEAR_User_Function.sleep(20000);
		CLEAR_User_Function.click(CBS_ClearPC_Locators.Asset_3doticon_x);
		CLEAR_User_Function.sleep(1000);
		CLEAR_User_Function.click(CBS_ClearPC_Locators.Edit_Folder_x);
		CLEAR_User_Function.sleep(9000);
		CLEAR_User_Function.sendkeys(CBS_ClearPC_Locators.Add_Folder_Title_x, "_Edited1");
		CLEAR_User_Function.sleep(2000);		
		CLEAR_User_Function.click(CBS_ClearPC_Locators.Fodler_path_x);
		CLEAR_User_Function.sleep(2000);
		Foldername_edited = CLEAR_User_Function.getattributehtml(CBS_ClearPC_Locators.Add_Folder_Title_x);
	     CLEAR_User_Function.Writetofile("Foldername_edited=","Foldername_edited",Foldername_edited);
	     CLEAR_User_Function.sleep(1000);
	    System.out.println("Folder name is edited " +Foldername_edited);
	    CLEAR_User_Function.sleep(1000);
		CLEAR_User_Function.click(CBS_ClearPC_Locators.Save_Folder_x);
		Thread.sleep(5000);
		CLEAR_User_Function.Alertisdisplayed(CBS_ClearPC_Locators.Add_Folder_Alert_x);
		CLEAR_User_Function.validateElement(CBS_ClearPC_Locators.Add_Folder_Alert_x,"Folder updated successfully");
		CLEAR_User_Function.extentReportScreenShot();
		Reporter.addStepLog("Newly Created Folder is editable");
		log.info("Newly Created Folder is editable");	
	}

	@Then("^Validate edited folder is searchable$")
	public void validate_edited_folder_is_searchable() throws Throwable {
		Thread.sleep(3000);
		CLEAR_User_Function.click(CBS_ClearPC_Locators.Search_icon_x);
		Thread.sleep(6000);
		CLEAR_User_Function.click(CBS_ClearPC_Locators.RemoveText_x); 
		Thread.sleep(6000);
		//CLEAR_User_Function.readfile3(CBS_ClearPC_Locators.Search_Text_x,CBS_ClearPC_Locators.Asset_displaying_x);
		CLEAR_User_Function.sendkeys(CBS_ClearPC_Locators.Search_Text_x,Foldername_edited);
		CLEAR_User_Function.clickenter(CBS_ClearPC_Locators.Search_Text_x);
		Thread.sleep(20000);
		CLEAR_User_Function.extentReportScreenShot();
		CLEAR_User_Function.Isdisplay(CBS_ClearPC_Locators.Folder_edited_x);
		CLEAR_User_Function.validateElement(CBS_ClearPC_Locators.Folder_edited_x,Foldername_edited);
		Reporter.addStepLog("Newly Created Folder is searchable");
		log.info("Newly Created Folder is searchable");
	}
}
