package TestNG_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class Paralel_Testing {
    WebDriver driver;
    @BeforeMethod
    @Parameters("browser")
    public void  setUp(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            //Stale element exception
            WebDriverManager.firefoxdriver().setup();
            //don't instance the driver. You will get the nullPointerException.
            driver = new FirefoxDriver();
        } else {
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }
    @Test()
    public void test1(){
        driver.get("http://automationpractice.com/index.php?controller=contact");
        String actual=driver.findElement(By.xpath("//label[@for='id_contact']")).getText();
        String expected="Subject Title";

        SoftAssert soft=new SoftAssert();
        soft.assertEquals(actual,expected);

        soft.assertAll();
    }
}
