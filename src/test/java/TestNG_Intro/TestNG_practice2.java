package TestNG_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestNG_practice2 {
    static  WebDriver driver;

    @BeforeClass
    public static void setUp(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.toolsqa.com/automation-practice-form/");
    }

    @Test(priority=2)
    public static void test1a(){
        WebElement firstName=driver.findElement(By.xpath("//input[@name='firstname']"));
        firstName.sendKeys("Asiyat");

        WebElement lastName=driver.findElement(By.xpath("//input[@name='lastname']"));
        lastName.sendKeys("Adzhieva");


       WebElement sex=driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
       sex.click();

    }
    @Test(priority=1)
    public static void test2(){

        WebElement onlineTraining=driver.findElement(By.xpath("(//span[@class='menu-text'])[55]"));
        Actions action=new Actions(driver);

        action.moveToElement(onlineTraining).perform();
        if(onlineTraining.isDisplayed()){
            System.out.println("online training is displayed");
        }else{
            System.out.println("online training is not displayed");
        }

        WebElement selTraining=driver.findElement(By.xpath("(//span[@class='menu-text'])[56]"));
        System.out.println(selTraining.getText());

         //isDisplayed method
        System.out.println("this is response "+selTraining.isDisplayed());


    }
}
