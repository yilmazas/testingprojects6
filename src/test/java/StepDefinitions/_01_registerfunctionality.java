package StepDefinitions;

import Pages._01_registerfunctionalitylocators;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _01_registerfunctionality {

    _01_registerfunctionalitylocators elements= new _01_registerfunctionalitylocators();
    @Given("Navigate to the ParaBank")
    public void navigateToTheParaBank() {

        GWD.getDriver().get("https://parabank.parasoft.com/parabank/index.htm");

    }

    @When("Create an account")
    public void createAnAccount() {

        elements.registerButton.click();
        Actions actions= new Actions(GWD.getDriver());
        Action action= actions.click(elements.firstName)
                .sendKeys("Hasan")
                .sendKeys(Keys.TAB)
                .sendKeys("Yildiz")
                .sendKeys(Keys.TAB)
                .sendKeys("cengaver caddesi")
                .sendKeys(Keys.TAB)
                .sendKeys("ankara")
                .sendKeys(Keys.TAB)
                .sendKeys("arizona")
                .sendKeys(Keys.TAB)
                .sendKeys("1234")
                .sendKeys(Keys.TAB)
                .sendKeys("05435678906")
                .sendKeys(Keys.TAB)
                .sendKeys("1237895")
                .sendKeys(Keys.TAB)
                .sendKeys("haskal")
                .sendKeys(Keys.TAB)
                .sendKeys("jhfr657sd")
                .sendKeys(Keys.TAB)
                .sendKeys("jhfr657sd")
                .sendKeys(Keys.TAB).sendKeys(Keys.ENTER).build();
                action.perform();

    }

    @Then("Success message should be displayed")
    public void successMessageShouldBeDisplayed() {
    }
}
