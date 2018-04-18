package pageObjects;

import core.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePObject extends BaseClass {


    WebDriver driver;

    public HomePObject() {
        driver = getDriver();
        PageFactory.initElements(getDriver(), this);
    }

    // Page elements

    @FindBy(linkText = "Home Services")
    public WebElement homeServicesLink;

    // Page Methods

    public void OpenHomeServices() {

        Actions actions = new Actions(driver);
        actions.moveToElement(homeServicesLink).perform();
    }
}


