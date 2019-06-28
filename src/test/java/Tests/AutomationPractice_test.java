package Tests;

import Pages.Automationwebsite_page;
import TestNG_Intro.TestBase;
import org.testng.annotations.Test;

public class AutomationPractice_test extends TestBase {

    Automationwebsite_page page=new Automationwebsite_page();
    @Test
    public  void test1(){
        driver.get("http://automationpractice.com/index.php");
        page.searchBox.sendKeys("blouse");
        page.searchButton.click();


        for(int i=0; i<page.productDescription.size(); i++){
            System.out.println(page.productDescription.get(i).getText());
        }
    }

}
