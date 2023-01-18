package PageObjectModelMusafir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class RegisterPagMusafir {
    WebDriver driver;

    By mr = By.xpath("(//select[@data-value-rule='required'])[1]");
    By firstName = By.xpath("(//input[@placeholdevalue='First name'])[1]");
    By lastName = By.xpath("(//input[@placeholdevalue='Last name'])[1]");
    By dateOfBirth = By.xpath("(//input[@placeholder='Date of birth (dd/mm/yyyy)'])[1]");//05/05/1979
    By nationality = By.xpath("(//select[@data-value-rule='required'])[2]");//05/05/1979

    By mrs = By.xpath("(//select[@data-value-rule='required'])[3]");
    By firstName1 = By.xpath("(//input[@placeholdevalue='First name'])[2]");
    By lastName1 = By.xpath("(//input[@placeholdevalue='Last name'])[2]");
    By dateOfBirth1 = By.xpath("(//input[@placeholder='Date of birth (dd/mm/yyyy)'])[2]");//05/05/1979
    By nationality1 = By.xpath("(//select[@data-value-rule='required'])[4]");//12/11/1983

    By miss = By.xpath("(//select[@data-value-rule='required'])[5]");
    By firstName2 = By.xpath("(//input[@placeholdevalue='First name'])[3]");
    By lastName2 = By.xpath("(//input[@placeholdevalue='Last name'])[3]");
    By dateOfBirth2 = By.xpath("(//input[@placeholder='Date of birth (dd/mm/yyyy)'])[3]");//05/05/1979
    By nationality2 = By.xpath("(//select[@data-value-rule='required'])[6]");//12/11/1983

    By email = By.xpath("//input[@placeholder='Email address']");//lechuvinod@gmail.com
    By phoneNumber = By.xpath("//input[@placeholder='Phone number']");//12/11/1983

    public RegisterPagMusafir(WebDriver driver) {
        this.driver = driver;
    }
    public void master() {
        WebElement x1 = driver.findElement(mr);
        Select obj1 = new Select(x1);
        obj1.selectByVisibleText("Mr");
    }
    public void firstName(String fname) {
        driver.findElement(firstName).sendKeys(fname);
    }
    public void lastName(String lname) {
        driver.findElement(lastName).sendKeys(lname);
    }
    public void dateOfBirth(String dob1) {
        driver.findElement(dateOfBirth).sendKeys(dob1);
    }
    public void nationality() {
        WebElement x2 = driver.findElement(nationality);
        Select obj2 = new Select(x2);
        obj2.selectByVisibleText("Indian");
    }
    public void masters() {
        WebElement x3 = driver.findElement(mrs);
        Select obj3 = new Select(x3);
        obj3.selectByVisibleText("Mrs");
    }
    public void firstName1(String fname1) {
        driver.findElement(firstName1).sendKeys(fname1);
    }
    public void lastName1(String lname1) {
        driver.findElement(lastName1).sendKeys(lname1);
    }
    public void dateOfBirth1(String dob2) {
        driver.findElement(dateOfBirth1).sendKeys(dob2);
    }
    public void nationality1() {
        WebElement x4 = driver.findElement(nationality1);
        Select obj4 = new Select(x4);
        obj4.selectByVisibleText("Indian");
    }

    public void mistress() {
        WebElement x5 = driver.findElement(miss);
        Select obj5 = new Select(x5);
        obj5.selectByVisibleText("Miss");
    }
    public void firstName2(String fname2) {
        driver.findElement(firstName2).sendKeys(fname2);
    }
    public void lastName2(String lname2) {
        driver.findElement(lastName2).sendKeys(lname2);
    }
    public void dateOfBirth2(String dob3) {
        driver.findElement(dateOfBirth2).sendKeys(dob3);
    }
    public void nationality2() {
        WebElement x6 = driver.findElement(nationality2);
        Select obj6 = new Select(x6);
        obj6.selectByVisibleText("Indian");
    }
    public void email(String email1) {
        driver.findElement(email).sendKeys(email1);
    }
    public void phoneNumber(String phNo) {
        driver.findElement(phoneNumber).sendKeys(phNo);
    }

}
