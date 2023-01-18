package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sampleSeleniumTest5 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\Selenium Test\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("REGISTER")).click();
        driver.findElement(By.name("firstName")).sendKeys("Shivani");
        driver.findElement(By.name("lastName")).sendKeys("Vinod");
        driver.findElement(By.name("phone")).sendKeys("9495872907");
        driver.findElement(By.id("userName")).sendKeys("lechuvinod@gmail.com");
        driver.findElement(By.name("address1")).sendKeys("Asset Escape");
        driver.findElement(By.name("city")).sendKeys("kakkanad");
        driver.findElement(By.name("state")).sendKeys("kerala");
        driver.findElement(By.name("postalCode")).sendKeys("690537");
        driver.findElement(By.name("submit")).click();
    }
}
