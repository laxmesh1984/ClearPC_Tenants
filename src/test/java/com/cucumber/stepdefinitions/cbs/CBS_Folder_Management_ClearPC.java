
package com.cucumber.stepdefinitions.cbs;

import cucumber.api.java.en.Then;

import java.time.LocalDate;
import java.util.Calendar;

import org.apache.log4j.Logger;
import org.apache.poi.util.SystemOutLogger;
import org.junit.Assert;
import org.openqa.selenium.By;

import com.cucumber.listener.Reporter;
import com.cucumber.stepdefinitions.*;
import com.cucumber.stepdefinitions.Turner.Turner_ClearPC_Locators;

import Utilities.CLEAR_User_Function;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.java.it.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;
import org.apache.log4j.Logger;
import com.cucumber.stepdefinitions.Turner.Turner_ClearPC_Locators;

public class CBS_Folder_Management_ClearPC {

	static Logger log = Logger.getLogger(CBS_Streaming_ClearPC.class.getName());
	public String strDate;
	
	@Then("^Navigate inside subfolder of cbs$")
	public void navigate_inside_subfolde_of_cbsr() throws Throwable 
	{
		CBS_ClearPC_Locators.getlocators();
		Turner_ClearPC_Locators.getlocators();
		//CLEAR_User_Function.click(CBS_ClearPC_Locators.CBS_LABEL_X);
		Thread.sleep(2000);
		CLEAR_User_Function.Doubleclick(CBS_ClearPC_Locators.Prod_folder_X);
		log.info("folder selected for HTTP UPload"); 
		Reporter.addStepLog("Searched for an asset");		
		CLEAR_User_Function.sleep(5000);
		CLEAR_User_Function.Doubleclick(CBS_ClearPC_Locators.Move_To_Folder_X);
		log.info("Automation folder selected for HTTP UPload");
		CLEAR_User_Function.sleep(5000);	
		
	}
	
@Then("^Right Click on rename and update the name$")

public void right_Click_on_rename_and_update_the_name() throws Throwable {
	
	CBS_ClearPC_Locators.getlocators();
	CLEAR_User_Function.sleep(5000);
	CLEAR_User_Function.click(CBS_ClearPC_Locators.sort_icon_x);
	CLEAR_User_Function.sleep(2000);
	CLEAR_User_Function.click(CBS_ClearPC_Locators.sort_desc_x);
	Thread.sleep(3000);
	CLEAR_User_Function.click(CBS_ClearPC_Locators.Asset_thumbnail_x);
	CLEAR_User_Function.sleep(2000);
	String Asset_title = CLEAR_User_Function.gettext(CBS_ClearPC_Locators.Asset_title_X);
	log.info("Asset title is "+Asset_title);
	CLEAR_User_Function.click(CBS_ClearPC_Locators.Action_List_X);
	CLEAR_User_Function.sleep(1000);
	CLEAR_User_Function.click(CBS_ClearPC_Locators.Asset_rename_X);
	CLEAR_User_Function.sleep(1000);
	java.util.Date date = Calendar.getInstance().getTime();  
    DateFormat dateFormat = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");  
    strDate = "TestFile_"+dateFormat.format(date);  
    System.out.println("Converted String: " +strDate);  
    
    CLEAR_User_Function.clear(CBS_ClearPC_Locators.Input_Filed_X);
    Thread.sleep(1000);  
	CLEAR_User_Function.sendkeys(CBS_ClearPC_Locators.Input_Filed_X,strDate);
    Thread.sleep(1000);
	CLEAR_User_Function.click(CBS_ClearPC_Locators.Save_BTN_X);
	Thread.sleep(1000);
	CLEAR_User_Function.click(CBS_ClearPC_Locators.Alert_Yes_BTN_X);
	Assert.assertTrue(!(Asset_title.contentEquals(strDate)));
	CLEAR_User_Function.sleep(6000);	
	CLEAR_User_Function.Alertisdisplayed(CBS_ClearPC_Locators.Alert_MSG_X);
	CLEAR_User_Function.validateElement(CBS_ClearPC_Locators.Alert_MSG_X,"Asset renamed successfully");
//	String AlertMSG =CLEAR_User_Function.gettext(CBS_ClearPC_Locators.Alert_MSG_X);
//	log.info("AlertMSG is "+AlertMSG);
//	Assert.assertTrue((AlertMSG.contentEquals("Asset renamed successfully")));
	Thread.sleep(4000);	
	Thread.sleep(1000);
	CLEAR_User_Function.click(CBS_ClearPC_Locators.Search_icon_x);
	CLEAR_User_Function.sleep(1000);
	CLEAR_User_Function.sendkeys(CBS_ClearPC_Locators.Search_Text_x,strDate);
	CLEAR_User_Function.sleep(2000);
	CLEAR_User_Function.clickenter(CBS_ClearPC_Locators.Search_Text_x);
	CLEAR_User_Function.extentReportScreenShot();
	CLEAR_User_Function.waitFor();
	Thread.sleep(15000);
	CLEAR_User_Function.Isdisplay(CBS_ClearPC_Locators.Asset_title_X);
	CLEAR_User_Function.sleep(3000);
	CLEAR_User_Function.validateElement(CBS_ClearPC_Locators.Asset_title_X,strDate);
}

  @Then("^Right click on the asset and Copy the file to other location$") 
  public void right_click_on_the_asset_and_Copy_the_file_to_other_location() 
  throws Throwable 
  {
  Thread.sleep(20000); 
//  CLEAR_User_Function.click(CBS_ClearPC_Locators.Asset_thumbnail_x); 
//  CLEAR_User_Function.sleep(2000); 
//  String Asset_title =  CLEAR_User_Function.gettext(CBS_ClearPC_Locators.Asset_title_X); 
//  log.info("Asset title is "+Asset_title);
  Thread.sleep(1000);
	CLEAR_User_Function.click(CBS_ClearPC_Locators.Search_icon_x);
	CLEAR_User_Function.sleep(1000);
	CLEAR_User_Function.clear(CBS_ClearPC_Locators.Search_Text_x);
	CLEAR_User_Function.sleep(1000);	
	CLEAR_User_Function.sendkeys(CBS_ClearPC_Locators.Search_Text_x,strDate);
	CLEAR_User_Function.sleep(2000);
	CLEAR_User_Function.clickenter(CBS_ClearPC_Locators.Search_Text_x);
	CLEAR_User_Function.extentReportScreenShot();
	CLEAR_User_Function.waitFor();
	 CLEAR_User_Function.click(CBS_ClearPC_Locators.Asset_thumbnail_x); 
	//  CLEAR_User_Function.sleep(2000);
  Thread.sleep(2000); 
  CLEAR_User_Function.click(CBS_ClearPC_Locators.Action_List_X); 
  Thread.sleep(2000); 
  log.info("Asset Selected for Copy"); 
  CLEAR_User_Function.click(CBS_ClearPC_Locators.Asset_Copy_X); 
  log.info("Asset Selected for Copy"); 
  Thread.sleep(1000);
	//CLEAR_User_Function.validateElement2(CBS_ClearPC_Locators.Alert_MSG_X,"Asset Selected for Copy");
 
  CLEAR_User_Function.sleep(15000); 
  CLEAR_User_Function.click(CBS_ClearPC_Locators.Copy_To_FOlder_Second_screen); 
  CLEAR_User_Function.sleep(2000); 
  CLEAR_User_Function.click(CBS_ClearPC_Locators.Copy_Now_BTN_X); 
  CLEAR_User_Function.sleep(5000); 
  CLEAR_User_Function.click(CBS_ClearPC_Locators.Alert_Yes_BTN_X); 
  CLEAR_User_Function.sleep(12000); 
  CLEAR_User_Function.Alertisdisplayed(CBS_ClearPC_Locators.Alert_MSG_X);
  CLEAR_User_Function.validateElement(CBS_ClearPC_Locators.Alert_MSG_X,"Asset copied successfully");
  String  AlertMSG2 = null;
  CLEAR_User_Function.sleep(3000);	
//  CLEAR_User_Function.Alertisdisplayed(CBS_ClearPC_Locators.Alert_MSG_X);
//	
//  //CLEAR_User_Function.WaitforAlert();
//  try 
//  {
//	  CLEAR_User_Function.validateElement(CBS_ClearPC_Locators.Alert_MSG_X,"Asset copied successfully");
//  AlertMSG2 = CLEAR_User_Function.GetAlertMSG(); 
//  log.info("Alert MSG for Copy success is:"+ AlertMSG2); 
// Assert.assertTrue((AlertMSG2.contentEquals("Asset copied successfully")));
//	Thread.sleep(4000);
//  }
//  catch (Exception e)
//  {
//	  log.info(" Couldnot get the alert MSG in 23 Seconds");
//}
  
  Thread.sleep(3000); 
  CLEAR_User_Function.click(Turner_ClearPC_Locators.Turner_Copy_X); 
  Thread.sleep(1000);
	CLEAR_User_Function.click(CBS_ClearPC_Locators.Search_icon_x);
	CLEAR_User_Function.sleep(1000);
	CLEAR_User_Function.clear(CBS_ClearPC_Locators.Search_Text_x);
	CLEAR_User_Function.sleep(1000);	
	CLEAR_User_Function.sendkeys(CBS_ClearPC_Locators.Search_Text_x,strDate);
	CLEAR_User_Function.sleep(2000);
	CLEAR_User_Function.clickenter(CBS_ClearPC_Locators.Search_Text_x);
	CLEAR_User_Function.extentReportScreenShot();
	CLEAR_User_Function.waitFor();
	Thread.sleep(15000);
	CLEAR_User_Function.Isdisplay(CBS_ClearPC_Locators.Asset_title_X);
	CLEAR_User_Function.sleep(3000);
	CLEAR_User_Function.validateElement(CBS_ClearPC_Locators.Asset_title_X,strDate);  
  
  }  
  
  
 
@Then("^Right click on the asset and Move the file and paste to other location$")
public void right_click_on_the_asset_and_Move_the_file_and_paste_to_other_location() throws Throwable 
{
	CBS_ClearPC_Locators.getlocators();
	CLEAR_User_Function.sleep(3000);
	CLEAR_User_Function.click(CBS_ClearPC_Locators.Asset_thumbnail_x);
	CLEAR_User_Function.sleep(5000);
	//CLEAR_User_Function.click(CBS_ClearPC_Locators.Automation_folder_x);
	//Thread.sleep(5000);
	//CLEAR_User_Function.click(CBS_ClearPC_Locators.Move_Asset_thumbnail_x);
	//CLEAR_User_Function.sleep(2000);	
	CLEAR_User_Function.click(CBS_ClearPC_Locators.Action_List_X);
	Thread.sleep(5000);
	CLEAR_User_Function.click(CBS_ClearPC_Locators.Asset_Move_X);
	Thread.sleep(3000);	
	log.info("Asset  is selected for move");
	CLEAR_User_Function.Alertisdisplayed(CBS_ClearPC_Locators.Alert_MSG_X);
	//CLEAR_User_Function.validateElement2(CBS_ClearPC_Locators.Alert_MSG_X,"Assets selected for move");
	String AlertMSG =CLEAR_User_Function.gettext(CBS_ClearPC_Locators.Alert_MSG_X);
	log.info("AlertMSG is "+AlertMSG);
	Assert.assertTrue((AlertMSG.contentEquals("Assets selected for move")));
	Thread.sleep(4000);
	CLEAR_User_Function.click(CBS_ClearPC_Locators.Cbs_Folder_x);
	Thread.sleep(5000);
	CLEAR_User_Function.click(CBS_ClearPC_Locators.Action_List_X);
	CLEAR_User_Function.sleep(1000);
	CLEAR_User_Function.click(CBS_ClearPC_Locators.Paste_x);
	CLEAR_User_Function.sleep(2000);
	CLEAR_User_Function.click(CBS_ClearPC_Locators.Paste_Alert_x);
	Thread.sleep(3000);
try {
	//CLEAR_User_Function.click(CBS_ClearPC_Locators.Rename_BTN_Alert_x);
	//Thread.sleep(1000);
	CLEAR_User_Function.Alertisdisplayed(CBS_ClearPC_Locators.Alert_MSG_X);
	CLEAR_User_Function.validateElement(CBS_ClearPC_Locators.Alert_MSG_X,"Assets moved successfully");
} catch (Exception e)
{
	log.info("Asset name is uniqu rename doesnoot required");
	Thread.sleep(2000);
}   
//	CLEAR_User_Function.Alertisdisplayed(CBS_ClearPC_Locators.Alert_MSG_X);
//	String AlertMSG3 =CLEAR_User_Function.gettext(CBS_ClearPC_Locators.Alert_MSG_X);
//	log.info("AlertMSG is "+AlertMSG3);
//	Assert.assertTrue((AlertMSG3.contentEquals("Assets moved successfully")));	
    Thread.sleep(4000);


}
}

