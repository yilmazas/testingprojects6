package StepDefinitions;

import Pages._01_registerfunctionalitylocators;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _02_LoginFunctionality {

    _01_registerfunctionalitylocators elements= new _01_registerfunctionalitylocators();

    @When("Enter your valid  {string} and {string}")
    public void enterYourValidAnd(String username, String password) {

        elements.sendKeysFunction(elements.loginUsername,username );
        elements.sendKeysFunction(elements.loginPassword,password );
        elements.clickFunction(elements.loginButton);
    }



    @And("User should successfully login to the system")
    public void userShouldSuccessfullyLoginToTheSystem() {

        elements.verifyContainsTextFunction(elements.loginSuccessMessage,"Welcome");
    }

    @Then("User should logout from the system")
    public void userShouldLogoutFromTheSystem() {

        elements.clickFunction(elements.logoutLink);
    }


    @When("Enter valid {string} and invalid {string}")
    public void enterValidAndInvalid(String username, String password) {

        elements.sendKeysFunction(elements.loginUsername,username );
        elements.sendKeysFunction(elements.loginPassword,password );
        elements.clickFunction(elements.loginButton);
    }

    @Then("Unsuccessfull attempt should be displayed")
    public void unsuccessfullAttemptShouldBeDisplayed() {

        elements.verifyContainsTextFunction(elements.loginUnsuccessMessage,"could not be verified");
    }

    @When("Enter invalid {string} and valid {string}")
    public void enterInvalidAndValid(String username, String password) {

        elements.sendKeysFunction(elements.loginUsername,username );
        elements.sendKeysFunction(elements.loginPassword,password );
        elements.clickFunction(elements.loginButton);
    }
}
