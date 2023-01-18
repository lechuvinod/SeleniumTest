package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sampleSeleniumTest20 {
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\Selenium Test\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ebay.com/");
        Actions actions = new Actions(driver);
        WebElement electronics = driver.findElement(By.xpath("(//a[text()='Electronics'])[2]"));
        actions.moveToElement(electronics).build().perform();
        System.out.println("Mouse select the option Electronics");
        WebElement cellphone = driver.findElement(By.xpath("//a[text()='Cell phones and accessories']"));
        Thread.sleep(4000);
        cellphone.click();
        System.out.println("Click on cellphone");

    }
}
