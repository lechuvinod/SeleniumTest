package seleniumpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sampleSeleniumTest16 {
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\Selenium Test\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/alerts");
        driver.findElement(By.xpath("//button[@id='promtButton']")).click();
        Alert alertValue = driver.switchTo().alert();
        System.out.println(alertValue.getText());
        Thread.sleep(50000);
        alertValue.sendKeys("Ohm Nama Shivaya");
        Thread.sleep(50000);
        alertValue.accept();
        System.out.println("Prompt Alert Accepted...");
    }
}
