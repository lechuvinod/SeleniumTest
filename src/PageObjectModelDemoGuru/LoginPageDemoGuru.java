package PageObjectModelDemoGuru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageDemoGuru {
    WebDriver driver;
    By userID = By.name("uid");
    By pass = By.name("password");
    By submit = By.name("btnLogin");

    public LoginPageDemoGuru(WebDriver driver) {
        this.driver = driver;
    }

    public void userIDfun(String uID) {
        driver.findElement(userID).sendKeys(uID);
    }
    public void password(String passWord) {
        driver.findElement(pass).sendKeys(passWord);
    }
    public void submitsPage() {
        driver.findElement(submit).click();
    }
}
