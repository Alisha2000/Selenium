package TestNG_Intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class expedia_waits {
    static WebDriver driver;

    @BeforeClass
    public static void setUp(){

        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.expedia.com/?langid=1033&semcid=US.B.GOOGLE.BT-c-EN.GENERIC&semdtl=a1678337323." +
                "b132803035537.r1.g1kwd-12670071.i1.d1158503849668" +
                ".e1c.j19021437.k1.f11t1.n1.l1g.h1e.m1&gclid=EAIaIQobChMI6qGeyaHs4gIVysDICh3oFg09EAAYASAAEgK2nfD_BwE");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public static void test1(){
        WebElement flight=driver.findElement(By.id("tab-flight-tab-hp"));
        flight.click();
        WebElement flyingFrom=driver.findElement(By.xpath("//input[@id='flight-origin-hp-flight']"));
        flyingFrom.sendKeys("Chicago");
        flyingFrom.sendKeys(Keys.ARROW_DOWN);
        flyingFrom.sendKeys(Keys.ENTER);
        WebElement flyingTo=driver.findElement(By.xpath("//input[@id='flight-destination-hp-flight']"));
        flyingTo.sendKeys("Los Angeles");
        flyingTo.sendKeys(Keys.ARROW_DOWN);
        flyingTo.sendKeys(Keys.ENTER);

        WebElement departing=driver.findElement(By.xpath("//input[@id='flight-departing-hp-flight']"));
        departing.sendKeys("06/27/2019");
        WebElement returning=driver.findElement(By.xpath("//input[@id='flight-returning-hp-flight']"));
        returning.click();
        returning.clear();
        returning.sendKeys("06/29/2019");

        WebElement search=driver.findElement(By.xpath("(//button[@class='btn-primary btn-action gcw-submit'])[1]"));
        search.click();

        WebElement traveler=driver.findElement(By.id("traveler-selector-hp-flight"));
        traveler.click();




        WebElement nonstop=driver.findElement(By.xpath("//input[@id='stopFilter_stops-0']"));




        WebElement peopleNumber=driver.findElement(By.className("notification-text"));
        WebDriverWait wait=new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOf(peopleNumber));

        System.out.println(peopleNumber.getText());
        WebElement nonStop =driver.findElement(By.id("traveler"));
        nonstop.click();




    }
}
