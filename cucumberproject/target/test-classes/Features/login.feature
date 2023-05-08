Feature: feature to test login and logout functionality

  Scenario: Check login is successful with valid credentials
    Given user is on Loginpage
    When user enters username and password and language
    And clicks on login button
    Then user is navigated to home page
    
    
    Scenario: check user is successfully logout from the application
    Given user is on Homepage
    When user clicked logout button
    Then user successfully logged out of CP

 