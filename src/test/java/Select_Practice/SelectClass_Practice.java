package Select_Practice;

import TestNG_Intro.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class SelectClass_Practice extends TestBase {
    @Test(enabled = false)
    public static void test1(){
        driver.navigate().to("https://the-internet.herokuapp.com/dropdown");
        WebElement dropDown=driver.findElement(By.id("dropdown"));
        Select select=new Select(dropDown);
        select.selectByVisibleText("Option 1");
    }
    @Test
    public static  void test2(){
        driver.get("https://www.spicejet.com/");
        WebElement dropDown2=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select select=new Select(dropDown2);
        select.selectByVisibleText("USD");
    }

    @Test
    public static void Test3(){
        driver.navigate().to("https://the-internet.herokuapp.com/dropdown");
        WebElement dropDown=driver.findElement(By.id("dropdown"));
        Select select=new Select(dropDown);
        select.selectByValue("1");

    }
    @Test
    public static void Test4(){
        driver.get("https://www.spicejet.com/");
        WebElement currency=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select select=new Select(currency);

        select.selectByValue("AED");
    }

    @Test
    public static void test11(){
        driver.get("http://automationpractice.com/index.php?controller=contact");

        WebElement customerService=driver.findElement(By.xpath("//select[@class='form-control']"));
        Select select=new Select(customerService);
        select.selectByValue("2");
        WebElement email=driver.findElement(By.id("email"));
        email.sendKeys("amely1988@bk.ru");
        WebElement idreference=driver.findElement(By.id("id_order"));
        idreference.sendKeys("23445");
        WebElement fileUpload=driver.findElement(By.xpath("//input[@id='fileUpload']"));


        fileUpload.sendKeys("C:\\Users\\Asiyat\\Desktop\\Screenshot.png");
        WebElement message=driver.findElement(By.id("message"));
        message.sendKeys("Hello, with best regards");

        WebElement submit=driver.findElement(By.id("submitMessage"));
        submit.click();
        String expected="Your message has been successfully sent to our team.";
        String actual=driver.findElement(By.xpath("//p[@class='alert alert-success']")).getText();
        Assert.assertEquals(expected,actual);




    }
    @Test
    public static void test6(){
        driver.get("https://www.spicejet.com/");
        WebElement currency=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select select=new Select(currency);

        select.selectByIndex(3);
        //getOptions will return list of webelements in my dropdown list
        List<WebElement> actualOptions=select.getOptions();
        List<String>expectedOptions=new ArrayList<String>();
        expectedOptions.add("Select");
        expectedOptions.add("INR");
        expectedOptions.add("AED");
        expectedOptions.add("USD");

        String actual ="actual";
        String expected="expected";


        for(int i=0; i<expectedOptions.size();i++){

            actual=actualOptions.get(i).getText();
            expected=expectedOptions.get(i);
            Assert.assertEquals(expected,actual);
        }




    }

}
