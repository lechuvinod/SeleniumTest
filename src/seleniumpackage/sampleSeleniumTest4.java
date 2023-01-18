package seleniumpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sampleSeleniumTest4 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\Selenium Test\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://in.ebay.com/");
        System.out.println("The text is "+ driver.getTitle());
        driver.navigate().to("https://www.flipkart.com/");
        System.out.println("The text is "+ driver.getTitle());
        driver.navigate().to("https://www.amazon.in/");
        System.out.println("The text is "+ driver.getTitle());
        driver.navigate().back();
        System.out.println("The text is "+ driver.getTitle());
        driver.navigate().forward();
        System.out.println("The url is "+ driver.getCurrentUrl());
        driver.navigate().back();
        driver.navigate().back();
        System.out.println("The url is "+ driver.getCurrentUrl());
        driver.navigate().refresh();
        //driver.close();
        driver.quit();
    }
}
