package TestNG_Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestInstagram extends TestBase {

    @Test
    public void test1(){
        driver.get("https://www.instagram.com/accounts/login/?source=auth_switcher");
        driver.switchTo().frame(1);
        driver.findElement(By.xpath("//input[@id='f3be62e6e9d22fc']")).sendKeys("hello");

    }
}
