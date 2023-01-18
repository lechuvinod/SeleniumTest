package testng;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class sampleSeleniumTestNG3 {
    public WebDriver driver;

    @Test
    public void atTestFunction() { System.out.println("In Test Class");}

    @Test
    public void atTest2Function() { System.out.println("In Test2 Class");}

    @BeforeTest
    public void beforeTest() { System.out.println("In Before Test Class");}

    @AfterTest
    public void afterTest() {
        System.out.println("In After Test Class");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("In Before Method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("In After Method");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("In Before Class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("In After Class");
    }

    @BeforeSuite
    public void beforeSuite() { System.out.println("In Before Suite Class");}

    @AfterSuite
    public void afterSuite() {
        System.out.println("In After Suite Class");
    }

}
