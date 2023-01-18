package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class sampleSeleniumTest19 {
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\Selenium Test\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.myntra.com/");
        Actions actions = new Actions(driver);
        WebElement women = driver.findElement(By.xpath("//a[text()='Women' and @data-type='navElements']"));
        actions.moveToElement(women).build().perform();
        System.out.println("Mouse select the option women");
        WebElement sarees = driver.findElement(By.xpath("//a[text()='Sarees']"));
        Thread.sleep(4000);
        sarees.click();
        System.out.println("Click on Sarees");

    }
}
