package Tests;

import Pages.HomePage;
import TestNG_Intro.TestBase;
import Utilities.Driver;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import java.security.Key;

public class expedia_test extends TestBase  {

      HomePage home = new HomePage();

    @Test
    public void test1() {
        driver.get("https://www.expedia.com/");
        home.flightButton.click();
        home.flyingFrom.sendKeys("Chicago");
        home.flyingFrom.sendKeys(Keys.ARROW_DOWN);
        home.flyingFrom.sendKeys(Keys.ENTER);
        home.flyingTO.sendKeys("Los Angeles");
        home.flyingTO.sendKeys(Keys.ARROW_DOWN);
        home.flyingTO.sendKeys(Keys.ENTER);
    }
}