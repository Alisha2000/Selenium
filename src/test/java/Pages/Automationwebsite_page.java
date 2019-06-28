package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Automationwebsite_page {
    public Automationwebsite_page(){
        PageFactory.initElements(Driver.getDriver("chrome"),this);
    }

    @FindBy(id="search_query_top")
    public WebElement searchBox;

    @FindBy(xpath = "//button[@class='btn btn-default button-search']")
    public WebElement searchButton;

    @FindBy(className = "product-description")
    public List<WebElement>productDescription;

}
