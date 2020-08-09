package Pages;

import actionHelper.WebActionHelperMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePageClass {
    protected WebDriver driver;
    static WebActionHelperMethods webActionHelperMethods;

    public BasePageClass(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        webActionHelperMethods= new WebActionHelperMethods(driver);
    }

}
