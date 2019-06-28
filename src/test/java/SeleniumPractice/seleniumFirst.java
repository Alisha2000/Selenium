package SeleniumPractice;

import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumFirst {
    static WebDriver driver;
    public static void main (String[]args)throws Exception{
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().fullscreen();
        String expectedURL="http://the-internet.herokuapp.com/";
        driver.get(expectedURL);
        String actualURL=driver.getCurrentUrl();



        if(expectedURL.equals(actualURL)){
            System.out.println("the expected URl is matching");
        }else{
            System.out.println("Test case is failed. Expected url is "+expectedURL+" \nactual Url is"+actualURL);
        }

        WebElement forgotPass=driver.findElement(By.linkText("Forgot Password"));
        forgotPass.click();
       String expectedAfterForgotPass="https://the-internet.herokuapp.com/forgot_password";
       String afterForgotPass=driver.getCurrentUrl();
       if(expectedAfterForgotPass.equals(afterForgotPass)){
           System.out.println("The expected and actual url is matching. After clicking forgot password");
       }else{
           System.out.println("Actual and expected url is not matching after clicking forgot password.");
       }

       driver.findElement(By.id("email")).sendKeys(("asiyatadzhieva@gmail.com"));
       driver.findElement(By.id("form_submit")).click();
       String expectedURL1="https://the-internet.herokuapp.com/email_sent";
       String actualURL1=driver.getCurrentUrl();
       //expected conditions come from business requirement
        //don't ask the developer;
        //don't copy from application itself
        //possible scenario to get the business requirement
        //1 You can ask your scrum master
        //2 You can ask the Business Analyst
        //3 You can ask the Product owner
        //4 You can find under user story
        //5 You  can find on confluence page

        if(expectedURL1.equals(actualURL1)){
            System.out.println("Expected and actual url is matching--passed");
        }else{
            System.out.println("Failed");
            throw new Exception();
        }

        WebElement message=driver.findElement(By.id("content"));
        message.getText();
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.quit();//closes all tabs which are opened
        driver.close();//closes only last tab which is opened


       //


    }


}
