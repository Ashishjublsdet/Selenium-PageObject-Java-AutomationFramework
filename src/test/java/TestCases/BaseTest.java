package TestCases;

import Pages.LoginPage;
import Pages.HomePage;
import driverManager.DriverManagerType;
import driverManager.WebDrivers;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import util.utility;

import java.util.Properties;

public class BaseTest {

    protected LoginPage loginPage;
    protected HomePage homePage;
    WebDriver driver;
    Properties properties;
    static String URL;

    @BeforeSuite
    public void setUp() {
        String propertyPath = System.getProperty("user.dir") + "//src//test//resources//Env.properties";
        try {
            driver = WebDrivers.getDriver(DriverManagerType.CHROME);
            properties = utility.loadProperties(propertyPath);
            URL = properties.getProperty("URL");

            loginPage = new LoginPage(driver);
            homePage = new HomePage(driver);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @AfterSuite
    public void destroyDriver() {
        driver.quit();
    }
}