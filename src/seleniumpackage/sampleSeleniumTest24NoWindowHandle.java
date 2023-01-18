package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class sampleSeleniumTest24NoWindowHandle {
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\Selenium Test\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.xpath("//select[@name='url']"));
        Select obj = new Select(element);
        obj.selectByVisibleText("Beauty");
        driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Face Wash");
        driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
        driver.findElement(By.xpath("(//a[@class='a-color-base a-spacing-micro a-link-normal _bGlmZ_link_gJc5l _bGlmZ_hidden_L-XDK'])[1]")).click();
        Thread.sleep(5000);
        driver.findElement(By .id("add-to-cart-button")).click();
        driver.close();
    }
}
