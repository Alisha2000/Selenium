package GetWindowPractice;

import TestNG_Intro.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class windowHero extends TestBase {
    @Test
    public static void test1(){
        driver.get("https://the-internet.herokuapp.com/windows");
        WebElement clickHere=driver.findElement(By.linkText("Click Here"));
        clickHere.click();
        String homePage=driver.getWindowHandle();
        Set<String> windows=driver.getWindowHandles();
        for(String window:windows){
            if(!window.equals(homePage)){
                driver.switchTo().window(window);
            }
        }
        System.out.println(driver.getTitle());
        System.out.println(driver.switchTo().window(homePage));
        System.out.println(driver.getTitle());
    }

}
