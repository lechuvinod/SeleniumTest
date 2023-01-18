package PageObjectModelDemoGuru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPageDemoGuru {
    WebDriver driver;
    By newCustomer = By.linkText("New Customer");
    By firstName = By.name("name");
    By dateOfBirth = By.id("dob");//01/09/2012
    By address = By.name("addr");
    By city = By.name("city");
    By state = By.name("state");
    By pinno = By.name("pinno");
    By telephoneno = By.name("telephoneno");
    By emailid = By.name("emailid");
    By password = By.name("password");
    By submits = By.name("sub");

    public RegisterPageDemoGuru(WebDriver driver) {
        this.driver = driver;
    }
    public void newCustomer() {
        driver.findElement(newCustomer).click();
    }

    public void firstName(String name) {
        driver.findElement(firstName).sendKeys(name);
    }

    public void dateOfBirth(String dob) {
        driver.findElement(dateOfBirth).sendKeys(dob);
    }
    public void address(String addr) {
        driver.findElement(address).sendKeys(addr);
    }
    public void city(String cit) {
        driver.findElement(city).sendKeys(cit);
    }
    public void state(String stat) {
        driver.findElement(state).sendKeys(stat);
    }
    public void pinno(String pin) {
        driver.findElement(pinno).sendKeys(pin);
    }
    public void telephoneno(String tele) {
        driver.findElement(telephoneno).sendKeys(tele);
    }
    public void emailid(String eid) {
        driver.findElement(emailid).sendKeys(eid);
    }
    public void password(String pass) {
        driver.findElement(password).sendKeys(pass);
    }
    public void submits() {
        driver.findElement(submits).click();
    }



}
