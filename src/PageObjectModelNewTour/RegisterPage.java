package PageObjectModelNewTour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    WebDriver driver;
    By register = By.linkText("REGISTER");
    By firstName = By.name("firstName");
    By lastName = By.name("lastName");
    By phone = By.name("phone");
    By email = By.name("userName");


    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }
    public void register() {
        driver.findElement(register).click();
    }

    public void firstName(String fName) {
        driver.findElement(firstName).sendKeys(fName);
    }
    public void lastName(String lName) {
        driver.findElement(lastName).sendKeys(lName);
    }
    public void phone(String iphone) {
        driver.findElement(phone).sendKeys(iphone);
    }
    public void email(String emailid) {
        driver.findElement(email).sendKeys(emailid);
    }


}
