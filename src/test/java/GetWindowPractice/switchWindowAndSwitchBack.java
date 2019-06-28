package GetWindowPractice;

import TestNG_Intro.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

public class switchWindowAndSwitchBack extends TestBase {
    public static void test1(){
        driver.navigate().to("https://www.rocketlawyer.com/");
        WebElement helpButton=driver.findElement(By.xpath("//*[@id=\'loggedOutHeader\']/div[3]/div[4]/div[2]"));
        Actions action=new Actions(driver);
        action.moveToElement(helpButton).perform();
        WebElement chatOnline=driver.findElement(By.xpath("(//a[text()='Chat online'])[2]"));
        chatOnline.click();
        System.out.println(driver.getTitle());

        String homePage=driver.getWindowHandle();
        Set<String> windows=driver.getWindowHandles();
        for(String window:windows){
            if(!window.equals(homePage)){
                driver.switchTo().window(window);
            }

        }
        System.out.println(driver.getTitle());
        System.out.println(driver.switchTo().window(homePage));
        System.out.println(driver.getTitle());

    }

}
