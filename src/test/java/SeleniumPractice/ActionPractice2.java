package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionPractice2 {
   static WebDriver driver;

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://www.primefaces.org/showcase/ui/misc/effect.xhtml");
        driver.manage().window().fullscreen();
        WebElement slide=driver.findElement(By.id("slide"));
        Actions action=new Actions(driver);
        action.doubleClick(slide).perform();
        driver.navigate().to("http://demo.guru99.com/test/simple_context_menu.html");



        WebElement rightClick=driver.findElement(By.cssSelector(".context-menu-one"));
        //contextClick is right click in selenium
        action.contextClick(rightClick).perform();

        driver.navigate().to("https://www.toolsqa.com/automation-practice-form/");
        WebElement tools=driver.findElement(By.xpath("(//a[@data-level='1'])[3]"));
        action.moveToElement(tools).perform();
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
        action.sendKeys(Keys.ARROW_UP).build().perform();

        driver.navigate().to("https://demos.telerik.com/kendo-ui/dragdrop/index");
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
        action.sendKeys(Keys.ARROW_DOWN).build().perform();
        Thread.sleep(2000);
        
        WebElement source=driver.findElement(By.id("draggable"));
        WebElement target=driver.findElement((By.id("droptarget")));
        action.dragAndDrop(source, target).perform();

    }
}
