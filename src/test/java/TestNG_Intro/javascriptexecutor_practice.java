package TestNG_Intro;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.Set;

public class javascriptexecutor_practice extends TestBase {
    JavascriptExecutor js;

    @Test
    public void test1(){
        js=(JavascriptExecutor)driver;
        //this will navigate to the website
        js.executeScript("window.location='https://www.expedia.com/'");
        //this will get the url of the website
        System.out.println(js.executeScript("return document.URL"));
        //this will get the title of the website
        System.out.println(js.executeScript("return document.title"));
        WebElement searchButton=driver.findElement(By.id("search-button-hp-package"));
        //js.executeScript("arguments[0].click();",searchButton);
        js.executeScript("window.open('http://www.google.com');");
        System.out.println(js.executeScript("return document.title"));
        //this will get the id of Xpedia.com
        String home=driver.getWindowHandle();
        //this will get the id for all opened windows
        Set<String> windows=driver.getWindowHandles();
        for(String window:windows){
            if(!window.equalsIgnoreCase(home)){
                driver.switchTo().window(window);
            }
        }
        System.out.println(js.executeScript("return document.title"));
        driver.switchTo().window(home);
        System.out.println(js.executeScript("return window.innerHeight"));
        System.out.println(js.executeScript("return window.innerWidth"));
        js.executeScript("window.scrollBy(0,1200)");
        js.executeScript("window.scrollBy(0,-500)");


        js.executeScript("alert('Welcome Techtorial Academy')");
        Alert alert=driver.switchTo().alert();
        ((Alert) alert).accept();




    }
}
