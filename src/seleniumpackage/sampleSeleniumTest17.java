package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class sampleSeleniumTest17 {
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\Selenium Test\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/r.php");
        WebElement element = driver.findElement(By.name("firstname"));
        element.sendKeys("Lakshmi");
        element.sendKeys(Keys.CONTROL,"a");
        element.sendKeys(Keys.CONTROL,"c");
        WebElement element1 = driver.findElement(By.name("lastname"));
        element1.sendKeys(Keys.CONTROL,"v");
        Thread.sleep(5000);
        driver.close();
    }
}
