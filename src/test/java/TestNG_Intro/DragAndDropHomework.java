package TestNG_Intro;

import net.bytebuddy.utility.JavaModule;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class DragAndDropHomework extends TestBase {
    @Test
    public static void test1(){
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        WebElement source=driver.findElement(By.id("fourth"));
        WebElement target=driver.findElement(By.xpath("(//li[@class='placeholder'])[2]"));
        Actions action=new Actions(driver);
        action.dragAndDrop(source,target).perform();
        WebElement source2=driver.findElement(By.xpath("(//a[@class='button button-orange'])[4]"));
        WebElement target2=driver.findElement(By.id("amt8"));
        action.dragAndDrop(source2,target2).perform();
        WebElement source3=driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
        WebElement target3=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
        action.dragAndDrop(source3,target3).perform();
        WebElement source4=driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
        WebElement target4=driver.findElement(By.id("loan"));
        action.dragAndDrop(source4,target4).perform();
    }

    @Test
    public static void test2(){
        driver.get("http://demo.guru99.com/test/delete_customer.php");
        driver.findElement(By.name("cusid")).sendKeys("Asiyat1988");
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        Alert alert=driver.switchTo().alert();
        alert.dismiss();
    }

    @Test
    public static void test3(){
        driver.get("http://demo.guru99.com/test/upload/");
        WebElement chooseFile= driver.findElement(By.id("uploadfile_0"));
        chooseFile.sendKeys("C:\\Users\\Asiyat\\Desktop\\Foregone.docx");
        WebElement submit=driver.findElement(By.xpath("//button[@id='submitbutton']"));
        submit.click();
    }
    @Test
    public static void test4(){
        driver.get("http://demo.guru99.com/test/simple_context_menu.html");
        Actions action=new Actions(driver);
        WebElement doubleClick=driver.findElement(By.xpath("//*[@id=\'authentication\']/button"));
        action.doubleClick(doubleClick).perform();
        Alert alert=driver.switchTo().alert();
        alert.accept();

    }


}
