package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import sun.rmi.runtime.Log;

import java.util.concurrent.TimeUnit;

public class Driver {

    static WebDriver driver;

    private  final static Logger LOG= LoggerFactory.getLogger(Driver.class);



    public static WebDriver getDriver(String browser) {

        if (driver == null) {
            switch (browser.toLowerCase()){
                case "chrome":
                    LOG.info("Chrome browser selected");
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    LOG.info("Firefoxdriver browser selected");
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "opera":
                    LOG.info("Opera browser selected");
                    WebDriverManager.operadriver().setup();
                    driver = new OperaDriver();
                    break;
                case "ie":
                    LOG.info("IE browser selected");
                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                    break;
                default:
                    LOG.info("Chrome browser selected by default");
                    WebDriverManager.operadriver().setup();
                    driver = new OperaDriver();
                    break;

            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        }
        return driver;

    }

}
