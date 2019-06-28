package TestNG_Intro;

import Pages.FacebookLoginPage;

import Utilities.FacebookPropertiesFile;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.io.IOException;

public class PropertiesFacebookPractice extends TestBase{
    JavascriptExecutor js;
    FacebookLoginPage page=new FacebookLoginPage();
    @Test
    public void test1() throws IOException, InterruptedException {
        js=(JavascriptExecutor)driver;
        driver.get("https://www.ok.ru/dk?st.cmd=anonymMain&st.layer.cmd=PopLayerClose");

        page.username.sendKeys(FacebookPropertiesFile.getValue("username"));
        page.password.sendKeys(FacebookPropertiesFile.getValue("password"));
        page.login.click();
        System.out.println(js.executeScript("return window.innerHeight"));

        js.executeScript("window.scrollBy(0,300)");

        page.photo.click();
        page.photo2.click();

        js.executeScript("window.scrollBy(0,100)");
        Actions action=new Actions(driver);
        action.moveToElement(page.mylike).perform();
        page.mylike.click();
        Thread.sleep(5000);
        page.mylike.click();

       Actions actionFriends=new Actions(driver);
       actionFriends.moveToElement(page.friends).perform();
        page.friends.click();
        //page.random.click();







    }

}
