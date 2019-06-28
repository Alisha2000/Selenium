package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class play {
  public play (){
      PageFactory.initElements(Driver.getDriver("firefox"), this);
  }

}
