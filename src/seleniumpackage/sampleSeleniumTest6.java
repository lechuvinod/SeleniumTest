package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sampleSeleniumTest6 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\Selenium Test\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/v4/");
        driver.manage().window().maximize();
        driver.findElement(By.name("uid")).sendKeys("mngr361519");
        driver.findElement(By.name("password")).sendKeys("ApetAnY");
        driver.findElement(By.name("btnLogin")).click();
        driver.findElement(By.linkText("New Customer")).click();
        driver.findElement(By.name("name")).sendKeys("Shivani");
        driver.findElement(By.id("dob")).sendKeys("01/09/2012");
        driver.findElement(By.name("addr")).sendKeys("Chilanka Kakkanad");
        driver.findElement(By.name("city")).sendKeys("Ernakulam");
        driver.findElement(By.name("state")).sendKeys("Kerala");
        driver.findElement(By.name("pinno")).sendKeys("680230");
        driver.findElement(By.name("telephoneno")).sendKeys("9495872907");
        driver.findElement(By.name("emailid")).sendKeys("lechuvinod@gmail.com");
        driver.findElement(By.name("password")).sendKeys("lechu1234");
        driver.findElement(By.name("sub")).click();
    }
}
