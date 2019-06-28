package Pages;

import TestNG_Intro.TestBase;
import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage  {



    public HomePage(){

        PageFactory.initElements(Driver.getDriver("chrome"),this);
    }
    @FindBy(id="tab-flight-tab-hp")
    public WebElement flightButton;

    @FindBy(xpath = "//input[@id='flight-origin-hp-flight']")
    public  WebElement flyingFrom;


    @FindBy(xpath = "//input[@id='flight-destination-hp-flight']")
    public WebElement flyingTO;















}
