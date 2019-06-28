package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage {
    public ContactPage(){
        PageFactory.initElements(Driver.getDriver("chrome"), this);

    }
    @FindBy(xpath = "//label[@for='id_contact']")
    public WebElement subjectTitle;
    @FindBy(xpath = "//label[@for=\'email\']")
    public WebElement emailAddress;
}
