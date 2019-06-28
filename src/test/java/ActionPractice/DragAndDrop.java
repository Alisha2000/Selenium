package ActionPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    static WebDriver driver;
    public static void main (String args[]){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.navigate().to("http://demo.guru99.com/test/drag_drop.html");
        driver.manage().window().maximize();
        WebElement source1=driver.findElement(By.id("fourth"));
        WebElement target1=driver.findElement(By.id("amt7"));
        Actions action=new Actions(driver);
       // action.dragAndDrop(source1,target1).perform();
        action.clickAndHold(source1).moveToElement(target1).release().build().perform();

    }

}
