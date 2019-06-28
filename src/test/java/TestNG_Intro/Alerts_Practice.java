package TestNG_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Alerts_Practice {
    static WebDriver driver;
    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.navigate().to("https://the-internet.herokuapp.com/javascript_alerts");
    }

    @Test//(enabled=false)
    public static void test1(){
        WebElement jsAlert=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
        jsAlert.click();
        Alert alert=driver.switchTo().alert();
        alert.accept();

        List<WebElement> names=driver.findElements(By.xpath("//li//button"));
        for(int i=0; i<names.size();i++){
            if(names.get(i).getText().equals("Click for JS Confirm"))
            System.out.println(names.get(i).getText());
        }
    }

    @Test
    public static void test2(){
        WebElement jsConfirm=driver.findElement(By.xpath("//button[@onclick='jsConfirm()']"));
        jsConfirm.click();;
        Alert alert=driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.dismiss();

        String expected="You clicked: Cancel";
        String actual=driver.findElement(By.id("result")).getText();

        Assert.assertEquals(expected,actual);
        System.out.println("This is the validation for JSCONFIRM");


     }

     @Test
     public static void test3a(){
        WebElement jsPrompt=driver.findElement(By.xpath("//button[@click='jsPrompt()']"));
        jsPrompt.click();
        Alert alert=driver.switchTo().alert();
         System.out.println(alert.getText());
         alert.sendKeys("Techtorial Academy JS Prompt Alert");
         alert.accept();
         String actual=driver.findElement(By.id("result")).getText();
         String expected="You entered: Techtorial Academy JS Prompt Alert";
         Assert.assertTrue(actual.equals(expected));
        // Assert.assertEquals(actual,expected, "This is for assert equals method");
     }
    @AfterClass
    public static void tearDown(){
        driver.quit();
    }

}
