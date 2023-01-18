package seleniumpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class sampleSeleniumTest11Musafir2 {
    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\Selenium Test\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://in.musafir.com/");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='Origin']")).sendKeys("Kochi, India (COK)");
        driver.findElement(By.xpath("//input[@name='Destination']")).sendKeys("Bengaluru, India (BLR)");
        driver.findElement(By.xpath("//input[@name='StartDate']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//li[@date='2022-02-28']")).click();
        driver.findElement(By.xpath("//input[@name='EndDate']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//li[@date='2022-03-30']")).click();
        WebElement x1 = driver.findElement(By.xpath("//select[@name='AdultsFlight']"));
        Select obj1 = new Select(x1);
        obj1.selectByValue("2");
        WebElement x2 = driver.findElement(By.xpath("//select[@name='ChildrenFlight']"));
        Select obj2 = new Select(x2);
        obj2.selectByValue("1");
        WebElement x3 = driver.findElement(By.xpath("//select[@name='InfantsFlight']"));
        Select obj3 = new Select(x3);
        obj3.selectByValue("0");
        driver.findElement(By.xpath("//a[@class='optional submit button yellow flightsOnly_all buttonBound customButton']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//a[@class='button book yellow dataCommunicationBound buttonBound customButton']")).click();
        Thread.sleep(10000);
        WebElement x4 = driver.findElement(By.xpath("(//select[@data-value-rule='required'])[1]"));
        Select obj4 = new Select(x4);
        obj4.selectByVisibleText("Mr");
        driver.findElement(By.xpath("(//input[@placeholdevalue='First name'])[1]")).sendKeys("Vinod");
        driver.findElement(By.xpath("(//input[@placeholdevalue='Last name'])[1]")).sendKeys("Kumar");
        driver.findElement(By.xpath("(//input[@placeholder='Date of birth (dd/mm/yyyy)'])[1]")).sendKeys("05/05/1979");
        WebElement x5 = driver.findElement(By.xpath("(//select[@data-value-rule='required'])[2]"));
        Select obj5 = new Select(x5);
        obj5.selectByVisibleText("Indian");
        WebElement F1 = driver.findElement(By.xpath("(//select[@data-value-rule='required'])[3]"));
        Select objF1 = new Select(F1);
        objF1.selectByVisibleText("Mrs");
        driver.findElement(By.xpath("(//input[@placeholdevalue='First name'])[2]")).sendKeys("Lakshmi");
        driver.findElement(By.xpath("(//input[@placeholdevalue='Last name'])[2]")).sendKeys("Vinod");
        driver.findElement(By.xpath("(//input[@placeholder='Date of birth (dd/mm/yyyy)'])[2]")).sendKeys("12/11/1983");
        WebElement x7 = driver.findElement(By.xpath("(//select[@data-value-rule='required'])[4]"));
        Select obj7 = new Select(x7);
        obj7.selectByVisibleText("Indian");
        WebElement x8 = driver.findElement(By.xpath("(//select[@data-value-rule='required'])[5]"));
        Select obj8 = new Select(x8);
        obj8.selectByVisibleText("Miss");
        driver.findElement(By.xpath("(//input[@placeholdevalue='First name'])[3]")).sendKeys("Shivani");
        driver.findElement(By.xpath("(//input[@placeholdevalue='Last name'])[3]")).sendKeys("Vinod");
        driver.findElement(By.xpath("(//input[@placeholder='Date of birth (dd/mm/yyyy)'])[3]")).sendKeys("09/01/2012");
        WebElement x9 = driver.findElement(By.xpath("(//select[@data-value-rule='required'])[6]"));
        Select obj9 = new Select(x9);
        obj9.selectByVisibleText("Indian");
        driver.findElement(By.xpath("//input[@placeholder='Email address']")).sendKeys("lechuvinod@gmail.com");
        driver.findElement(By.xpath("//input[@placeholder='Phone number']")).sendKeys("919495872907");
    }
}
