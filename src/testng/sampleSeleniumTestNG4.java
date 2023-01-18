package testng;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class sampleSeleniumTestNG4 {
    public WebDriver driver;
    @Test(priority = 0)//work first
    public void atTestFunction() {
        System.out.println("Hii GOD");
    }
    @Test(enabled = false)
    public void atTestFunction1() {
        System.out.println("Did you remember me");
    }
    @Test(priority = 1)//work second
    public void atTestFunction2() {
        System.out.println("Bless me");
    }
}
