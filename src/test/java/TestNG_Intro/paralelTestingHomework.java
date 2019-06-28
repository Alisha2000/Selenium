package TestNG_Intro;

import com.beust.jcommander.Parameter;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class paralelTestingHomework {
    WebDriver driver;
    @BeforeMethod
    @Parameters("browser")
    public void SetUp(String browser){
        if(browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        }else if(browser.equalsIgnoreCase("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
        }else if(browser.equalsIgnoreCase("microsoft edge")){
            WebDriverManager.edgedriver().setup();
            driver=new EdgeDriver();
        }
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public  void test1(){
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
}
