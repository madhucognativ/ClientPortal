Feature: feature to create a subarctic survival situation

  Scenario: Check login is successful with valid credentials
    Given user is on login page
    When user enters username and password and language
    And clicks on login button
    Then user is navigated to home page

  Scenario: create a LSI Project
    Given user on Home Page
    When user clicks on create Project
    And user selects Life styles Inventory project
    And user selects LSI1 Real Time Feedback
    And User Selects language
    And user clicks on get started 
    And user clicks on next Timeline
    And user enters deadline for completing surveys
    And user clicks on information for email
    And user enters information for email 
    And user clicks on submit 
    
    
    And user enters the the form data
    And user clicks on create button
    And user enters teams and participants
    And user clicks on Save
    Then SSS project is created

  Scenario: SSS project simulation
    Given user on project page
    And user clicks on Go to Simulation
    Then user is navigated to session page

  Scenario: SSS project session
    Given user on session page
    And user clicks on open session
    Then user will see session url and session code

  Scenario: complete facilitator walkthrough to start simulation
    Given user on facilitator walkthrough
    When user clicks on start simulation
    And user clicks goto video
    And user clicks on start individual ranking
    And user clicks on continue
    And user clicks on team ranking
    And user clicks on start experts ranking
    And user clicks on reveal expert ranking items manually
    And user clicks on goto scoring
    And user clicks on go to teams scoring
    And user clicks on goto scoring summary
    And user clicks on goto team gains and synergy
    And user clicks on view team metrics
    Then user ia able to start simulation

  Scenario: complete SSS project ranking
    Given user is on project planning situation
    When user enters session code
    And user clicks on submit
    And user selects name and submit
    And user clicks on start individual ranking
    And user clicks on submit
    And user clicks on submit for team review
    And user clicks on confirm team ranking
    And user clicks on goto scoring
    And user clicks on goto team scoring
    And user clicks on goto scoring summary
    And user clicks on goto team gains and synergy
    Then user clicks on finish simulation
