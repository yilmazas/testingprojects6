Feature: Login MultiScenario

  Background:
  Given Navigate to the ParaBank

  Scenario Outline: Login Functionality

    When Enter your valid  "<username>" and "<password>"
    Then User should successfully login to the system
    And User should logout from the system


    When Enter invalid "<username>" and valid "<password>"
    Then Unsuccessfulll attempt should be displayed


    When Enter valid "<username>" and invalid "<password>"
    Then Unsuccessfulll attempt should be displayed

    Examples:
      | username | password|
      |



