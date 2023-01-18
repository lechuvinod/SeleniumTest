package testng;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class sampleSeleniumTestNG8CrossBrowser {
    public WebDriver driver;
    @Parameters("browser")
    @BeforeTest
    public void f1(String CrossBrowser) {
        if(CrossBrowser.equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Projects\\Selenium Test\\chromedriver.exe");
            driver = new ChromeDriver();
        } else {
            System.setProperty("webdriver.gecko.driver", "C:\\Projects\\Selenium Test\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
    }

    @Test
    public void f2() throws InterruptedException {
        Thread.sleep(5000);
        driver.get("https://demo.guru99.com/test/newtours/");
        //driver.findElement(By.linkText("REGISTER")).click();
        driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
        driver.manage().window().maximize();
    }

    @AfterTest
    public void f3() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();

    }
}
