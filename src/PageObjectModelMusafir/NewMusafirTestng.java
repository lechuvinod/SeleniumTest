package PageObjectModelMusafir;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewMusafirTestng {
    // TODO Auto-generated method stub
    WebDriver driver;
    public LoginPageMusafir loginPageMusafir;
    public BookedTicketInMusafir bookedTicketInMusafir;
    public RegisterPagMusafir registerPagMusafir;

    @BeforeTest
    public void beforeTestFunction() {
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\Selenium Test\\chromedriver.exe");
        driver = new ChromeDriver();
        loginPageMusafir = new LoginPageMusafir(driver);
        bookedTicketInMusafir = new BookedTicketInMusafir(driver);
        registerPagMusafir = new RegisterPagMusafir(driver);
        driver.get("https://in.musafir.com/");
    }

    @Test
    public void f1() throws InterruptedException {
        loginPageMusafir.origin("Kochi, India (COK)");
        loginPageMusafir.destination("Bengaluru, India (BLR)");
        loginPageMusafir.startDate("10/03/22");
        loginPageMusafir.endDate("30/03/22");
        loginPageMusafir.adultsFlight();
        loginPageMusafir.childrenFlight();
        loginPageMusafir.infantsFlight();
        loginPageMusafir.submit();
        Thread.sleep(5000);
    }

    @Test
    public void f2() throws InterruptedException {
        bookedTicketInMusafir.submit();
        Thread.sleep(10000);
    }

    @Test
    public void f3() {
        registerPagMusafir.master();
        registerPagMusafir.firstName("Vinod");
        registerPagMusafir.lastName("Kumar S");
        registerPagMusafir.dateOfBirth("05/05/1979");
        registerPagMusafir.nationality();
        registerPagMusafir.masters();
        registerPagMusafir.firstName1("Lakshmi");
        registerPagMusafir.lastName1("Vinod");
        registerPagMusafir.dateOfBirth1("12/11/1983");
        registerPagMusafir.nationality1();
        registerPagMusafir.mistress();
        registerPagMusafir.firstName2("Shivani");
        registerPagMusafir.lastName2("Vinod");
        registerPagMusafir.dateOfBirth2("09/01/2012");
        registerPagMusafir.nationality2();
        registerPagMusafir.email("lechuvinod@gmail.com");
        registerPagMusafir.phoneNumber("9495872907");

    }

}
