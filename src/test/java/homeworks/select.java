package homeworks;

import TestNG_Intro.TestBase;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class select extends TestBase {
    @Test
    public static void test1() {
        driver.get("https://www.rocketlawyer.com/#business-documents");
        WebElement startBusiness = driver.findElement(By.xpath("//a[@class='expand selected']"));
        startBusiness.click();
        WebElement states = driver.findElement(By.xpath("(//select[@name='state'])[1]"));
        states.click();
        Select select = new Select(states);

        List<WebElement> actualOptions = (select.getOptions());
       //
        //
        // List<String> expectedOptions = new ArrayList<String>();
//        expectedOptions.add("Maine");
//        expectedOptions.add("Maryland");
//        expectedOptions.add("Massachusetts");
//        expectedOptions.add("Michigan");
//        expectedOptions.add("Minnesota");
//        expectedOptions.add("Mississippi");
//        expectedOptions.add("Missouri");
//        expectedOptions.add("Montana");
//        String actual = "actual";
//        String expected = "expected";
        for (WebElement l : actualOptions) {
             // l.getText();
            if (l.getText().startsWith("M")) {
                System.out.println(l.getText());
            }
        }
        /*for(int i=0; i<expectedOptions.size();i++){
            actual=actualOptions.get(i).getText();
            expected=expectedOptions.get(i);
            Assert.assertEquals(expected,actual);
        }*/

        WebElement typeOfBusiness = driver.findElement(By.xpath("(//select[@class='businessType'])[1]"));
        Select select2 = new Select(typeOfBusiness);
        select2.selectByValue("C_CORP");
    }
    @Test
    public static void test2(){

        driver.navigate().to("https://www.rocketlawyer.com/#business-documents");
        WebElement help=driver.findElement(By.xpath("//*[@id=\'loggedOutHeader\']/div[3]/div[4]/div[2]"));
        JavascriptExecutor js=(JavascriptExecutor) driver;
        js.executeScript("scroll(250, 0)");

        Actions action=new Actions(driver);
        action.moveToElement(help).perform();
        WebElement chat=driver.findElement(By.xpath("(//a[text()='Chat online'])[2]"));
        chat.click();

        System.out.println(driver.getWindowHandle());
        Set<String> allWindows=driver.getWindowHandles();

        Iterator<String>it=allWindows.iterator();
        String firstWindow = it.next();
        String secondWindow = it.next();

        driver.switchTo().window(secondWindow);







        System.out.println(driver.getWindowHandle());



       // Assert.assertEquals(expected,actual1);
        }


        @Test
    public static void test3() {
            driver.navigate().to("https://www.rocketlawyer.com/#business-documents");
            WebElement help = driver.findElement(By.xpath("//*[@id=\'loggedOutHeader\']/div[3]/div[4]/div[2]"));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("scroll(250, 0)");

            Actions action = new Actions(driver);
            action.moveToElement(help).perform();
            WebElement phoneNumber = driver.findElement(By.id("navbar_callus_link_logged_out"));
            phoneNumber.click();

            Alert alert = driver.switchTo().alert();
            alert.dismiss();
        }







     }
