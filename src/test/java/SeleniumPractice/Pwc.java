package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pwc {
    static WebDriver driver;
    public static void main (String[]args){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.pwc.com/");
        driver.findElement(By.xpath("//button [@id='dropdownTrigger_lg']")).click();
        Actions action=new Actions(driver);

        WebElement alliance=driver.findElement(By.xpath("(//a[@class='clearfix'])[5]"));
        action.moveToElement(alliance).perform();
        alliance.click();

        driver.findElement(By.xpath("(//img[@class='js-lazy-loading image-component_background '])[5]")).click();


    }
}
