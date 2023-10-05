package myOrg.com;

import static myOrg.com.App.factorial;
import org.testng.Assert;
import org.testng.annotations.*;

public class AppTest {
    @Test (dataProvider = "data-correct")
    public void correctNumbers(int number, int factorial) {
        Assert.assertEquals(factorial, factorial(number));
    }
    @Test (dataProvider = "data-incorrect", expectedExceptions = IllegalArgumentException.class)
    public void incorrectNumbers(int number){
        factorial(number);
    }
    @DataProvider (name = "data-incorrect")
    public Object[][] incorrectData()
    {
        return new Object[][] {{-5}};
    }
    @DataProvider (name = "data-correct")
    public Object[][] correctData()
    {
        return new Object[][] {{5, 120}, {1, 1}, {0, 1}};
    }
}