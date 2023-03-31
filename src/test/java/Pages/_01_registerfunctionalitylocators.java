package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class _01_registerfunctionalitylocators extends Parent {
    public _01_registerfunctionalitylocators() {

        PageFactory.initElements(GWD.getDriver(), this);
    }

    @FindBy(linkText = "Register")
    public WebElement registerLink;

    @FindBy(id = "customer.firstName")
    public WebElement firstName;

    @FindBy(id = "customer.lastName")
    public WebElement lastName;

    @FindBy(id = "customer.address.street")
    public WebElement address;

    @FindBy(id = "customer.address.city")
    public WebElement city;

    @FindBy(id = "customer.address.state")
    public WebElement state;

    @FindBy(id = "customer.address.zipCode")
    public WebElement zipCode;

    @FindBy(id = "customer.phoneNumber")
    public WebElement phone;

    @FindBy(id = "customer.ssn")
    public WebElement SSN;

    @FindBy(id = "customer.username")
    public WebElement userName;

    @FindBy(id = "customer.password")
    public WebElement password;

    @FindBy(id = "repeatedPassword")
    public WebElement confirm;

    @FindBy(xpath = "(//input[@class='button'])[2]")
    public WebElement registerButton;

    @FindBy(xpath = "//p[text()='Your account was created successfully. You are now logged in.']")
    public WebElement successMessage;










//public WebElement getWebElement(String strButton){
//
//        switch (strButton){
//            case
//                return null;
//        }
//
//    }
//
}
