package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium1 {
    static WebDriver driver;
    public static void main (String[]args){
       WebDriverManager.chromedriver().setup();
       driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.facebook.com/");
       System.out.println(driver.getTitle());
       System.out.println(driver.getCurrentUrl());

     //  driver.navigate().to("https://www.google.com/");
     //  driver.navigate().back();
        driver.findElement(By.id("email")).sendKeys("myname");
        driver.findElement(By.name("pass")).sendKeys("deeef");
        driver.findElement(By.linkText("Forgot account?")).click();
        driver.close();


    }


}
