package com.cucumber.stepdefinitions.Turner;

import org.apache.log4j.Logger;

import com.cucumber.listener.Reporter;
import com.cucumber.stepdefinitions.cbs.CBS_ClearPC_Locators;

import Utilities.CLEAR_User_Function;
import cucumber.api.java.en.Then;


public class Turner_Streaming_ClearPC {

	static Logger log = Logger.getLogger(Turner_Streaming_ClearPC.class.getName());

@Then("^Search for the asset Turner portal$")
public void Search_for_the_asset_Turner_portal() throws Throwable {
	Turner_ClearPC_Locators.getlocators();
	CBS_ClearPC_Locators.getlocators();
	CLEAR_User_Function.clickenter(CBS_ClearPC_Locators.Search_Text_x); 
	CLEAR_User_Function.sleep(1000);
	Thread.sleep(9000);
	CLEAR_User_Function.click(CBS_ClearPC_Locators.Asset_thumbnail_x);
	Thread.sleep(1000);
	CLEAR_User_Function.extentReportScreenShot();
	Reporter.addStepLog("Searched for an asset");
	log.info("Searched for an asset");  
}

@Then("^Validate Advance player functionality Turner portal$")
public void Validate_Advance_player_functionality_Turner_portal() throws Throwable {
	CLEAR_User_Function.sleep(1000);
	CLEAR_User_Function.click(CBS_ClearPC_Locators.Streaming_PreviewPanel_x);
	CLEAR_User_Function.extentReportScreenShot();
	CLEAR_User_Function.sleep(18000);
	CLEAR_User_Function.click(CBS_ClearPC_Locators.Preview_playerpause_x);
	CLEAR_User_Function.extentReportScreenShot();
	CLEAR_User_Function.sleep(1000);
	String Initial_Timecounter = CLEAR_User_Function.gettext(CBS_ClearPC_Locators.Asset_Viewer_Timecounter_x);
	System.out.println("Player Timecounter is -" +Initial_Timecounter);
	CLEAR_User_Function.sleep(1000);
	//CLEAR_User_Function.click(ClearPC_Locators.Streaming_PreviewPanel_x);	
	CLEAR_User_Function.Onhover(CBS_ClearPC_Locators.Streaming_PreviewPanel_x);
	CLEAR_User_Function.sleep(1000);	
	CLEAR_User_Function.click(CBS_ClearPC_Locators.Preview_pause_x);
	Thread.sleep(15000);
	CLEAR_User_Function.click(CBS_ClearPC_Locators.Preview_playerpause_x);	
	String Final_Timecounter = CLEAR_User_Function.gettext(CBS_ClearPC_Locators.Asset_Viewer_Timecounter_x);
	System.out.println("Player Timecounter is -" +Final_Timecounter);
	CLEAR_User_Function.sleep(1000);
	CLEAR_User_Function.extentReportScreenShot();
	Reporter.addStepLog("Streaming is working in Preview Panel as " +Initial_Timecounter+ "and" +Final_Timecounter+ "has changed");
	log.info("Streaming is working in Preview Panel as " +Initial_Timecounter+ "and" +Final_Timecounter+ "has changed");
	CLEAR_User_Function.sleep(8000);
	CLEAR_User_Function.Onhover(CBS_ClearPC_Locators.Asset_displaying_x);
	Thread.sleep(1000);
	CLEAR_User_Function.Doubleclick(CBS_ClearPC_Locators.Asset_displaying_x);
	CLEAR_User_Function.extentReportScreenShot();
	Thread.sleep(30000);
	CLEAR_User_Function.mousemove(CBS_ClearPC_Locators.Player_screen_x);
	Thread.sleep(1000);
	CLEAR_User_Function.Onhover(CBS_ClearPC_Locators.Player_Quick_Browser_x);
	Thread.sleep(500);
	CLEAR_User_Function.mousemove(CBS_ClearPC_Locators.Player_screen_x);	
	//CLEAR_User_Function.mousemove(CBS_ClearPC_Locators.Player_Control_Pin_x);
	Thread.sleep(2000);
	CLEAR_User_Function.click(CBS_ClearPC_Locators.Player_playpause_x);
	CLEAR_User_Function.extentReportScreenShot();
	CLEAR_User_Function.sleep(2000);		
	CLEAR_User_Function.click(CBS_ClearPC_Locators.Player_Slower_icon_x);
	CLEAR_User_Function.extentReportScreenShot();
	Thread.sleep(6000);
	CLEAR_User_Function.playerclick(CBS_ClearPC_Locators.Player_Faster_icon_x);
	Thread.sleep(2000);
	CLEAR_User_Function.click(CBS_ClearPC_Locators.Player_playpause_x);
	CLEAR_User_Function.extentReportScreenShot();
	CLEAR_User_Function.sleep(1000);
	CLEAR_User_Function.MoveMousePointer(CBS_ClearPC_Locators.Player_playpause_x);
	Thread.sleep(15000);
	CLEAR_User_Function.playerclick(CBS_ClearPC_Locators.Player_Previous_Frame_x);
	CLEAR_User_Function.extentReportScreenShot();
	Thread.sleep(2000);
	CLEAR_User_Function.playerclick(CBS_ClearPC_Locators.Player_Next_Frame_x);
	CLEAR_User_Function.extentReportScreenShot();
	Thread.sleep(2000);
	CLEAR_User_Function.click(CBS_ClearPC_Locators.Player_Volume_x);
	CLEAR_User_Function.extentReportScreenShot();
	Thread.sleep(2000);	 
	CLEAR_User_Function.click(CBS_ClearPC_Locators.Player_setting_icon_x);
	CLEAR_User_Function.extentReportScreenShot();
	Thread.sleep(2000);
	CLEAR_User_Function.Move(CBS_ClearPC_Locators.Player_quality_x);
	Thread.sleep(1000);
	CLEAR_User_Function.listdd(CBS_ClearPC_Locators.Player_quality_x);
	Thread.sleep(1000);
	CLEAR_User_Function.Move(CBS_ClearPC_Locators.Player_frames_x);
	Thread.sleep(1000);
	CLEAR_User_Function.listdd(CBS_ClearPC_Locators.Player_frames_x);
	Thread.sleep(1000);	
	CLEAR_User_Function.MoveMousePointer(CBS_ClearPC_Locators.Player_help_icon_x);
	Thread.sleep(1000);
	CLEAR_User_Function.click(CBS_ClearPC_Locators.Player_Help_ok_x);
	Thread.sleep(1000);
	CLEAR_User_Function.MoveMousePointer(CBS_ClearPC_Locators.Player_Full_Screen);
	CLEAR_User_Function.extentReportScreenShot();
	Thread.sleep(1000);
	CLEAR_User_Function.Onhover(CBS_ClearPC_Locators.Player_Quick_Browser_x);
	Thread.sleep(1000);
	CLEAR_User_Function.click(CBS_ClearPC_Locators.Player_screen_x);
	Thread.sleep(1000);
	//CLEAR_User_Function.click(CBS_ClearPC_Locators.Player_Control_Pin_x);
	Thread.sleep(1000);
	CLEAR_User_Function.click(CBS_ClearPC_Locators.Player_playpause_x);
	CLEAR_User_Function.extentReportScreenShot();
	CLEAR_User_Function.sleep(14000);		
	CLEAR_User_Function.click(CBS_ClearPC_Locators.Player_Slower_icon_x);
	Thread.sleep(6000);
	CLEAR_User_Function.playerclick(CBS_ClearPC_Locators.Player_Faster_icon_x);
	Thread.sleep(2000);
	CLEAR_User_Function.click(CBS_ClearPC_Locators.Player_playpause_x);
	CLEAR_User_Function.sleep(1000);
	CLEAR_User_Function.click(CBS_ClearPC_Locators.Player_playpause_x);
	Thread.sleep(20000);
	CLEAR_User_Function.playerclick(CBS_ClearPC_Locators.Player_Previous_Frame_x);
	CLEAR_User_Function.extentReportScreenShot();
	Thread.sleep(2000);
	CLEAR_User_Function.playerclick(CBS_ClearPC_Locators.Player_Next_Frame_x);
	CLEAR_User_Function.extentReportScreenShot();
	Thread.sleep(2000);
	CLEAR_User_Function.click(CBS_ClearPC_Locators.Player_Volume_x);
	Thread.sleep(2000);
	CLEAR_User_Function.click(CBS_ClearPC_Locators.Player_setting_icon_x);
	CLEAR_User_Function.extentReportScreenShot();
	Thread.sleep(2000);
	CLEAR_User_Function.Move(CBS_ClearPC_Locators.Player_quality_x);
	Thread.sleep(1000);
	CLEAR_User_Function.listdd(CBS_ClearPC_Locators.Player_quality_x);
	Thread.sleep(1000);
	CLEAR_User_Function.Move(CBS_ClearPC_Locators.Player_frames_x);
	Thread.sleep(1000);
	CLEAR_User_Function.listdd(CBS_ClearPC_Locators.Player_frames_x);
	Thread.sleep(2000);
	CLEAR_User_Function.MoveMousePointer(CBS_ClearPC_Locators.Player_Full_Screen);
	CLEAR_User_Function.extentReportScreenShot();
	CLEAR_User_Function.sleep(6000);
	CLEAR_User_Function.extentReportScreenShot();
	Reporter.addStepLog("Player and Streaming is validated in Advance pop up");
	log.info("Player and Streaming is validated in Advance pop up"); 
}

@Then("^Validate Information player functionality Turner portal$")
public void Validate_Information_player_functionality_Turner_portal() throws Throwable {
	Thread.sleep(2000);
	CLEAR_User_Function.Onhover(CBS_ClearPC_Locators.Advance_popup_x);
	Thread.sleep(5000);
	CLEAR_User_Function.click(CBS_ClearPC_Locators.Infor_popup_x);
	Thread.sleep(1000);
	Thread.sleep(1000);
	CLEAR_User_Function.Onhover(CBS_ClearPC_Locators.Player_Quick_Browser_x);
	Thread.sleep(1000);
	CLEAR_User_Function.Move(CBS_ClearPC_Locators.Player_screen_x);
	Thread.sleep(1000);
	//CLEAR_User_Function.MoveMousePointer(CBS_ClearPC_Locators.Player_Control_Pin_x);
	Thread.sleep(1000);
	CLEAR_User_Function.click(CBS_ClearPC_Locators.Player_playpause_x);
	CLEAR_User_Function.extentReportScreenShot();
	CLEAR_User_Function.sleep(2000);		
	CLEAR_User_Function.click(CBS_ClearPC_Locators.Player_Slower_icon_x);
	CLEAR_User_Function.extentReportScreenShot();
	Thread.sleep(16000);
	CLEAR_User_Function.playerclick(CBS_ClearPC_Locators.Player_Faster_icon_x);
	Thread.sleep(2000);
	CLEAR_User_Function.click(CBS_ClearPC_Locators.Player_playpause_x);
	CLEAR_User_Function.extentReportScreenShot();
	CLEAR_User_Function.sleep(1000);
	CLEAR_User_Function.MoveMousePointer(CBS_ClearPC_Locators.Player_playpause_x);
	Thread.sleep(15000);
	CLEAR_User_Function.playerclick(CBS_ClearPC_Locators.Player_Previous_Frame_x);
	CLEAR_User_Function.extentReportScreenShot();
	Thread.sleep(2000);
	CLEAR_User_Function.playerclick(CBS_ClearPC_Locators.Player_Next_Frame_x);
	CLEAR_User_Function.extentReportScreenShot();
	Thread.sleep(2000);
	CLEAR_User_Function.click(CBS_ClearPC_Locators.Player_Volume_x);
	CLEAR_User_Function.extentReportScreenShot();
	Thread.sleep(2000);	 
	CLEAR_User_Function.click(CBS_ClearPC_Locators.Player_setting_icon_x);
	CLEAR_User_Function.extentReportScreenShot();
	Thread.sleep(2000);
	CLEAR_User_Function.Move(CBS_ClearPC_Locators.Player_quality_x);
	Thread.sleep(1000);
	CLEAR_User_Function.listdd(CBS_ClearPC_Locators.Player_quality_x);
	Thread.sleep(1000);
	CLEAR_User_Function.Move(CBS_ClearPC_Locators.Player_frames_x);
	Thread.sleep(1000);
	CLEAR_User_Function.listdd(CBS_ClearPC_Locators.Player_frames_x);
	Thread.sleep(1000);	
	CLEAR_User_Function.MoveMousePointer(CBS_ClearPC_Locators.Player_help_icon_x);
	Thread.sleep(1000);
	CLEAR_User_Function.click(CBS_ClearPC_Locators.Player_Help_ok_x);
	Thread.sleep(1000);
//	CLEAR_User_Function.Onhover(CBS_ClearPC_Locators.Player_playpause_x);
//	Thread.sleep(2000);
//	CLEAR_User_Function.Onhover(CBS_ClearPC_Locators.Player_playpause_x);
//	Thread.sleep(3000);
//	CLEAR_User_Function.Onhover(CBS_ClearPC_Locators.Player_slow_x);
//	Thread.sleep(1000);
	CLEAR_User_Function.sleep(5000);
	CLEAR_User_Function.extentReportScreenShot();
	Reporter.addStepLog("Player and Streaming is validated in Information pop up");
	log.info("Player and Streaming is validated in Information pop up");   	
}


@Then("^Validate Editor player functionality Turner portal$")
public void Validate_Editor_player_functionality_Turner_portal() throws Throwable {
	Thread.sleep(5000);
	CLEAR_User_Function.Onhover(Turner_ClearPC_Locators.Advance_popup_x);
	Thread.sleep(10000);
	CLEAR_User_Function.click(Turner_ClearPC_Locators.Editor_popup_x);
	Thread.sleep(10000);
	CLEAR_User_Function.Onhover(Turner_ClearPC_Locators.Editor_player_pause_x);
	Thread.sleep(10000);
	CLEAR_User_Function.click(Turner_ClearPC_Locators.Editor_player_stop_x);
	Thread.sleep(10000);
	CLEAR_User_Function.click(Turner_ClearPC_Locators.Editor_player_pause_x);
	Thread.sleep(10000);
	CLEAR_User_Function.click(Turner_ClearPC_Locators.Editor_playerbinbar_x);
	CLEAR_User_Function.sleep(10000);
	CLEAR_User_Function.click(Turner_ClearPC_Locators.Editor_player_close_x);
	CLEAR_User_Function.sleep(5000);
	CLEAR_User_Function.click(Turner_ClearPC_Locators.Edior_saveno_x);
	CLEAR_User_Function.extentReportScreenShot();
	Reporter.addStepLog("Player and Streaming is validated in Editor pop up");
	log.info("Player and Streaming is validated in Editor pop up");  	
}
}