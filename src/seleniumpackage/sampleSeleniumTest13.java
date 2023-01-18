package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sampleSeleniumTest13 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\Selenium Test\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/r.php");
        driver.manage().window().maximize();
        WebElement webElement = driver.findElement(By.xpath("//a[@title='Malayalam']"));
        Boolean malayalam = webElement.isEnabled();
        if(malayalam) {
            System.out.println("click on Malayalam");
            webElement.click();
        }
        System.out.println("Current title is : "+ driver.getTitle());

    }
}
