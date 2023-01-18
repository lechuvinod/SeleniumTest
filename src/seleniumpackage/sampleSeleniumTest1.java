package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class sampleSeleniumTest1 {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver  = new ChromeDriver();
        //driver.get("https://staging3-akes.nexquare.io");
        driver.get("https://rmm-int.financial.com/login/classic.html");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
       // WebElement element =  driver.findElement(By.LocatorStrategy("LocatorValue"));
        //List<WebElement> elements= driver.findElements(By.LocatorStrategy("LocatorValue"));
        driver.findElement(By.xpath("//input[@id='loginNameInput']")).sendKeys("rmm_br_bradesco");
        driver.findElement(By.xpath("//input[@id='passwordInput']")).sendKeys("financial123");
        //driver.findElement(By.xpath("//input[@id='User']")).sendKeys("S15364");
        //driver.findElement(By.xpath("//input[@id='txtpassword']")).sendKeys("Abc!@1");
        //driver.findElement(By.xpath("//input[@id='log-btn']")).click();
        driver.findElement(By.xpath("//input[@id='menu_item_nav_item_system_logout']")).click();
        Thread.sleep(10000);
        WebElement ele = driver.findElement(By.xpath("//span[contains(text(),'Staff Profile Management')]"));
        ele.click();
    }
}
