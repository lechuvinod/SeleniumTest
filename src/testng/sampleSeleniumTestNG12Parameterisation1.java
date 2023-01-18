package testng;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class sampleSeleniumTestNG12Parameterisation1 {
    public WebDriver driver;

    @BeforeTest
    public void beforeTest() {
            System.setProperty("webdriver.chrome.driver", "C:\\Projects\\Selenium Test\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get("https://demo.guru99.com/v4/");
    }

    @Test
    @Parameters({"myUsername","myPassword"})
    public void newFunction(String myUsername, String myPassword) throws InterruptedException {
        Thread.sleep(5000);
        WebElement sign = driver.findElement(By.name("uid"));
        sign.sendKeys(myUsername);
        WebElement pwd = driver.findElement(By.name("password"));
        pwd.sendKeys(myPassword);
        driver.findElement(By.name("btnLogin")).click();
    }

    @AfterTest
    public void f3() throws InterruptedException {
        Thread.sleep(5000);
        driver.quit();

    }
}
