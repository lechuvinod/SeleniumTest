package testng;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class sampleSeleniumTestNG6SoftAssert {
    public WebDriver driver;
    @Test
    public void atTestFunction() {
        // TODO Auto-generated method stub
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(expectedTitle, actualTitle);
        System.out.println("Checking for title");
        System.out.println("Assertion completed");
        softAssert.assertAll();
    }
    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\Selenium Test\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();
    }
    @AfterTest
    public void afterTest() throws InterruptedException {
        Thread.sleep(3000);
        driver.close();

    }
}
