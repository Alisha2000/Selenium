package TestNG_Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.List;

public class iframeFindingHomework extends TestBase {

    @Test
    public void iframe(){
        driver.get("http://the-internet.herokuapp.com/iframe");
        System.out.println(driver.findElements(By.tagName("iframe")).size());//how many iframes
        driver.switchTo().frame("mce_0_ifr");//by id
       WebElement iframe=driver.findElement(By.id("tinymce"));
        iframe.clear();
      iframe.sendKeys("hello");
       // driver.switchTo().frame(0);//by index
        //driver.findElement(By.id("tinymce")).sendKeys("hello");

        driver.switchTo().defaultContent();//returns back






    }
}
