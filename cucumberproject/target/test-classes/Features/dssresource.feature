Feature: feature to test desert survival situation

  Scenario: Check login is successful with valid credentials
    Given user is on Loginpage
    When user enters username and password and language
    And clicks on login button
    Then user is navigated to home page

  Scenario: Navigate to Menu Items
    Given user is on client portal homepage
    When user clicks on Resources
    And user clicks on menu
    Then user can navigate to dss menu items

  Scenario: Verify facilitator materials for DSS
    Given user is on dss resources menu items
    When user clicks on DSS facilitator materials
    And user clicks on DSS download items
    Then user is able to download the dss PDFs

  Scenario: Verify problem solving model for DSS
    Given user is on facilitator page
    When user clicks on problem solving model of dss
    Then user is able to verify the model of dss

  Scenario: Verify situation and challenge for DSS
    Given user is on dss problem solv page
    When user clicks on situation and challenge of dss
    Then user is able to verify the desert situation
    And user is able to verify the challenge

  Scenario: check user is successfully logout form the application
    Given user is on Homepage
    When user clicked logout button
    Then user successfully logged out of CP
