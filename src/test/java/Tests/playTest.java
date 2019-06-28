package Tests;

import org.testng.annotations.Test;

import static TestNG_Intro.TestBase.driver;

public class playTest {
    @Test
    public void test1(){
        driver.get("firefox");
    }
}
