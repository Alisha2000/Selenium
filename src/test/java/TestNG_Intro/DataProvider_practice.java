package TestNG_Intro;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_practice {
    @DataProvider(name="identity")
    public Object[][] getData(){
        return new Object[][]{
                {"Asiyat", "Adzhieva"},
                {"Gulnara","Chyntaeva"},
                {"Bobur","Rasulov"}
        };
    }
    @Test(dataProvider = "identity")
    public void test1(String firstname, String lastName){
        System.out.println("The firstName is "+firstname);
        System.out.println("The lastName is "+lastName);

    }
}
