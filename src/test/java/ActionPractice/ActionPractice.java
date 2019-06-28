package ActionPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActionPractice {

    static WebDriver driver;

    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        String url="http://the-internet.herokuapp.com/";
        driver.get(url);
        WebElement fileUpload=driver.findElement(By.linkText("File Upload"));
        fileUpload.click();

        WebElement chooseFile=driver.findElement(By.id("file-upload"));
        chooseFile.sendKeys("C:\\Users\\Asiyat\\Desktop\\path.txt");
        WebElement uploadButton=driver.findElement(By.id("file-submit"));
        uploadButton.click();
        String expectedMessage="path.txt";
        String actualMessage=driver.findElement(By.id("uploaded-files")).getText();
        if(expectedMessage.equals(actualMessage)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}