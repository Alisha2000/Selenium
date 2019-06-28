package TestNG_Intro;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testng_parameter {
    @Test
    @Parameters("browser")
    public void test1(String browser){
        System.out.println("This is the example for parametarization in TestNG. "+"Parameter is"+browser);
    }

    @Test
    @Parameters({"OS","browser"})
        public void test2(String OS, String browser){
        System.out.println("This is the example for parametarization in TestNG. "+"Parameter is"+OS);
        System.out.println("This is the example for parametarization in TestNG. "+"Parameter is"+browser);
    }
}
