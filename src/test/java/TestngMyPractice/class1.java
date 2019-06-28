package TestngMyPractice;

import TestNG_Intro.TestBase;
import org.testng.annotations.Test;

public class class1  {
    @Test
    public void test1(){
        System.out.println("first test");
    }

    @Test(groups = "smoke" )
    public void test2(){
        System.out.println("second  test");
    }

    @Test
    public void test3(){
        System.out.println("third test test");
    }

}
