
package com.cucumber.stepdefinitions.Lionsgate;

import cucumber.api.java.en.Then;

import java.time.LocalDate;
import java.util.Calendar;

import org.apache.log4j.Logger;
import org.apache.poi.util.SystemOutLogger;
import org.junit.Assert;

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

public class LG_Folder_Management_ClearPC {

	static Logger log = Logger.getLogger(LG_Streaming_ClearPC.class.getName());
@Then("^Right Click on rename and update the name LG portal$")

public void Right_Click_on_rename_and_update_the_name_LG_portal() throws Throwable {
	
	LG_ClearPC_Locators.getlocators();
	Thread.sleep(5000);
	CLEAR_User_Function.click(LG_ClearPC_Locators.Asset_thumbnail_x);
	CLEAR_User_Function.sleep(2000);
	String Asset_title = CLEAR_User_Function.gettext(LG_ClearPC_Locators.Asset_title_X);
	log.info("Asset title is "+Asset_title);
	CLEAR_User_Function.click(LG_ClearPC_Locators.Action_List_X);
	CLEAR_User_Function.sleep(1000);
	CLEAR_User_Function.click(LG_ClearPC_Locators.Asset_rename_X);
	CLEAR_User_Function.sleep(1000);
	java.util.Date date = Calendar.getInstance().getTime();  
    DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
    String strDate = dateFormat.format(date);  
    System.out.println("Converted String: " + strDate);  
    Thread.sleep(1000);
    CLEAR_User_Function.clear(LG_ClearPC_Locators.Input_Filed_X);
	CLEAR_User_Function.sendkeys(LG_ClearPC_Locators.Input_Filed_X,strDate);
	CLEAR_User_Function.click(LG_ClearPC_Locators.Save_BTN_X);
	CLEAR_User_Function.click(LG_ClearPC_Locators.Alert_Yes_BTN_X);
	Assert.assertTrue(!(Asset_title.contentEquals(strDate)));
	CLEAR_User_Function.sleep(3000);
	String AlertMSG =CLEAR_User_Function.gettext(LG_ClearPC_Locators.Alert_MSG_X);
	log.info("AlertMSG is "+AlertMSG);
	Assert.assertTrue((AlertMSG.contentEquals("Asset renamed successfully")));
}

  @Then("^Right click on the asset and Copy the file to other location LG portal LG portal$") 
  public void Right_click_on_the_asset_and_Copy_the_file_to_other_location_LG_portal_LG_portal() 
  throws Throwable {
  Thread.sleep(20000); 
  CLEAR_User_Function.click(LG_ClearPC_Locators.Asset_thumbnail_x); 
  CLEAR_User_Function.sleep(2000); 
  String Asset_title =  CLEAR_User_Function.gettext(LG_ClearPC_Locators.Asset_title_X); 
  log.info("Asset title is "+Asset_title); 
  CLEAR_User_Function.click(LG_ClearPC_Locators.Action_List_X); 
  Thread.sleep(2000); 
  log.info("Asset Selected for Copy"); 
  CLEAR_User_Function.click(LG_ClearPC_Locators.Asset_Copy_X); 
  log.info("Asset Selected for Copy"); 
  Thread.sleep(4000);  
  CLEAR_User_Function.click(LG_ClearPC_Locators.Copy_To_FOlder_Second_screen_LG); 
  Thread.sleep(2000); ; 
  CLEAR_User_Function.click(LG_ClearPC_Locators.Copy_Now_BTN_X); 
  Thread.sleep(2000);  
  CLEAR_User_Function.click(LG_ClearPC_Locators.Alert_Yes_BTN_X); 
  String  AlertMSG2 = null;
  
  //CLEAR_User_Function.WaitforAlert();
  try {
  Thread.sleep(23000);
  AlertMSG2 = CLEAR_User_Function.GetAlertMSG(); 
  log.info("Alert MSG for Copy success is:"+ AlertMSG2); 
 Assert.assertTrue((AlertMSG2.contentEquals("Asset renamed successfully")));
  }
  catch (Exception e) {
	  log.info(" Couldnot get the alert MSG in 23 Seconds");
}
  
  Thread.sleep(3000); 
  }  
  
  
 
@Then("^Right click on the asset and Move the file and paste to other location LG portal$")
public void Right_click_on_the_asset_and_Move_the_file_and_paste_to_other_location_LG_portal() throws Throwable {
	LG_ClearPC_Locators.getlocators();
	CLEAR_User_Function.sleep(2000);
	CLEAR_User_Function.click(LG_ClearPC_Locators.Asset_thumbnail_x);
	CLEAR_User_Function.sleep(2000);
	CLEAR_User_Function.click(LG_ClearPC_Locators.folder_From_X);
	Thread.sleep(5000);
	CLEAR_User_Function.click(LG_ClearPC_Locators.Move_Asset_thumbnail_x);
	Thread.sleep(2000);
	
	CLEAR_User_Function.click(LG_ClearPC_Locators.Action_List_X);
	Thread.sleep(3000);
	CLEAR_User_Function.click(LG_ClearPC_Locators.Asset_Move_X);
	Thread.sleep(2000);	
	log.info("Asset  is selected for move");
	String AlertMSG =CLEAR_User_Function.gettext(LG_ClearPC_Locators.Alert_MSG_X);
	log.info("AlertMSG is "+AlertMSG);
	Assert.assertTrue((AlertMSG.contentEquals("Assets selected for move")));
	Thread.sleep(3000);
	CLEAR_User_Function.click(LG_ClearPC_Locators.Move_To_Folder_LG_X);
	Thread.sleep(5000);
	CLEAR_User_Function.click(LG_ClearPC_Locators.Action_List_X);
	CLEAR_User_Function.sleep(1000);
	CLEAR_User_Function.click(LG_ClearPC_Locators.Paste_x);
	CLEAR_User_Function.sleep(2000);
	CLEAR_User_Function.click(LG_ClearPC_Locators.Paste_Alert_x);
	Thread.sleep(3000);
try {
	CLEAR_User_Function.click(LG_ClearPC_Locators.Rename_BTN_Alert_x);
	Thread.sleep(3000);
} catch (Exception e) {
	log.info("Asset name is uniqu rename doesnoot required");
	Thread.sleep(3000);
}
	
	String AlertMSG3 =CLEAR_User_Function.gettext(LG_ClearPC_Locators.Alert_MSG_X);
	log.info("AlertMSG is "+AlertMSG3);
	Assert.assertTrue((AlertMSG3.contentEquals("Assets moved successfully")));
	
}
}

