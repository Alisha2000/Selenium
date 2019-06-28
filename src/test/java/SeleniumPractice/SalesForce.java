package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {
    static WebDriver driver;
    public static void main (String []args){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.get("https://login.salesforce.com/");
        driver.findElement(By.id("username")).sendKeys("Hello");

//        driver.findElement(By.xpath())
        driver.findElement(By.xpath("//*[@id='Login']/preceding-sibling::input[@type='password']")).sendKeys
                ("123244");

        driver.findElement(By.xpath("//*[@id='Login']")).click();
        driver.navigate().to("https://www.google.com/search?q=google&rlz=1C1CHBF_enUS852US853&oq=" +
                "goo&aqs=chrome" +
                ".1.69i60j0l2j69i60l2j0.3519j0j7&sourceid=chrome&ie=UTF-8");
        driver.findElement(By.xpath("//a[contains(@ping,'/url?sa=t&source=web&rct=j&url=https://www.youtube.com/" +
                "Google&ved')]/h3")).click();
        driver.navigate().to("http://www.qaclickacademy.com/interview.php");
       // driver.findElement(By.xpath(""))






    }
}
