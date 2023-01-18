package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sampleSeleniumTest11Musafir {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\Selenium Test\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://in.musafir.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='Origin']")).sendKeys("Kochi, India (COK)");
        driver.findElement(By.xpath("//input[@name='Destination']")).sendKeys("Bengaluru, India (BLR)");
        driver.findElement(By.xpath("//input[@name='StartDate']")).sendKeys("28/02/22");
        driver.findElement(By.xpath("//input[@name='EndDate']")).sendKeys("15/03/22");
        WebElement x1 = driver.findElement(By.xpath("//select[@name='AdultsFlight']"));
        Select obj1 = new Select(x1);
        obj1.selectByValue("2");
        WebElement x2 = driver.findElement(By.xpath("//select[@name='ChildrenFlight']"));
        Select obj2 = new Select(x2);
        obj2.selectByValue("2");
        WebElement x3 = driver.findElement(By.xpath("//select[@name='InfantsFlight']"));
        Select obj3 = new Select(x3);
        obj3.selectByValue("0");
        driver.findElement(By.xpath("//i[@class='customLabel']")).click();
    }
}
