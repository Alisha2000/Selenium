package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Homework {
    static WebDriver driver;
    public static void main(String []args){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        String url="https://www.toolsqa.com/automation-practice-form/";
        driver.get(url);
        Actions action=new Actions(driver);
        WebElement tools=driver.findElement(By.xpath("(//a[@data-level='1'])[3]"));
        action.moveToElement(tools).perform();

        WebElement uiAutomation=driver.findElement(By.linkText("UI Automation"));
        action.moveToElement(uiAutomation).perform();
        WebElement SeleniumTutorial=driver.findElement(By.linkText("Selenium Tutorial"));
        action.moveToElement(SeleniumTutorial).perform();


        //SeleniumTutorial.click();

        WebElement performance=driver.findElement(By.linkText("Performance"));
        action.moveToElement(performance).perform();
        WebElement WebLOAD=driver.findElement(By.linkText("WebLOAD testing with Selenium"));
        action.moveToElement(WebLOAD).perform();
       // WebLOAD.click();



        WebElement BDD =driver.findElement(By.linkText("BDD Frameworks"))   ;
        action.moveToElement(BDD).perform();
        WebElement SpecFlow =driver.findElement(By.linkText("SpecFlow Tutorial"));
        action.moveToElement(SpecFlow).perform();
       // SpecFlow.click();



        WebElement mobile=driver.findElement(By.linkText("Mobile Automation"));
        action.moveToElement(mobile).perform();
        WebElement appium=driver.findElement(By.linkText("Appium"));
        action.moveToElement(appium).perform();
        //appium.click();



        WebElement utilities=driver.findElement(By.linkText("Utilities/Frameworks"));
        action.moveToElement(utilities).perform();
        WebElement ghostlab=driver.findElement(By.linkText("Ghostlab Tool for Synchronized Testing"));
        action.moveToElement(ghostlab).perform();
       // ghostlab.click();














    }
}
