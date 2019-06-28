package TestngMyPractice;

import TestNG_Intro.TestBase;
import org.testng.annotations.Test;

public class fruits extends TestBase {
    @Test(groups = "smoke")
    public void apple(){
        System.out.println("apple");
    }

    @Test
    public void watermelon(){
        System.out.println("watermelon");
    }

    @Test (groups = "smoke")
    public void apricot(){
        System.out.println("apricot");
    }
}
