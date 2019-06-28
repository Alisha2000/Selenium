package SeleniumPractice;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class myPractice {
    static WebDriver driver;
    public static void main (String[]args){
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        String url="https://the-internet.herokuapp.com/";
        driver.get(url);
        WebElement upload=driver.findElement(By.linkText("File Upload"));
        upload.click();
        WebElement chooseFile =driver.findElement(By.id("file-upload"));
        chooseFile.sendKeys("C:\\Users\\Asiyat\\Desktop\\myUploadFile.docx");
        WebElement uploadButton=driver.findElement(By.id("file-submit"));
        uploadButton.click();
        String expectedMessage="myUploadFile.docx";
        String actualMessage=driver.findElement(By.id("uploaded-files")).getText();
        if(expectedMessage.equals(actualMessage)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }


    }
}
