package com.cucumber.stepdefinitions.Turner;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Turner_ClearPC_Locators

{
	
	// QA TEST DATA loading from Test_Data Properties file
	
	
	public static String Prod_PORTAL_d;
	public static String Prod_User_d;
	public static String Prod_pwd_wr_d;
	public static String Search_Asset_d;
	public static String Upload_path_d;
	public static String AsperaUpload_path_d;
	public static String Essenceupload_d;
	public static String Search_file_d;
	
	// Locating XPATH from Elements_Xpath Properties test file
	
	public static String Prod_User_x;
	public static String Prod_Continue_button_x;
	public static String Prod_Password_x;
	public static String Prod_Login_x ;
	public static String Prod_Username_x;
	public static String Prod_Logout_x;
	public static String Turner_LABEL_X;
	public static String CBS_Tenant_x;
	public static String Search_icon_x;
	public static String Search_Text_x;
	public static String Supportproject_x;
	public static String Asset_3doticon_x;
	public static String Asset_title_x;
	public static String Delete_x;
	public static String Asset_displaying_x;
	public static String rename_button_x;
	public static String Upload_tab_x;
	public static String Rename_Alert_pop_x;
	public static String Download_x;
	public static String Download_initiated_alert_x;
	public static String Streaming_PreviewPanel_x;
	public static String Asset_viewerpopup_x;
	public static String Advance_popup_x;
	public static String Infor_popup_x;
	public static String Editor_popup_x;
	public static String Player_slow_x;
	public static String Player_previousfram_x;
	public static String Player_playpause_x; 
	public static String Player_nextfram_x;
	public static String Preview_playerpause_x;
	public static String Search_Autosuggestion_x;
	public static String Search_Autosuggestion2_x;
	public static String Editor_playerbinbar_x;
	public static String Add_Folder_x;
	public static String Add_Folder_Title_x;
	public static String Save_Folder_x;
	public static String Add_Folder_Alert_x;
	public static String Edit_Folder_x;
	public static String RemoveText_x;
	public static String Asset_name_x;
	public static String Editor_player_pause_x;
	public static String Editor_player_stop_x;
	public static String Editor_player_close_x;
	public static String Edior_saveno_x;
	public static String Download_tab_x;
	public static String Download_status_x;
	public static String Prod_folder_X;
	public static String Automation_folder_x;
	public static String Upload_Btn_x ;
	public static String Browse_Btn_x;
	public static String Asset_thumbnail_x;
	public static String Asset_rename_X;
	public static String Action_List_X ;
	public static String Input_Filed_X ;
	public static String Save_BTN_X ;
	public static String Alert_Yes_BTN_X;
	public static String Asset_title_X ;
	public static String Alert_MSG_X;
	public static String Asset_Copy_X;
	public static String Move_To_Folder_X;
	public static String Copy_Now_BTN_X;
	public static String Asset_Move_X;
	public static String folder_From_X;
	public static String Move_Asset_thumbnail_x;
	public static String Paste_x;
	public static String Paste_Alert_x;
	public static String Rename_BTN_Alert_x;
	public static String Upload_Browse_x;
	public static String Automation_Folder_x;
	public static String Aspera_Upload_Continue_x;
	public static String Upload_complete_x;
	public static String Upload_rename_X;
	public static String Upload_Close_X;
	public static String Upload_Percentage_x;
	public static String Asset_Delete_X ;
	public static String Alert_Delete_Yes_X;
	public static String Check_Box_Documents_X;
	public static String Copy_To_FOlder_Second_screen;
	public static String Advance_Btn_X;
	public static String Information_DropDown_X;
	public static String Essence_tab_X;
	public static String Three_dots_X ;
	public static String Reupload_X ;
	public static String UPdate_Method_X;
	public static String REupload_Alert_x;
	public static String Browse_BTN_X;
	public static String Close_POPUP_X;
	public static String Asset_Viewer_close;
	public static String Alert_Continue_X;
	public static String Turner_Tenent_X;
	public static String Copy_To_FOlder_Second_screen_Turner;
	public static String Move_To_Folder_Turner_X ;
	public static String Upload_Status_x;
	public static String Upload_Close_x ;
	public static String Upload_Tab_Status_x;
	public static String Upload_Tab_Close_x;
	public static String Upload_Initiated_x ;
	public static String Essence_Download_x;
	public static String Confirm_Password_x;
	public static String Confirm_x;
	public static String Essence_Download_alert_x;
	public static String  Control_Player_x;
	public static String seek_bar_x;
	public static String  sort_icon_x;
	public static String  sort_desc_x;
	public static String Alert_popup_x;
	public static String Yes_Alert_x;
	public static String Search_results_x;
	public static String Asset_Viewer_Timecounter_x;
    public static String Player_Quick_Browser_x;
    public static String  Player_screen_x;
    public static String Player_Slower_icon_x;
    public static String Player_Faster_icon_x;
    public static String  Player_Previous_Frame_x;
    public static String  Player_Next_Frame_x;
    public static String  Player_Volume_x;
    public static String  Player_setting_icon_x;
    public static String Player_frames_x;
    public static String Player_quality_x;
    public static String  Player_Full_Screen;
    public static String  Player_help_icon_x;
    public static String   Player_Help_ok_x;
    public static String  Player_pause_x;
    public static String  Preview_pause_x;
    public static String Player_Control_Pin_x;
    public static String Turner_Copy_X;
	
	
	
	public static void getlocators() throws IOException {

		// Create FileInputStream Object for test data
		FileInputStream fileInput = new FileInputStream(new File("D:\\Automation_Test\\Clear_PCTenants\\src\\test\\resources\\Data\\ClearPC_Testdata.properties"));

		// Create Properties object
		Properties prop = new Properties();

		//Loading Data from Test_Data Properties test file
		prop.load(fileInput);
		
		Prod_PORTAL_d = prop.getProperty("Prod_PORTAL_d");
		Prod_pwd_wr_d = prop.getProperty("Prod_pwd_wr_d");
		Prod_User_d = prop.getProperty("Prod_User_d");
		Search_Asset_d= prop.getProperty("Search_Asset_d");
		Upload_path_d= prop.getProperty("Upload_path_d");
		AsperaUpload_path_d= prop.getProperty("AsperaUpload_path_d");
		Essenceupload_d = prop.getProperty("Essenceupload_d");
		Search_file_d = prop.getProperty("Search_file_d");
		
		
	
		

		// Create FileInputStream Object for XPATH VALUES 
		
		FileInputStream Inputxpath = new FileInputStream(new File("D:\\Automation_Test\\Clear_PCTenants\\src\\test\\resources\\Data\\ClearPC_Xpath.properties"));

		// Create Properties object
		Properties prop1 = new Properties();

		// // loading XPATH from Elements_Xpath Properties test file
		prop1.load(Inputxpath);

		Prod_User_x = prop1.getProperty("Prod_User_x");
		Prod_Continue_button_x = prop1.getProperty("Prod_Continue_button_x");
		Prod_Password_x = prop1.getProperty("Prod_Password_x");
		Prod_Login_x = prop1.getProperty("Prod_Login_x");
		Prod_Username_x = prop1.getProperty("Prod_Username_x");
		Turner_LABEL_X = prop1.getProperty("Turner_LABEL_X");
		Prod_Logout_x = prop1.getProperty("Prod_Logout_x");
		CBS_Tenant_x = prop1.getProperty("CBS_Tenant_x");
		Search_icon_x = prop1.getProperty("Search_icon_x");
		Search_Text_x = prop1.getProperty("Search_Text_x");
		Supportproject_x = prop1.getProperty("Supportproject_x");
		Asset_3doticon_x = prop1.getProperty("Asset_3doticon_x");
		Asset_title_x = prop1.getProperty("Asset_title_x");
		Asset_displaying_x = prop1.getProperty("Asset_displaying_x");
		rename_button_x  = prop1.getProperty("rename_button_x");
		Rename_Alert_pop_x = prop1.getProperty("Rename_Alert_pop_x");
		Download_x  = prop1.getProperty("Download_x");
		Download_initiated_alert_x = prop1.getProperty("Download_initiated_alert_x");
		Streaming_PreviewPanel_x = prop1.getProperty("Streaming_PreviewPanel_x");
		Asset_viewerpopup_x = prop1.getProperty("Asset_viewerpopup_x");
		Advance_popup_x  = prop1.getProperty("Advance_popup_x");
		Infor_popup_x = prop1.getProperty("Infor_popup_x");
		Editor_popup_x = prop1.getProperty("Editor_popup_x");
		Player_slow_x = prop1.getProperty("Player_slow_x");
		Player_previousfram_x = prop1.getProperty("Player_previousfram_x");
		Player_playpause_x = prop1.getProperty("Player_playpause_x"); 
		Player_nextfram_x = prop1.getProperty("Player_nextfram_x");
		Preview_playerpause_x = prop1.getProperty("Preview_playerpause_x");
		Search_Autosuggestion_x = prop1.getProperty("Search_Autosuggestion_x");
		Search_Autosuggestion2_x = prop1.getProperty("Search_Autosuggestion2_x");
		Editor_playerbinbar_x = prop1.getProperty("Editor_playerbinbar_x");
		Add_Folder_x = prop1.getProperty("Add_Folder_x");
		Add_Folder_Title_x = prop1.getProperty("Add_Folder_Title_x");
		Save_Folder_x = prop1.getProperty("Save_Folder_x");
		Add_Folder_Alert_x = prop1.getProperty("Add_Folder_Alert_x");
		Edit_Folder_x = prop1.getProperty("Edit_Folder_x");
		RemoveText_x = prop1.getProperty("RemoveText_x");
		Asset_name_x = prop1.getProperty("Asset_name_x");
		Editor_player_pause_x  = prop1.getProperty("Editor_player_pause_x");
		Editor_player_stop_x  = prop1.getProperty("Editor_player_stop_x");
		Editor_player_close_x = prop1.getProperty("Editor_player_close_x");
		Edior_saveno_x = prop1.getProperty("Edior_saveno_x");
		Download_tab_x = prop1.getProperty("Download_tab_x");
		Download_status_x = prop1.getProperty("Download_status_x");
		Automation_folder_x = prop1.getProperty("Automation_folder_x");
		Upload_Btn_x =  prop1.getProperty("Upload_Btn_x");
		Browse_Btn_x = prop1.getProperty("Browse_Btn_x");
		Asset_thumbnail_x = prop1.getProperty("Asset_thumbnail_x");
		Asset_rename_X = prop1.getProperty("Asset_rename_X");
		Action_List_X = prop1.getProperty("Action_List_X");
		Input_Filed_X = prop1.getProperty("Input_Filed_X");
		Save_BTN_X = prop1.getProperty("Save_BTN_X");
		Alert_Yes_BTN_X = prop1.getProperty("Alert_Yes_BTN_X");
		Asset_title_X = prop1.getProperty("Asset_title_X");
		Alert_MSG_X = prop1.getProperty("Alert_MSG_X");
		Asset_Copy_X = prop1.getProperty("Asset_Copy_X");
		Move_To_Folder_X = prop1.getProperty("Move_To_Folder_X");
		Copy_Now_BTN_X = prop1.getProperty("Copy_Now_BTN_X");
		Asset_Move_X = prop1.getProperty("Asset_Move_X");
		folder_From_X = prop1.getProperty("folder_From_X");
		Move_Asset_thumbnail_x = prop1.getProperty("Move_Asset_thumbnail_x");
		Paste_x =  prop1.getProperty("Paste_x");
		Paste_Alert_x =  prop1.getProperty("Paste_Alert_x");
		Rename_BTN_Alert_x =  prop1.getProperty("Rename_BTN_Alert_x");
		Prod_folder_X =  prop1.getProperty("Prod_folder_X");
		Upload_Browse_x =  prop1.getProperty("Upload_Browse_x");
		Automation_Folder_x =  prop1.getProperty("Automation_Folder_x");
		Aspera_Upload_Continue_x =  prop1.getProperty("Aspera_Upload_Continue_x");
		Upload_complete_x = prop1.getProperty("Upload_complete_x");
		Upload_rename_X  = prop1.getProperty("Upload_rename_X");
		Upload_Close_X  = prop1.getProperty("Upload_Close_X");
		Upload_Percentage_x = prop1.getProperty("Upload_Percentage_x");
		Asset_Delete_X = prop1.getProperty("Asset_Delete_X");
		Alert_Delete_Yes_X = prop1.getProperty("Alert_Delete_Yes_X");
		Check_Box_Documents_X = prop1.getProperty("Check_Box_Documents_X");
		Copy_To_FOlder_Second_screen = prop1.getProperty("Copy_To_FOlder_Second_screen");
		Advance_Btn_X = prop1.getProperty("Advance_Btn_X");
		Information_DropDown_X = prop1.getProperty("Information_DropDown_X");
		Essence_tab_X = prop1.getProperty("Essence_tab_X");
		Three_dots_X = prop1.getProperty("Three_dots_X");
		Reupload_X = prop1.getProperty("Reupload_X");
		UPdate_Method_X =  prop1.getProperty("UPdate_Method_X");
		REupload_Alert_x = prop1.getProperty("REupload_Alert_x");
		Browse_BTN_X =  prop1.getProperty("Browse_BTN_X");
		Close_POPUP_X = prop1.getProperty("Close_POPUP_X");
		Asset_Viewer_close = prop1.getProperty("Asset_Viewer_close");
		Alert_Continue_X = prop1.getProperty("Alert_Continue_X");
		Turner_Tenent_X = prop1.getProperty("Turner_Tenent_X");
		Copy_To_FOlder_Second_screen_Turner =prop1.getProperty("Copy_To_FOlder_Second_screen_Turner");
		Move_To_Folder_Turner_X = prop1.getProperty("Move_To_Folder_Turner_X");
		Upload_Status_x  = prop1.getProperty("Upload_Status_x");
		Upload_Close_x = prop1.getProperty("Upload_Close_x");
		Upload_tab_x = prop1.getProperty("Upload_tab_x");
		Upload_Tab_Status_x = prop1.getProperty("Upload_Tab_Status_x");
		Upload_Tab_Close_x = prop1.getProperty("Upload_Tab_Close_x");
		Upload_Initiated_x = prop1.getProperty("Upload_Initiated_x");
		Essence_Download_x = prop1.getProperty("Essence_Download_x");;
		Confirm_Password_x= prop1.getProperty("Confirm_Password_x");
		Confirm_x= prop1.getProperty("Confirm_x");
		Essence_Download_alert_x= prop1.getProperty("Essence_Download_alert_x");
		Delete_x= prop1.getProperty("Delete_x");
		Control_Player_x= prop1.getProperty("Control_Player_x");
		seek_bar_x = prop1.getProperty("seek_bar_x");
		sort_icon_x = prop1.getProperty("sort_icon_x");
		sort_desc_x = prop1.getProperty("sort_desc_x");
		Alert_popup_x  = prop1.getProperty("Alert_popup_x");
		Yes_Alert_x  = prop1.getProperty("Yes_Alert_x");
		Search_results_x = prop1.getProperty("Search_results_x");
		 Player_Control_Pin_x  = prop1.getProperty("Player_Control_Pin_x");
	        Asset_Viewer_Timecounter_x  = prop1.getProperty("Asset_Viewer_Timecounter_x");
	        Player_Quick_Browser_x = prop1.getProperty("Player_Quick_Browser_x");
	        Player_screen_x = prop1.getProperty("Player_screen_x");
	        Player_Slower_icon_x = prop1.getProperty("Player_Slower_icon_x");
	        Player_Faster_icon_x = prop1.getProperty("Player_Faster_icon_x");
	        Player_Previous_Frame_x = prop1.getProperty("Player_Previous_Frame_x");
	        Player_Next_Frame_x = prop1.getProperty("Player_Next_Frame_x");
	        Player_Volume_x = prop1.getProperty("Player_Volume_x");
	        Player_setting_icon_x  = prop1.getProperty("Player_setting_icon_x");
	        Player_frames_x = prop1.getProperty("Player_frames_x");
	        Player_quality_x = prop1.getProperty("Player_quality_x");
	        Player_Full_Screen = prop1.getProperty("Player_Full_Screen");
	        Player_help_icon_x = prop1.getProperty("Player_help_icon_x");
	        Player_Help_ok_x = prop1.getProperty("Player_Help_ok_x");
	        Player_pause_x = prop1.getProperty("Player_pause_x");
	        Preview_pause_x = prop1.getProperty("Preview_pause_x");
	        Turner_Copy_X = prop1.getProperty("Turner_Copy_X");
		}

}
