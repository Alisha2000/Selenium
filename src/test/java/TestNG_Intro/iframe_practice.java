package TestNG_Intro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class iframe_practice extends TestBase {



    @Test
    public void test1(){
        driver.get("https://www.toolsqa.com/iframe-practice-page/");
        System.out.println(driver.findElements(By.tagName("iframe")).size());
        //I'm swithing with the name
       // driver.switchTo().frame("iframe2");
       // driver.switchTo().frame(1);//by index
        WebElement iframe2=driver.findElement(By.xpath("//iframe[@id='IF2']"));
        driver.switchTo().frame(iframe2);


        //to be able to store as a linktext my tag should be "a"
        //value for linkedtext is coming from the element text
       // String sortable=driver.findElement(By.linkText("Sortable")).getText();
        //System.out.println(sortable);
    }
}
