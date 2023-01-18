package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sampleSeleniumTest9XpathDropDown {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\Selenium Test\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("mngr361519");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("ApetAnY");
        driver.findElement(By.xpath("//input[@name='submit']")).click();
        driver.findElement(By.xpath("//a[text()='REGISTER']")).click();
        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Vinod");
        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("Kumar");
        driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9544244334");
        driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("vinodsnair2001@gmail.com");
        driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Puthuvana Pathiyoor");
        driver.findElement(By.xpath("//input[@name='city']")).sendKeys("kayamkulam");
        driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Kerala");
        driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("680230");
        WebElement element = driver.findElement(By.xpath("//select[@name='country']"));
        Select obj = new Select(element);
        obj.selectByVisibleText("INDIA");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vinod");
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("vinod");
        driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("vinod");
        driver.findElement(By.xpath("//input[@name='submit']")).click();
    }
}
