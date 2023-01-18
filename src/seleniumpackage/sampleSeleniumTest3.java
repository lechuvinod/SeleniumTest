package seleniumpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sampleSeleniumTest3 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\Selenium Test\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.myntra.com/");
        driver.manage().window().maximize();
        String title = driver.getTitle();
        String url = driver.getCurrentUrl();
        System.out.println("The text is "+ title);
        System.out.println("The Url is "+url);
        driver.quit();
    }
}
