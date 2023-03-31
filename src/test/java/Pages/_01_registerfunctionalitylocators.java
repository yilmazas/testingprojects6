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
    public WebElement registerButton;

    @FindBy(id = "customer.firstName")
    public WebElement firstName;
//
//    @FindBy(id = "customer.lastName")
//    public WebElement lastName;
//
//    @FindBy(id = "customer.address.street")
//    public WebElement address;

//    @FindBy(id = "customer.firstName")
//    public WebElement firstName;
//
//    @FindBy(id = "customer.firstName")
//    public WebElement firstName;
//
//    @FindBy(id = "customer.firstName")
//    public WebElement firstName;


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
