package Tests;

import Pages.ContactPage;
import TestNG_Intro.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ContactTest extends TestBase {
    ContactPage page=new ContactPage();

    @Test
    public void  test1(){
        driver.get("http://automationpractice.com/index.php?controller=contact");
        String actual=page.subjectTitle.getText();//Subject Heading
        String expected="Subject Title";

        SoftAssert soft=new SoftAssert();
        soft.assertEquals(actual,expected);

       // Assert.assertEquals(actual,expected);
        //hard assertion
        //it test case is failing right away will throw an exception
        System.out.println("Subject title and heading is not matched");
        String emailActual=page.emailAddress.getText();
        String emailExpected="Email Address";
        soft.assertEquals(emailActual,emailExpected);
        System.out.println("after email assertion");

        soft.assertAll();
    }
}
