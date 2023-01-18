package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class sampleSeleniumTest26IFrame {
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\Selenium Test\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/guru99home/");
        driver.manage().window().maximize();
        WebElement iFrame = driver.findElement(By.xpath("//iframe[@id = 'a077aa5e']"));
        driver.switchTo().frame(iFrame);
        System.out.println("Frame switch completed");
        WebElement imgButton = driver.findElement(By.xpath("/html/body/a/img"));
        imgButton.click();
        driver.switchTo();
    }
}
