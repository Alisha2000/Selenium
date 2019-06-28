package selectClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class selectDropDown {
    static WebDriver driver;
   public static void main(String[]args){
       WebDriverManager.chromedriver().setup();
       driver=new ChromeDriver();
       driver.get("https://www.cheapoair.com/flights/booknow/cheap-flight-tickets?" +
               "fpaffiliate=coa-google-generic&fpsub=BM-Tickets-Fly&utm_campaign=generic-" +
               "terms-bm&utm_term=flying%20tickets&utm_term_id=kwd-40803053&utm_source={google}&utm" +
               "_medium={cpc}&device=c&fpprice=&campaignID=125430246&adgroupId=7067406606&gclid=" +
               "CjwKCAjw0ZfoBRB4EiwASUMdYSdKEV" +
               "_v7BQVnpbcGBOlTXrlpAD83BKgjqAfgURYAbc4yP7DcyJhghoCSOQQAvD_BwE");
       Select select=new Select(driver.findElement(By.xpath("//select[@id='searchDropdownBox']")));
       select.selectByValue("");
   }

}
