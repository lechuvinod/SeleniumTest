package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.Set;

public class sampleSeleniumTest25WindowHandle {
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\Selenium Test\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/r.php");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[@id='privacy-link']")).click();
        String handle = driver.getWindowHandle();//main window handle
        Set<String> handles = driver.getWindowHandles();//main and child window handle
        handles.remove(handle);//to remove main window handle
        String newHandle = handles.iterator().next();
        driver.switchTo().window(newHandle);//switching to parent window
        driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
        Thread.sleep(5000);
        driver.switchTo().window(handle);//closing the main window
        driver.close();
    }
}
