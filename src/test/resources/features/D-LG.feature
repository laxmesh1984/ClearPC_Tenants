Feature: ClearPC_Features_LG
  

  @T1Login_Logout_ClearPC
  Scenario: Login_Logout_Feature
    Given Open Browser and naviagate to the LG portal
    When Enter the valid user name in username input field LG portal
    Then Click on Continue button of LG portal
    And Enter the Valid password in the Password input field LG portal
    And Click on Login button of LG portal
    Then Click on Logout button from LG portal
    Then Quit the browser for LG portal
    
    
    @T2Search_Autosuggestion_ClearPC
    Scenario: Search_Autosuggestion_Feature
    Given Open Browser and naviagate to the LG portal
    When Enter the valid user name in username input field LG portal
    Then Click on Continue button of LG portal
    And Enter the Valid password in the Password input field LG portal
    And Click on Login button of LG portal
    And Click on Search icon LG portal
    And Enter text value in Search field LG portal
    And Search for asset LG portal
    Then Validate Search asset is displaying correctly LG portal
    Then Click on Logout button from LG portal
    Then Quit the browser for LG portal
    
    @T3Streaming_ClearPC
    Scenario: Streaming_Feature
    Given Open Browser and naviagate to the LG portal
    When Enter the valid user name in username input field LG portal
    Then Click on Continue button of LG portal
    And Enter the Valid password in the Password input field LG portal
    And Click on Login button of LG portal
    And Click on Search icon LG portal
    And Enter text value in Search field LG portal
    And Search for the asset LG portal
    And Validate Advance player functionality LG portal
    And Validate Information player functionality LG portal
    And Validate Editor player functionality LG portal
    Then Click on Logout button from  LG portal
    Then Quit the browser for  LG portal
    
    @T4HTTPDownload_ClearPC
    Scenario: Streaming_Feature
    Given Open Browser and naviagate to the LG portal
    When Enter the valid user name in username input field LG portal
    Then Click on Continue button of LG portal
    And Enter the Valid password in the Password input field LG portal
    And Click on Login button of LG portal
    And Click on Search icon LG portal
    And Enter test file value in Search field LG portal
    And Search for test asset LG portal
    And Select Download Operation without aspera from dropdown LG portal
    Then Click on Logout button from LG portal
    Then Quit the browser for LG portal
    
    @T5AddandEditFolder_ClearPC
    Scenario: AddandEditFolder_Feature
    Given Open Browser and naviagate to the LG portal
    When Enter the valid user name in username input field LG portal
    Then Click on Continue button of LG portal
    And Enter the Valid password in the Password input field LG portal
    And Click on Login button of LG portal
    And Navigate to Tenant Project Folder LG portal
    And Click on Add Folder icon LG portal
    And Enter Title in Add Folder pop up LG portal
    And Validate Folder is Created sucessfully LG portal
    And Validate Newly created folder is searchable LG portal
    And Validate Newly created folder is editable LG portal
    And Validate edited folder is searchable LG portal
    Then Click on Logout button from LG portal
    Then Quit the browser for LG portal
    
    @T6Folder_management_ClearPC
    Scenario: Folder_management
    Given Open Browser and naviagate to the LG portal
    When Enter the valid user name in username input field LG portal
    Then Click on Continue button of LG portal
    And Enter the Valid password in the Password input field LG portal
    And Click on Login button of LG portal
    And Navigate inside subfolder LG portal
    And Right Click on rename and update the name LG portal
    And Right click on the asset and Copy the file to other location LG portal LG portal
    And Right click on the asset and Move the file and paste to other location LG portal
    And  Click on Logout button from LG portal
    Then Quit the browser for LG portal
    
    @T7HTTPUpload_ClearPC
    Scenario: HTTPUpload_Feature
    Given Open Browser and naviagate to the LG portal
    When Enter the valid user name in username input field LG portal
    Then Click on Continue button of LG portal
    And Enter the Valid password in the Password input field LG portal
    And Click on Login button of LG portal
    And Navigate inside subfolder LG portal
    And Click on Upload button LG portal
    And Click on IBM Aspera Alert button for HTTP upload LG portal
    And Click on browse link LG portal
    And Select File and Click Open button LG portal
    And Validate HTTP fileupload is initated LG portal
    And Validate File transfered is completed LG portal 
    And  Click on Logout button from LG portal
    Then Quit the browser for LG portal
   
     @T8Essence_Upload
    Scenario: Validate_Essence_Upload_feature LG portal
    Given Open Browser and naviagate to the LG portal
    When Enter the valid user name in username input field LG portal
    Then Click on Continue button of LG portal
    And Enter the Valid password in the Password input field LG portal
    And Click on Login button of LG portal
    And Navigate inside subfolder LG portal
    And Double Click on Asset and go to essence tab LG portal
    And Click on Essence reupload Select File and Click Open button LG portal
    And  Click on Logout button from LG portal
    Then Quit the browser for LG portal