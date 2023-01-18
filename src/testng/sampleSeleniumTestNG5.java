package testng;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sampleSeleniumTestNG5 {
    public WebDriver driver;
    @Test
    public void atTestFunction() {
        // TODO Auto-generated method stub
        String expectedTitle = "Google";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle, "The result is not matched");
        System.out.println("Assertion completed");
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
