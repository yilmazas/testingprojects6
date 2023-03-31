Feature: Account managements
  Scenario: Register Functionality
    Given Navigate to the ParaBank
    When  Create an account
    Then Success message should be displayed

    Scenario: Login Functionality
      Given Navigate to the ParaBank
      When Enter your valid username and password
      Then User should successfully login to the system
      And User should logout from the system
      And Enter invalid username and password

