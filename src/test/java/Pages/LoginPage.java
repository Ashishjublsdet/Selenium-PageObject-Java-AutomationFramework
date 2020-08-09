package Pages;

import actionHelper.WebActionHelperMethods;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePageClass {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@type=\"submit\"]")
    WebElement loginBtn;



    public void pressExc() {
        webActionHelperMethods.pressESC(loginBtn);
    }


}
