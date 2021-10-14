Feature: ClearPC_Features_CBS

  @Sanity @T1Login_Logout_ClearPC
  Scenario: Login_Logout_Scenario
    Given Open Browser and naviagate to the ClearPC portal
    When Enter the valid user name in username input field
    Then Click on Continue button of ClearPC
    And Enter the Valid password in the Password input field
    And Click on Login button of ClearPC
    Then Click on Logout button from ClearPC
    Then Quit the browser for ClearPC

  @Sanity @T2Search_Autosuggestion_ClearPC
  Scenario: Search_Autosuggestion_Scenario
    Given Open Browser and naviagate to the ClearPC portal
    When Enter the valid user name in username input field
    Then Click on Continue button of ClearPC
    And Enter the Valid password in the Password input field
    And Click on Login button of ClearPC
    And Click on Search icon
    And Enter text value in Search field
    And Search for asset
    Then Validate Search asset is displaying correctly
    Then Click on Logout button from ClearPC
    Then Quit the browser for ClearPC

  @T3Streaming_ClearPC
  Scenario: Streaming_Scenario
    Given Open Browser and naviagate to the ClearPC portal
    When Enter the valid user name in username input field
    Then Click on Continue button of ClearPC
    And Enter the Valid password in the Password input field
    And Click on Login button of ClearPC
    And Click on Search icon
    And Enter text value in Search field
    And Search for the asset
    And Validate Advance player functionality
    And Validate Information player functionality
    And Validate Editor player functionality
    Then Click on Logout button from ClearPC
    Then Quit the browser for ClearPC

  @Sanity @T4HTTPDownload_ClearPC
  Scenario: HTTP_Download_Scenario
    Given Open Browser and naviagate to the ClearPC portal
    When Enter the valid user name in username input field
    Then Click on Continue button of ClearPC
    And Enter the Valid password in the Password input field
    And Click on Login button of ClearPC
    And Click on Search icon
    And Enter test file value in Search field
    And Search for test asset
    And Select Download Operation without aspera from dropdown
    Then Click on Logout button from ClearPC
    Then Quit the browser for ClearPC

  @Sanity @T5AddandEditFolder_ClearPC
  Scenario: AddandEditFolder_Scenario
    Given Open Browser and naviagate to the ClearPC portal
    When Enter the valid user name in username input field
    Then Click on Continue button of ClearPC
    And Enter the Valid password in the Password input field
    And Click on Login button of ClearPC
    And Navigate to Tenant Project Folder
    And Click on Add Folder icon
    And Enter Title in Add Folder pop up
    And Validate Folder is Created sucessfully
    And Validate Newly created folder is searchable
    And Validate Newly created folder is editable
    And Validate edited folder is searchable
    Then Click on Logout button from ClearPC
    Then Quit the browser for ClearPC

  @Sanity @T6Folder_management_ClearPC
  Scenario: Folder_management_Scenario
    Given Open Browser and naviagate to the ClearPC portal
    When Enter the valid user name in username input field
    Then Click on Continue button of ClearPC
    And Enter the Valid password in the Password input field
    And Click on Login button of ClearPC
    And Navigate inside subfolder of cbs
    And Right Click on rename and update the name
    And Right click on the asset and Copy the file to other location
    And Right click on the asset and Move the file and paste to other location
    And Click on Logout button from ClearPC
    Then Quit the browser for ClearPC

  @Sanity @T7HTTPUpload_ClearPC
  Scenario: HTTPUpload_Scenario
    Given Open Browser and naviagate to the ClearPC portal
    When Enter the valid user name in username input field
    Then Click on Continue button of ClearPC
    And Enter the Valid password in the Password input field
    And Click on Login button of ClearPC
    And Navigate inside subfolder of cbs
    And Click on Upload button
    And Click on IBM Aspera Alert button for CBS tenant
    And Click on IBM Aspera Alert button for HTTP Upload
    And Click on browse link
    And Select File and Click Open button
    #   And Select File for Aspera Upload and Click Open button for CBS tenant
    And Validate file upload is initated
    And Validate File transfered is completed
    And Validate File Upload Status is Completed in Notification Upload Tab for CBS
    And Click on Logout button from ClearPC
    Then Quit the browser for ClearPC

  @Sanity @T8Essence_Upload
  Scenario: Validate_Essence_Upload_Scenario
    Given Open Browser and naviagate to the ClearPC portal
    When Enter the valid user name in username input field
    Then Click on Continue button of ClearPC
    And Enter the Valid password in the Password input field
    And Click on Login button of ClearPC
    And Navigate inside subfolder of cbs
    And Double Click on Asset and go to essence tab for cbs
    And Click on Essence reupload Select File and Click Open button for cbs
    And Click on Logout button from ClearPC
    Then Quit the browser for ClearPC

  @Sanity @T9Essence_Download
  Scenario: Validate_Essence_Download_feature
    Given Open Browser and naviagate to the ClearPC portal
    When Enter the valid user name in username input field
    Then Click on Continue button of ClearPC
    And Enter the Valid password in the Password input field
    And Click on Login button of ClearPC
    And Navigate inside subfolder of cbs
    And Double Click on Asset document and go to essence tab for cbs
    And Click on Download Option
    And Validate Essence Download is initiated
    And Click on Logout button from ClearPC
    Then Quit the browser for ClearPC

  @T10Upload_existing_file_delete_clearPC
  Scenario: Upload_existing_file_folder_and_delete_clearPC
    Given Open Browser and naviagate to the ClearPC portal
    When Enter the valid user name in username input field
    Then Click on Continue button of ClearPC
    And Enter the Valid password in the Password input field
    And Click on Login button of ClearPC
    And Navigate inside subfolder of cbs
    And Click on Search icon
    And Search for uploaded asset
    And Click on three dots icon on the thumbnail
    And Click on delete button from down
    And Click on Logout button from ClearPC
    Then Quit the browser for ClearPC
