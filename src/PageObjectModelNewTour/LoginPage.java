package PageObjectModelNewTour;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    WebDriver driver;
    By user = By.name("userName");
    By pass = By.name("password");
    By submit = By.name("submit");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void userName(String userName) {
        driver.findElement(user).sendKeys(userName);
    }
    public void password(String passWord) {
        driver.findElement(pass).sendKeys(passWord);
    }
    public void submitsPage() {
        driver.findElement(submit).click();
    }
}
