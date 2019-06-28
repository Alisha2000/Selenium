package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class findElementsHomework {
    static WebDriver driver;
    public static void main (String[]args){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        String url="http://demo.guru99.com/test/simple_context_menu.html";
        driver.manage().window().maximize();
        driver.get(url);
        Actions action=new Actions(driver);
        WebElement rightClick=driver.findElement(By.xpath("//*[@id=\'authentication\']/span"));
        action.contextClick(rightClick).perform();
        List<WebElement> elements=driver.findElements(By.xpath("//*[@id=\'authentication\']/ul"));
        for (int i=0; i<elements.size(); i++){
            System.out.println(elements.get(i).getText());
        }


        driver.close();



    }
}
