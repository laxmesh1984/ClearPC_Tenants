package com.cucumber.stepdefinitions.cbs;

import cucumber.api.java.en.Then;
import org.apache.log4j.Logger;

import com.cucumber.listener.Reporter;
import com.cucumber.stepdefinitions.*;
import com.cucumber.stepdefinitions.Turner.Turner_ClearPC_Locators;

import Utilities.CLEAR_User_Function;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class CBS_HTTPUpload_ClearPC {
	
	static Logger log = Logger.getLogger(CBS_Streaming_ClearPC.class.getName());
	@Then("^Navigate inside subfolder$")
	public void navigate_inside_subfolder() throws Throwable 
	{
		CBS_ClearPC_Locators.getlocators();
		CLEAR_User_Function.click(CBS_ClearPC_Locators.CBS_LABEL_X);
		Thread.sleep(2000);
		CLEAR_User_Function.click(CBS_ClearPC_Locators.Folder_toggle_x);
		log.info("folder selected for HTTP UPload"); 
		Reporter.addStepLog("Searched for an asset");		
		CLEAR_User_Function.sleep(5000);
		CLEAR_User_Function.click(CBS_ClearPC_Locators.folder_From_X);
		log.info("Automation folder selected for HTTP UPload");
		Thread.sleep(25000);
		
	}
		

	
	 @Then("^Click on Upload button$")
	 public void click_on_Upload_button() throws  Throwable {
		 Thread.sleep(4000);		  
			CLEAR_User_Function.click(CBS_ClearPC_Locators.Upload_Btn_x);
			log.info("Upload button clicked");
			CLEAR_User_Function.sleep(6000);
			Reporter.addStepLog("Upload button clicked");	
	  }
	   
	  
	 @Then("^Click on IBM Aspera Alert button for CBS tenant$") public void
	 click_on_IBM_Aspera_Alert_button_for_CBS_tenant() throws Throwable
	 { 
		 
		 Thread.sleep(70000);
		 CLEAR_User_Function.EnterkeyforAsperaPopup();
		 log.info("Aspera Alert is clicked");
		 Reporter.addStepLog("Aspera Alert is clicked");	
	 }
	 
	 
	 @Then("^Click on IBM Aspera Alert button for HTTP Upload$") 
	 public void click_on_IBM_Aspera_Alert_button_for_HTTP_Upload() throws Throwable { 
		 
		 Thread.sleep(15000);
		 CLEAR_User_Function.EnterkeyforAsperaPopup();
		 log.info("Aspera Alert is clicked");
		 Reporter.addStepLog("Aspera Alert is clicked");	
	 }
	  
	 @Then("^Click on browse link$") public void click_on_browse_link() throws
	 Throwable { 
		   
		 Thread.sleep(5000);
		 CLEAR_User_Function.click(CBS_ClearPC_Locators.Browse_Btn_x);
		 log.info("Browse link is clicked");
		 Reporter.addStepLog("Browse link is clicked");
	 }
	  
	  @Then("^Select File and Click Open button$") public void
	  select_File_and_Click_Open_button() throws Throwable { 
		  // Write code here	  that turns the phrase above into concrete 
		  Thread.sleep(5000);
		  CLEAR_User_Function.selectFileToUpload(CBS_ClearPC_Locators.Upload_path_d);
		  Thread.sleep(2000);
		  CLEAR_User_Function.ElementVisisble(CBS_ClearPC_Locators.Rename_Alert_pop_x,CBS_ClearPC_Locators.rename_button_x);
		  log.info("File is Selected");
		  Reporter.addStepLog("File is Selected");
	  }
	  
//	  @Then("^Select File for Aspera Upload and Click Open button for CBS tenant$") public void
//	  select_File_for_Aspera_Upload_and_Click_Open_button_for_CBS_tenant() throws Throwable { 
//		  // Write code here	  that turns the phrase above into concrete  
//		  Thread.sleep(5000);
//		  CLEAR_User_Function.selectFileToUpload(CBS_ClearPC_Locators.AsperaUpload_path_d);
//		  //CLEAR_User_Function.click(CBS_ClearPC_Locators.Aspera_Upload_Continue_x);
//		  log.info("Test File is is selected to upload");
//		  Reporter.addStepLog("Test File is is selected to upload");
//		  
//	  }
	  
	 @Then("^Validate file upload is initated$") 
	 public void validate_file_upload_is_initated() throws Throwable 
	 { 
		 Thread.sleep(500);
		 CLEAR_User_Function.Alertisdisplayed(CBS_ClearPC_Locators.Upload_Initiated_x);
		 CLEAR_User_Function.validateElement(CBS_ClearPC_Locators.Upload_Initiated_x, "File transfer initiated for 1 file(s)");
		 log.info("File Upload is initiated");
		 Reporter.addStepLog("File Upload is initiated");
		 Thread.sleep(10000);
		 
	    }
	  
	  @Then("^Validate File transfered is completed$") public void
	  validate_File_transfered_is_completed() throws Throwable
	  { 
		    //Thread.sleep(60000);
		    CLEAR_User_Function.waitFor120();
		    Thread.sleep(12000);
		  	//CLEAR_User_Function.validateuploadstatus(CBS_ClearPC_Locators.Upload_Status_x,"Upload Completed","Failed","In-Progress");
		  	CLEAR_User_Function.validateElement(CBS_ClearPC_Locators.Upload_Status_x, "Upload Completed");
			 log.info("File Upload Status is completed in Upload pop up");
			 Reporter.addStepLog("File Upload Status is completed in Upload pop up");
			 Thread.sleep(5000);
			 CLEAR_User_Function.click(CBS_ClearPC_Locators.Upload_Close_x);
			 Thread.sleep(12000);
	   }
	  
	  
	  @Then("^Validate File Upload Status is Completed in Notification Upload Tab for CBS$") public void
	  validate_File_Upload_Status_is_Completed_in_Notification_Upload_Tab_for_CBS() throws Throwable 
	  {
		  CLEAR_User_Function.click(CBS_ClearPC_Locators.Upload_tab_x);
		  Thread.sleep(2000);
		  //CLEAR_User_Function.validateAttributeValue(CBS_ClearPC_Locators.Upload_Tab_Status_x,"Upload Completed");
		  CLEAR_User_Function.validateuploadstatus(CBS_ClearPC_Locators.Upload_Tab_Status_x,"Upload Completed","Failed","In-Progress");
		  CLEAR_User_Function.validateElement(CBS_ClearPC_Locators.Upload_Tab_Status_x, "Upload Completed");
		  Thread.sleep(5000);
		  CLEAR_User_Function.click(CBS_ClearPC_Locators.Upload_Tab_Close_x);
	  }
	  
	 


}
