package TestNG_Intro;

import Pages.WebOrderLoginPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class loginTest_dataProvider extends TestBase{
    WebOrderLoginPage page=new WebOrderLoginPage();
    @DataProvider(name="inputs")
    public Object[][]getData(){
        return  new Object[][]{
                {"Tester","techtorial"},
                {"TT", "test"},
                {"Tester","test"}
        };
    }

    @Test(dataProvider = "inputs")
    public void loginTest(String username, String password){
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx");

        page.username.sendKeys(username);
        page.password.sendKeys(password);
        page.loginButton.click();

        String actual=driver.getTitle();
        String expected="Web Orders";

        Assert.assertEquals(expected,actual);


    }

}
