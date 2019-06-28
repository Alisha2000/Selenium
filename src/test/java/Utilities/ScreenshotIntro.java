package Utilities;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class ScreenshotIntro {
    public static void takeScreenshot() throws IOException {
       // Driver.getDriver("chrome").get("https://www.google.com");
        File src=((TakesScreenshot)Driver.getDriver("chrome")).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(src, new File("src\\test\\resources\\screenshot"+System.currentTimeMillis()+".png"));
    }
    @Test(timeOut = 3000)
    public void testToFail() throws InterruptedException {
        Driver.getDriver("chrome").get("https://www.facebook.com");
        Thread.sleep(5000);
    }

    @Test
    public void testToPass() throws InterruptedException {
        Driver.getDriver("chrome").get("https://wwww.expedia.com");
        Thread.sleep(5000);
    }

    @AfterMethod
    public void tearDown(ITestResult result) throws IOException{
        if(result.getStatus()==ITestResult.FAILURE){
    takeScreenshot();
        }
    }



}
