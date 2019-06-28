package TestNG_Intro;

import org.testng.annotations.*;

public class testng_beforetest {

    @BeforeMethod(alwaysRun = true)
    public void test1(){

        System.out.println("Before Method Annotation");
    }

    @Test(groups = {"Test"})
    public void test2(){

        System.out.println("Test Annotation");
    }

    @AfterMethod (alwaysRun = true)
    public void test3(){

        System.out.println("After Method Annotation");
    }

    @BeforeClass(groups = {"before"})
    public void test4(){

        System.out.println("Before Class Annotation");
    }

    @AfterClass(groups = {"after"})
    public void test5(){


        System.out.println("After Class Annotation");
    }

    @BeforeTest(groups = {"before"})
    public void test6(){

        System.out.println("Before Test Annotation");
    }


    @AfterTest(groups = {"after"})
    public void test7(){

        System.out.println("After Test Annotation");
    }

    @BeforeSuite(groups = {"before"})
    public void test8(){

        System.out.println("Before Suite Annotation");
    }

    @AfterSuite(groups = {"after"})
    public void test9(){

        System.out.println("After Suite Annotation");
    }










}
