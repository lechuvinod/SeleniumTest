package testng;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class sampleSeleniumTestNG2 {
    public WebDriver driver;
    @Test
    public void atTestFunction() {
        // TODO Auto-generated method stub
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
    }
    @BeforeTest
    public void beforeTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\Selenium Test\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
    }
    @AfterTest
    public void afterTest() {
        driver.close();
    }
}
