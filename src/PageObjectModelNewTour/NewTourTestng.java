package PageObjectModelNewTour;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTourTestng {

        // TODO Auto-generated method stub
        //System.setProperty("webdriver.chrome.driver", "C:\\Projects\\Selenium Test\\chromedriver.exe");
        WebDriver driver;
        public LoginPage loginobj;
        public RegisterPage registerobj;

    @BeforeTest
    public void beforeTestFunction() {
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\Selenium Test\\chromedriver.exe");
        driver = new ChromeDriver();
        loginobj= new LoginPage(driver);
        registerobj= new RegisterPage(driver);
        driver.get("https://demo.guru99.com/test/newtours/");
    }

    @Test
    public void flogin() {
        loginobj.userName("nivya");
        loginobj.password("nivya");
        loginobj.submitsPage();
    }

    @Test
    public void fregister() {
        registerobj.register();
        registerobj.firstName("Lakshmi");
        registerobj.lastName("Vinod");
        registerobj.phone("9495872907");
        registerobj.email("lechuvinod@gmail.com");
    }

}
