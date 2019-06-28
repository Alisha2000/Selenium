package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FacebookLoginPage {
    public FacebookLoginPage(){
        PageFactory.initElements(Driver.getDriver("chrome"), this);
    }

     @FindBy(xpath = "//input[@name='st.email']")
    public WebElement username;

     @FindBy(xpath = "//input[@type='password']")
      public WebElement password;

     @FindBy(xpath = "//input[@class='button-pro __wide']")
      public WebElement login;

     @FindBy(xpath = "(//div[@class='tico null'])[4]")
    public WebElement photo;
     @FindBy(xpath = "//a[@data-l='t,open-card']")
    public WebElement photo2;

     @FindBy(xpath = "//span[@class='widget_ico ic_klass']")
    public WebElement mylike;

     @FindBy(xpath= "(//div[@class='toolbar_nav_i_ic'])[4]")
      public WebElement friends;



     @FindBy(xpath = "//div[@class='cover_ov_t_r']")
    public WebElement random;


}
