package PageObjectModelDemoGuru;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTourTestngDemoGuru {

        // TODO Auto-generated method stub
        //System.setProperty("webdriver.chrome.driver", "C:\\Projects\\Selenium Test\\chromedriver.exe");
        WebDriver driver;
        public LoginPageDemoGuru loginobj;
        public RegisterPageDemoGuru registerobj;

    @BeforeTest
    public void beforeTestFunction() {
        System.setProperty("webdriver.chrome.driver", "C:\\Projects\\Selenium Test\\chromedriver.exe");
        driver = new ChromeDriver();
        loginobj= new LoginPageDemoGuru(driver);
        registerobj= new RegisterPageDemoGuru(driver);
        driver.get("https://demo.guru99.com/v4/");
    }

    @Test
    public void flogin() {
        loginobj.userIDfun("mngr361519");
        loginobj.password("ApetAnY");
        loginobj.submitsPage();
    }

    @Test
    public void fregister() {
        registerobj.newCustomer();
        registerobj.firstName("Shivani");
        registerobj.dateOfBirth("01/09/2012");
        registerobj.address("Puthuvana Pathiyoor");
        registerobj.city("Kayamkulam");
        registerobj.state("Kerala");
        registerobj.pinno("680230");
        registerobj.telephoneno("9365789452");
        registerobj.emailid("lechuvinod@gmail.com");
        registerobj.password("lakshmi");
        registerobj.submits();
    }
}
