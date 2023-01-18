package PageObjectModelMusafir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class LoginPageMusafir {
    WebDriver driver;
    By origin = By.name("Origin");
    By destination = By.name("Destination");
    By startDate = By.name("StartDate");
    By endDate = By.name("EndDate");
    By adultsFlight = By.xpath("//select[@name='AdultsFlight']") ;
    By childrenFlight = By.xpath("//select[@name='ChildrenFlight']");
    By infantsFlight = By.xpath("//select[@name='InfantsFlight']");
    By submit = By.xpath("//a[@class='optional submit button yellow flightsOnly_all buttonBound customButton']");

    public LoginPageMusafir(WebDriver driver) {
        this.driver = driver;
    }
    public void origin(String org) {
        driver.findElement(origin).sendKeys(org);
    }
    public void destination(String dest) {
        driver.findElement(destination).sendKeys(dest);
    }
    public void startDate(String sDate) {
        driver.findElement(startDate).sendKeys(sDate);
    }
    public void endDate(String eDate) {
        driver.findElement(endDate).sendKeys(eDate);
    }
    public void adultsFlight() {
        WebElement x1 = driver.findElement(adultsFlight);
        Select obj1 = new Select(x1);
        obj1.selectByValue("2");
    }
    public void childrenFlight() {
        WebElement x2 = driver.findElement(childrenFlight);
        Select obj2 = new Select(x2);
        obj2.selectByValue("1");
    }
    public void infantsFlight() {
        WebElement x3 = driver.findElement(infantsFlight);
        Select obj3 = new Select(x3);
        obj3.selectByValue("0");
    }
    public void submit() {
        driver.findElement(submit).click();
    }
}
