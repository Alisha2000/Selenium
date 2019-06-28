package TestNG_Intro;

import Pages.WebOrderLoginPage;
import Utilities.PropertiesFileIntro;
import org.testng.annotations.Test;

import java.io.IOException;


public class PropertiesPractice extends TestBase {
    WebOrderLoginPage page=new WebOrderLoginPage();

    @Test
    public void loginTest() throws IOException {
        System.out.println("we are in "+ PropertiesFileIntro.getValue("environment") );

        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        page.username.sendKeys(PropertiesFileIntro.getValue("login"));
        page.password.sendKeys(PropertiesFileIntro.getValue("password"));
        page.loginButton.click();


    }
}
