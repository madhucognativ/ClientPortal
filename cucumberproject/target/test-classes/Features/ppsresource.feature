Feature: feature to test project planning situation
  Scenario: Check login is successful with valid credentials
    Given user is on Loginpage
    When user enters username and password and language
    And clicks on login button
    Then user is navigated to home page

  Scenario: Navigate to Menu Items
    Given user is on client portal homepage
    When user clicks on Resources
    And user clicks on menu
    Then user can navigate to menu items of pps

  Scenario: Verify facilitator materials for PPS
    Given user is on resources menu items of pps
    When user clicks on PPS facilitator materials
    And user clicks on PPS download items 
    Then user is able to download the pps PDFs 

  Scenario: Verify problem solving model for PPS
    Given user is on pps facilitator page 
    When user clicks on problem solving model of pps
    Then user is able to verify the model of pps

  Scenario: Verify situation and challenge for PPS
    Given user is on pps problem solv page
    When user clicks on pps situation and challenge
    Then user is able to verify the pps situation
    And user is able to verify the pps challenge 

  Scenario: check user is successfully logout form the application
    Given user is on Homepage
    When user clicked logout button
    Then user successfully logged out of CP
