#Feature: feature to create a Project planning situation
#
  #Scenario: Check login is successful with valid credentials
    #Given user is on Loginpage
    #When user enters username and password and language
    #And clicks on login button
    #Then user is navigated to home page
#
  #Scenario: create a PPS Project
    #Given user is on client portal homepage
    #When user clicks on create Project
    #And user selects project planning situation
    #And user enters the the form data
    #And user clicks on create button
    #And user enters teams and participants
    #And user clicks on Save
    #Then PPS is Project created
#
  #Scenario: PPS project simulation
    #Given user on project page
    #And user clicks on Go to Simulation
    #Then user is navigated to session page
#
  #Scenario: PPS project session
    #Given user on session page
    #And user clicks on open session
    #Then user will see session url and session code
#
  #Scenario: complete facilitator walkthrough to start simulation
    #Given user on facilitator walkthrough
    #When user clicks on start simulation
    #And user clicks start individual sequence
    #And user clicks on continue
    #And user clicks on start team sequence
    #And user clicks on recommended sequence
    #And user clicks on reveal all
    #And user clicks on go to scoring
    #And user clicks on goto team scoring
    #And user clicks on got scoring summary
    #And user clicks on goto team gains and synergy
    #Then user is able to start simulation
#
  #Scenario: complete PPS project sequencing
    #Given user is on project planning situation
    #When user enters session code
    #And user clicks on submit
    #And user selects name and submit
    #And user clicks on start individual sequence
    #And user clicks on submit
    #And user clicks on submit for team review
    #And user clicks on confirm team sequence
    #And user clicks on goto scoring
    #And user clicks on goto team scoring
    #And user clicks on goto scoring summary
    #And user clicks on goto team gains and synergy
    #Then user clicks on finish simulation
