Feature: Login MultiScenario

  Background:
  Given Navigate to the ParaBank

  Scenario Outline: Login Functionality

    When Enter your valid  "<valid username>" and "<valid password>"
    And User should successfully login to the system
    Then User should logout from the system

    When Enter valid "<valid username>" and invalid "<invalid password>"
    Then Unsuccessfull attempt should be displayed


    When Enter invalid "<invalid username>" and valid "<valid password>"
    Then Unsuccessfull attempt should be displayed


    Examples:
      | valid password | valid username | invalid password|invalid username|
      |12345566        | cihan101       |4543534          |4543rfds        |









