package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropHomework {
    static WebDriver driver;
    public static void main (String[]args){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();

        String url="http://the-internet.herokuapp.com/drag_and_drop";
        driver.get(url);
        driver.manage().window().maximize();


        Actions action=new Actions(driver);
        WebElement a=driver.findElement(By.id("column-a"));
        WebElement b=driver.findElement(By.id("column-b"));

        action.dragAndDrop(a,b).perform();
        //Thread.sleep(3000);

    }
}
