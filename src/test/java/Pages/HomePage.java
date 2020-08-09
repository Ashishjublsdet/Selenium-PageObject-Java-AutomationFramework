package Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePageClass {
    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@placeholder=\"Search for products, brands and more\"]")
    WebElement searchForProducts;

    @FindBy(xpath = "")
    WebElement mobileNames;

    public void searchForProducts() {
        webActionHelperMethods.clickbutton(searchForProducts);
        searchForProducts.sendKeys("Mobiles");
        searchForProducts.sendKeys(Keys.ENTER);
    }
}
