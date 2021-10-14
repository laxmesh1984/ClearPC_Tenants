package com.cucumber.stepdefinitions.Turner;

import cucumber.api.java.en.Then;
import org.apache.log4j.Logger;

import com.cucumber.listener.Reporter;
import com.cucumber.stepdefinitions.*;
import com.cucumber.stepdefinitions.cbs.CBS_ClearPC_Locators;

import Utilities.CLEAR_User_Function;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Turner_HTTPUPLOAD_ClearPC {

	static Logger log = Logger.getLogger(Turner_Streaming_ClearPC.class.getName());

	@Then("^Navigate inside subfolder Turner portal$")
	public void Navigate_inside_subfolder_Turner_portal() throws Throwable {
		Turner_ClearPC_Locators.getlocators();
		CBS_ClearPC_Locators.getlocators();
		//CLEAR_User_Function.click(Turner_ClearPC_Locators.Turner_Tenent_X);
		Thread.sleep(2000);
		CLEAR_User_Function.Doubleclick(Turner_ClearPC_Locators.Prod_folder_X);
		log.info("folder selected for HTTP UPload");
		Reporter.addStepLog("Searched for an asset");
		CLEAR_User_Function.sleep(5000);
		CLEAR_User_Function.Doubleclick(CBS_ClearPC_Locators.Test_Folder_x);
		log.info("Automation folder selected for HTTP UPload");
		CLEAR_User_Function.sleep(5000);

	}

	@Then("^Click on Upload button Turner portal$")
	public void click_on_Upload_button_Turner_portal() throws Throwable {
		Thread.sleep(4000);
		CLEAR_User_Function.click(Turner_ClearPC_Locators.Upload_Btn_x);
		log.info("Upload button clicked");
		CLEAR_User_Function.sleep(6000);
		Reporter.addStepLog("Upload button clicked");
	}

	// @Then("^Click on IBM Aspera Alert button for HTTP upload Turner portal$")
	// public void Click_on_IBM_Aspera_Alert_button_for_HTTP_upload_Turner_portal()
	// throws Throwable
	// {
	// Thread.sleep(4000);
	// CLEAR_User_Function.click(Turner_ClearPC_Locators.Upload_Btn_x);
	// log.info("Upload button clicked");
	// CLEAR_User_Function.sleep(6000);
	// Reporter.addStepLog("Upload button clicked");
	// }

	@Then("^Click on IBM Aspera Alert button for HTTP upload Turner portal$")
	public void click_on_IBM_Aspera_Alert_button_for_HTTP_upload_Turner_portal() throws Throwable {

		Thread.sleep(30000);
		CLEAR_User_Function.EnterkeyforAsperaPopup();
		log.info("Aspera Alert is clicked");
		Reporter.addStepLog("Aspera Alert is clicked");
	}

	// @Then("^Click on IBM Aspera Alert button for HTTP Upload$") public void
	// click_on_IBM_Aspera_Alert_button_for_HTTP_Upload() throws Throwable {
	//
	// Thread.sleep(25000);
	// CLEAR_User_Function.EnterkeyforAsperaPopup();
	// log.info("Aspera Alert is clicked");
	// Reporter.addStepLog("Aspera Alert is clicked");
	// }
	//
	@Then("^Click on browse link Turner portal$")
	public void Click_on_browse_link_Turner_portal() throws Throwable {

		Thread.sleep(5000);
		CLEAR_User_Function.click(Turner_ClearPC_Locators.Browse_Btn_x);
		log.info("Browse link is clicked");
		Reporter.addStepLog("Browse link is clicked");
	}

	@Then("^Select File and Click Open button Turner portal$")
	public void Select_File_and_Click_Open_button_Turner_portal() throws Throwable {
		// Write code here that turns the phrase above into concrete
		Thread.sleep(5000);
		CLEAR_User_Function.selectFileToUpload(Turner_ClearPC_Locators.Upload_path_d);
		Thread.sleep(2000);
		  CLEAR_User_Function.ElementVisisble(CBS_ClearPC_Locators.Rename_Alert_pop_x,CBS_ClearPC_Locators.rename_button_x);

		// CLEAR_User_Function.FileExist(Turner_ClearPC_Locators.Rename_Alert_pop_x,Turner_ClearPC_Locators.rename_button_x);
		log.info("Test File is is selected to upload");
		Reporter.addStepLog("Test File is is selected to upload");
	}

	// @Then("^Select File for Aspera Upload and Click Open button$") public void
	// select_File_for_Aspera_Upload_and_Click_Open_button() throws Throwable {
	// // Write code here that turns the phrase above into concrete
	// Thread.sleep(5000);
	// CLEAR_User_Function.selectFileToUpload(Turner_ClearPC_Locators.AsperaUpload_path_d);
	// Thread.sleep(2000);
	// CLEAR_User_Function.Folderexist(Turner_ClearPC_Locators.Rename_Alert_pop_x,Turner_ClearPC_Locators.rename_button_x);
	// log.info("File is Selected");
	// Reporter.addStepLog("File is Selected");
	//
	// }

	@Then("^Validate HTTP fileupload is initated Turner portal$")
	public void Validate_HTTP_fileupload_is_initated_Turner_portal() throws Throwable 
	{
		Thread.sleep(500);
		 CLEAR_User_Function.Alertisdisplayed(CBS_ClearPC_Locators.Upload_Initiated_x);
		CLEAR_User_Function.validateElement(Turner_ClearPC_Locators.Upload_Initiated_x,"File transfer initiated for 1 file(s)");
		log.info("File Upload is initiated");
		Reporter.addStepLog("File Upload is initiated");
		Thread.sleep(10000);

	}

	@Then("^Validate File transfered is completed Turner portal$")
	public void Validate_File_transfered_is_completed_Turner_portal() throws Throwable {
		CLEAR_User_Function.waitFor120();
		Thread.sleep(20000);
		//CLEAR_User_Function.validateuploadstatus(Turner_ClearPC_Locators.Upload_Status_x, "Upload Completed", "Failed",	"In-progress");
		CLEAR_User_Function.validateElement(Turner_ClearPC_Locators.Upload_Status_x, "Upload Completed");
		log.info("File Upload Status is completed in Upload pop up");
		Reporter.addStepLog("File Upload Status is completed in Upload pop up");
		Thread.sleep(5000);
		CLEAR_User_Function.click(Turner_ClearPC_Locators.Upload_Close_x);
		Thread.sleep(5000);
	}

	@Then("^Validate File Upload Status is Completed in Notification Upload Tab$")
	public void validate_File_Upload_Status_is_Completed_in_Notification_Upload_Tab() throws Throwable
	{
		 CLEAR_User_Function.click(Turner_ClearPC_Locators.Upload_tab_x);
		  Thread.sleep(5000);
		  //CLEAR_User_Function.validateuploadstatus(Turner_ClearPC_Locators.Upload_Tab_Status_x,"Upload Completed","Failed","In-Progress");
		  CLEAR_User_Function.validateElement(Turner_ClearPC_Locators.Upload_Tab_Status_x, "Upload Completed");	  
		Thread.sleep(5000);
		CLEAR_User_Function.click(Turner_ClearPC_Locators.Upload_Tab_Close_x);
	}
	
	

}
