package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionHomePractice {
    static WebDriver driver;
    public static void main (String[]args){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        String url= "https://www.primefaces.org/showcase/ui/misc/effect.xhtml";
        driver.get(url);
        WebElement slide=driver.findElement(By.id("slide_content"));
        WebElement clip=driver.findElement(By.id("clip"));
        clip.click();
        Actions action=new Actions(driver);
        WebElement scale=driver.findElement(By.id("scale_header"));
        action.doubleClick(scale).perform();
        WebElement puff=driver.findElement(By.id("puff_header"));
        action.doubleClick(puff).perform();

        String url2="https://www.toolsqa.com/automation-practice-form/";
        driver.navigate().to(url2);
        WebElement tools=driver.findElement(By.xpath("(//a[@data-level='1'])[3]"));
        action.moveToElement(tools).perform();

        action.sendKeys(Keys.ARROW_DOWN).perform();
        action.sendKeys(Keys.ARROW_DOWN).perform();
        action.sendKeys(Keys.ARROW_DOWN).perform();








    }
}
