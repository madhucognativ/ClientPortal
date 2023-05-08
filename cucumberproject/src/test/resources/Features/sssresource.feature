Feature: feature to test subarctic survival situation

  Scenario: Check login is successful with valid credentials
    Given user is on Loginpage
    When user enters username and password and language
    And clicks on login button
    Then user is navigated to home page

  Scenario: Navigate to Menu Items
    Given user is on client portal homepage
    When user clicks on Resources
    And user clicks on menu
    Then user can navigate to sss menu items

  Scenario: Verify facilitator materials for SS
    Given user is on sss resources menu items
    When user clicks on SSS facilitator materials
    And user clicks on SSS download items
    Then user is able to download the ss PDFs

  Scenario: Verify problem solving model for SSS
    Given user is on ss facilitator page
    When user clicks on ss problem solving model
    Then user is able to verify the ss model

  Scenario: Verify situation and challenge for SSS
    Given user is on ss problem solving page
    When user clicks on ss situation and challenge
    Then user is able to verify the SSS situation
    And user is able to verify the SSS challenge

  Scenario: check user is successfully logout form the application
    Given user is on Homepage
    When user clicked logout button
    Then user successfully logged out of CP
