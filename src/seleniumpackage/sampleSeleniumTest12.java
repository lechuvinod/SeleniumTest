package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class sampleSeleniumTest12 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\Selenium Test\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();
        String expectedString = "Google";
        if(expectedString.equals(driver.getTitle())) {
            System.out.println("Expected and Displayed titles are same");
        } else {
            System.out.println("Expected and Displayed titles are not same");

        }
        WebElement webElement = driver.findElement(By.xpath("//a[text()='Gmail']"));
        Boolean value = webElement.isDisplayed();
        if(value == true) {
            System.out.println("gmail present");
            webElement.click();
        } else {
            System.out.println("Gmail not present");
        }

    }
}
