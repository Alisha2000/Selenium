package TestNG_Intro;

import Pages.dataProvider_homeworkPages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider_homework extends TestBase {
    dataProvider_homeworkPages pages=new dataProvider_homeworkPages();
    @DataProvider(name = "inputs")

    public  Object[][] loginOrder_dataProvider (){
            return new Object[][]{
                    {"Karen", "6131 N Winthrop", "New York", "New York", "606060"},
                    {"Sam", "190 N Harbor Dr", "Los Angeles", "California", "56554"},
                    {"Marilin", "900 N Michigan", "Chicago", "Illinois", "56443"},
                    {"Asiyat", "5912 N Maplewood", "Chicago", "Illinois", "60659"},
                    {"Alina", "11 Alieva st", "Karachaevsk", "KCHR", "369200"}
            };
            }
    @Test(dataProvider = "inputs")
    public void loginOrder(String name, String street, String city, String state,String zip){
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.id("ctl00_MainContent_password")).sendKeys("test");
        driver.findElement(By.id("ctl00_MainContent_login_button")).click();
        driver.findElement(By.linkText("Order")).click();

        driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")).sendKeys("");
        Select select=new Select(driver.findElement(By.id("ctl00_MainContent_fmwOrder_ddlProduct")));
        select.selectByValue("MyMoney");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtQuantity")).sendKeys("123");
        pages.customerName.sendKeys(name);
        pages.street.sendKeys(street);
        pages.city.sendKeys(city);
        pages.state.sendKeys(state);
        pages.zip.sendKeys(zip);
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_cardList_1")).click();
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6")).sendKeys("1234567891234568");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox1")).sendKeys("08/2020");
        driver.findElement(By.id("ctl00_MainContent_fmwOrder_InsertButton")).click();












    }
}
