package PageObjectModelMusafir;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BookedTicketInMusafir {
    WebDriver driver;
    By submit = By.xpath("//a[@class='button book yellow dataCommunicationBound buttonBound customButton']");
   public BookedTicketInMusafir(WebDriver driver) {
        this.driver = driver;
    }

    public void submit() {
        driver.findElement(submit).click();
    }

}
