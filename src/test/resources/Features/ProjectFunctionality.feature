Feature: To check the project functionality

  Scenario: Project Functionality Validation Update Project
    Given user is on login page of KTM
    Given user logged in
    And click on project module
    And click on project trainee
    And click on update project button
    And enter data in mandatory fields
    When user clicks on update btn
    Then updated successfully pop will appear
    And redirected to the project screen

  Scenario: Project Functionality Validation With Null Fields
    Given user is on login page of KTM
    Given user logged in
    And click on project module
    And click on project trainee
    And click on update project button
    And Make mandatory fields null
    When user clicks on update btn
    Then Required line will display

  Scenario: Project Functionality Validation For Cancel BTN
    Given user is on login page of KTM
    Given user logged in
    And click on project module
    And click on project trainee
    And click on update project button
    And enter data in mandatory fields
    And user clicks on cancel

  Scenario: Project Functionality Validation Columns Verification
    Given user is on login page of KTM
    Given user logged in
    And click on project module
    And click on project trainee
    Then Verify all the columns

  Scenario: Project Functionality Validation Project Copy
    Given user is on login page of KTM
    Given user logged in
    And click on project module
    And click on copy

  Scenario: Project Functionality Validation Project Delete
    Given user is on login page of KTM
    Given user logged in
    And click on project module
    And click on delete

  Scenario: Project Functionality Validation Project Delete Cancel
    Given user is on login page of KTM
    Given user logged in
    And click on project module
    And click on delete function
    And click on cancel

  Scenario: Project Functionality Validation Archive BUTN
    Given user is on login page of KTM
    Given user logged in
    And click on project module
    Then click on archive button
