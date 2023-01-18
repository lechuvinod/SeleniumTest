package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sampleSeleniumTest10 {
    public static void main(String[] args) {
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
    }
}
