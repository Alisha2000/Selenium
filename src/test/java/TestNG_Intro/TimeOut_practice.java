package TestNG_Intro;

import org.testng.annotations.Test;

public class TimeOut_practice {
    //if your test case execution is time sensitive.
    //we need to use the timeOut and we can specify the time
    //if my method execution is taking more than specified time
    //method will fail
    //it will throw ThreadTimeOutException
    @Test(timeOut = 2000)
    public void test1() throws InterruptedException {
        System.out.println("this is the method for timeout");
        Thread.sleep(3000);
    }
}
