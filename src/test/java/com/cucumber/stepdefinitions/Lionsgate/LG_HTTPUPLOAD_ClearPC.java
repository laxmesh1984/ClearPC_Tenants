package com.cucumber.stepdefinitions.Lionsgate;

import cucumber.api.java.en.Then;
import org.apache.log4j.Logger;

import com.cucumber.listener.Reporter;
import com.cucumber.stepdefinitions.*;

import Utilities.CLEAR_User_Function;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class LG_HTTPUPLOAD_ClearPC {
	
	static Logger log = Logger.getLogger(LG_Streaming_ClearPC.class.getName());
	@Then("^Navigate inside subfolder LG portal$")
	public void Navigate_inside_subfolder_LG_portal() throws Throwable {
		LG_ClearPC_Locators.getlocators();
		CLEAR_User_Function.click(LG_ClearPC_Locators.LG_Tenent_X);
		Thread.sleep(2000);
		CLEAR_User_Function.Doubleclick(LG_ClearPC_Locators.Prod_folder_X);
		log.info("folder selected for HTTP UPload"); 
		Reporter.addStepLog("Searched for an asset");		
		CLEAR_User_Function.sleep(5000);
		CLEAR_User_Function.Doubleclick(LG_ClearPC_Locators.Automation_folder_x);
		log.info("Automation folder selected for HTTP UPload");
		CLEAR_User_Function.sleep(5000);		
		
	}
	
	 @Then("^Click on Upload button LG portal$")
	 public void click_on_Upload_button_LG_portal() throws  Throwable {
		 Thread.sleep(4000);		  
			CLEAR_User_Function.click(LG_ClearPC_Locators.Upload_Btn_x);
			log.info("Upload button clicked");
			CLEAR_User_Function.sleep(6000);
			Reporter.addStepLog("Upload button clicked");	
	  }
		

	
//	 @Then("^Click on IBM Aspera Alert button for HTTP upload LG portal$")
//	 public void Click_on_IBM_Aspera_Alert_button_for_HTTP_upload_LG_portal() throws  Throwable
//	 {
//		 Thread.sleep(4000);		  
//			CLEAR_User_Function.click(LG_ClearPC_Locators.Upload_Btn_x);
//			log.info("Upload button clicked");
//			CLEAR_User_Function.sleep(6000);
//			Reporter.addStepLog("Upload button clicked");	
//	  }
	   
	  
	 @Then("^Click on IBM Aspera Alert button for HTTP upload LG portal$") public void 
	 click_on_IBM_Aspera_Alert_button_for_HTTP_upload_LG_portal() throws Throwable { 
		 
		 Thread.sleep(90000);
		 CLEAR_User_Function.EnterkeyforAsperaPopup();
		 log.info("Aspera Alert is clicked");
		 Reporter.addStepLog("Aspera Alert is clicked");	
	 }
	 
	 
//	 @Then("^Click on IBM Aspera Alert button for HTTP Upload$") public void
//	 click_on_IBM_Aspera_Alert_button_for_HTTP_Upload() throws Throwable { 
//		 
//		 Thread.sleep(25000);
//		 CLEAR_User_Function.EnterkeyforAsperaPopup();
//		 log.info("Aspera Alert is clicked");
//		 Reporter.addStepLog("Aspera Alert is clicked");	
//	 }
//	  
	 @Then("^Click on browse link LG portal$")
	 public void Click_on_browse_link_LG_portal() throws
	 Throwable { 
		   
		 Thread.sleep(5000);
		 CLEAR_User_Function.click(LG_ClearPC_Locators.Browse_Btn_x);
		 log.info("Browse link is clicked");
		 Reporter.addStepLog("Browse link is clicked");
	 }
	  
	  @Then("^Select File and Click Open button LG portal$") 
	  public void
	  Select_File_and_Click_Open_button_LG_portal() throws Throwable { 
		  // Write code here	  that turns the phrase above into concrete 
		  Thread.sleep(5000);
		  CLEAR_User_Function.selectFileToUpload(LG_ClearPC_Locators.Upload_path_d);
		  log.info("File is Selected");
		  Reporter.addStepLog("File is Selected");
	  }
	  
	  @Then("^Select File for Aspera Upload and Click Open button LG$") public void
	  select_File_for_Aspera_Upload_and_Click_Open_butto_LGn() throws Throwable { 
		  // Write code here	  that turns the phrase above into concrete  
		  Thread.sleep(5000);
		  CLEAR_User_Function.selectFileToUpload(LG_ClearPC_Locators.AsperaUpload_path_d);
		  CLEAR_User_Function.click(LG_ClearPC_Locators.Aspera_Upload_Continue_x);
		  log.info("File is Selected");
		  Reporter.addStepLog("File is Selected");
		  
	  }
	  
	 @Then("^Validate HTTP fileupload is initated LG portal$") public void
	 Validate_HTTP_fileupload_is_initated_LG_portal() throws Throwable { 
		 CLEAR_User_Function.validateElement(LG_ClearPC_Locators.Upload_Initiated_x, "File transfer initiated for 1 file(s)");
		 log.info("File Upload is initiated");
		 Reporter.addStepLog("File Upload is initiated");
		 Thread.sleep(10000);
		 
	    }
	  
	  @Then("^Validate File transfered is completed LG portal$") public void
	  Validate_File_transfered_is_completed_LG_portal() throws Throwable { 
		  CLEAR_User_Function.validateElement(LG_ClearPC_Locators.Upload_Status_x,"Upload Completed");
			 log.info("File Upload Status is completed in Upload pop up");
			 Reporter.addStepLog("File Upload Status is completed in Upload pop up");
			 Thread.sleep(5000);
			 CLEAR_User_Function.click(LG_ClearPC_Locators.Upload_Close_x);
			 Thread.sleep(12000);
	   }
	  
	  
	  @Then("^Validate File Upload Status is Completed in Notification Upload Tab LG$") public void
	  validate_File_Upload_Status_is_Completed_in_Notification_Upload_Tab_LG() throws Throwable {
		  CLEAR_User_Function.validateElement(LG_ClearPC_Locators.Upload_Tab_Status_x,"Upload Completed");
		  Thread.sleep(5000);
		  CLEAR_User_Function.click(LG_ClearPC_Locators.Upload_Tab_Close_x);
	  }
	  
	 


}
