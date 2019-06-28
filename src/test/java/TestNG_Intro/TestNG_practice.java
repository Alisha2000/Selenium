package TestNG_Intro;

import org.testng.annotations.*;

public class TestNG_practice {

    @BeforeMethod()
    public static void beforeMethod(){
        System.out.println("Before method annotation");
    }
    @Test
    public static void testng1(){
        System.out.println("TestNG-->test annotation 1");
    }
    @Test
    public static void testng2(){
        System.out.println("TestNG-->test annotation 2");
    }

    @Test
    public static void testng3(){
        System.out.println("TestNG-->test annotation 3");
    }
    @AfterMethod
    public static void afterMethod(){
        System.out.println("After Method Annotation");
    }
    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before Class annotation");
    }
    @AfterClass
    public static void afterClass(){
        System.out.println("After Class annotation");
    }

}
