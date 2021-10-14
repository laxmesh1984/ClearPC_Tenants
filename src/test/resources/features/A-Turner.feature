Feature: ClearPC_Features_Turner

  @Sanity @T1Login_Logout_ClearPC_Turner
  Scenario: Login_Logout_Feature
    Given Open Browser and naviagate to the Turner portal
    When Enter the valid user name in username input field Turner portal
    Then Click on Continue button of Turner portal
    And Enter the Valid password in the Password input field Turner portal
    And Click on Login button of Turner portal
    Then Click on Logout button from Turner portal
    Then Quit the browser for Turner portal

  @Sanity @T2Search_Autosuggestion_ClearPC_Turner
  Scenario: Search_Autosuggestion_Feature
    Given Open Browser and naviagate to the Turner portal
    When Enter the valid user name in username input field Turner portal
    Then Click on Continue button of Turner portal
    And Enter the Valid password in the Password input field Turner portal
    And Click on Login button of Turner portal
    And Click on Search icon Turner portal
    And Enter text value in Search field Turner portal
    And Search for asset Turner portal
    Then Validate Search asset is displaying correctly Turner portal
    Then Click on Logout button from Turner portal
    Then Quit the browser for Turner portal

  @T3Streaming_ClearPC_Turner
  Scenario: Streaming_Feature
    Given Open Browser and naviagate to the Turner portal
    When Enter the valid user name in username input field Turner portal
    Then Click on Continue button of Turner portal
    And Enter the Valid password in the Password input field Turner portal
    And Click on Login button of Turner portal
    And Click on Search icon Turner portal
    And Enter text value in Search field Turner portal
    And Search for the asset Turner portal
    And Validate Advance player functionality Turner portal
    And Validate Information player functionality Turner portal
    And Validate Editor player functionality Turner portal
    Then Click on Logout button from Turner portal
    Then Quit the browser for Turner portal

  @Sanity @T4HTTPDownload_ClearPC_Turner
  Scenario: HTTPDownload_ClearPC_Turner
    Given Open Browser and naviagate to the Turner portal
    When Enter the valid user name in username input field Turner portal
    Then Click on Continue button of Turner portal
    And Enter the Valid password in the Password input field Turner portal
    And Click on Login button of Turner portal
    And Click on Search icon Turner portal
    And Enter test file value in Search field Turner portal
    And Search for test asset Turner portal
    And Select Download Operation without aspera from dropdown Turner portal
    Then Click on Logout button from Turner portal
    Then Quit the browser for Turner portal

  @Sanity @T5AddandEditFolder_ClearPC_Turner
  Scenario: AddandEditFolder_Feature
    Given Open Browser and naviagate to the Turner portal
    When Enter the valid user name in username input field Turner portal
    Then Click on Continue button of Turner portal
    And Enter the Valid password in the Password input field Turner portal
    And Click on Login button of Turner portal
    And Navigate to Tenant Project Folder Turner portal
    And Click on Add Folder icon Turner portal
    And Enter Title in Add Folder pop up Turner portal
    And Validate Folder is Created sucessfully Turner portal
    And Validate Newly created folder is searchable Turner portal
    And Validate Newly created folder is editable Turner portal
    And Validate edited folder is searchable Turner portal
    Then Click on Logout button from Turner portal
    Then Quit the browser for Turner portal

  @Sanity @T6Folder_management_ClearPC_Turner
  Scenario: Folder_management
    Given Open Browser and naviagate to the Turner portal
    When Enter the valid user name in username input field Turner portal
    Then Click on Continue button of Turner portal
    And Enter the Valid password in the Password input field Turner portal
    And Click on Login button of Turner portal
    And Navigate to inside subfolder Turner portal
    And Right Click on rename and update the name Turner portal
    And Right click on the asset and Copy the file to other location Turner portal Turner portal
    And Right click on the asset and Move the file and paste to other location Turner portal
    And Click on Logout button from Turner portal
    Then Quit the browser for Turner portal

  @Sanity @T7HTTPUpload_ClearPC_Turner
  Scenario: HTTPUpload_Feature
    Given Open Browser and naviagate to the Turner portal
    When Enter the valid user name in username input field Turner portal
    Then Click on Continue button of Turner portal
    And Enter the Valid password in the Password input field Turner portal
    And Click on Login button of Turner portal
    And Navigate inside subfolder Turner portal
    And Click on Upload button Turner portal
    And Click on IBM Aspera Alert button for HTTP upload Turner portal
    And Click on browse link Turner portal
    And Select File and Click Open button Turner portal
    And Validate HTTP fileupload is initated Turner portal
    And Validate File transfered is completed Turner portal
    And Validate File Upload Status is Completed in Notification Upload Tab
    And Click on Logout button from Turner portal
    Then Quit the browser for Turner portal

  @Sanity @T8Essence_Upload_Turner
  Scenario: Validate_Essence_Upload_feature Turner portal
    Given Open Browser and naviagate to the Turner portal
    When Enter the valid user name in username input field Turner portal
    Then Click on Continue button of Turner portal
    And Enter the Valid password in the Password input field Turner portal
    And Click on Login button of Turner portal
    And Navigate inside test subfolder Turner portal
    And Double Click on Asset and go to essence tab Turner portal
    And Click on Essence reupload Select File and Click Open button Turner portal
    And Click on Logout button from Turner portal
    Then Quit the browser for Turner portal

  @Sanity @T9Essence_Download_Turner
  Scenario: Validate_Essence_Download_feature_Turner
    Given Open Browser and naviagate to the Turner portal
    When Enter the valid user name in username input field Turner portal
    Then Click on Continue button of Turner portal
    And Enter the Valid password in the Password input field Turner portal
    And Click on Login button of Turner portal
    And Navigate inside test subfolder Turner portal to download
    And Double Click on Asset and go to essence tab Turner portal
    And Click on Download Option Turner portal
    And Validate Essence Download is initiated Turner portal
    And Click on Logout button from Turner portal
    Then Quit the browser for Turner portal

  @T10Upload_existing_file_delete_clearPC
  Scenario: Upload_existing_file_folder_and_delete_clearPC
    Given Open Browser and naviagate to the Turner portal
    When Enter the valid user name in username input field Turner portal
    Then Click on Continue button of Turner portal
    And Enter the Valid password in the Password input field Turner portal
    And Click on Login button of Turner portal
    And Navigate inside subfolder Turner portal
    And Click on Search icon Turner portal
    And Search for uploaded asset Turner portal
    And Click on three dots icon on the thumbnail Turner portal
    And Click on delete button from down Turner portal
    And Click on Logout button from Turner portal
    Then Quit the browser for Turner portal
