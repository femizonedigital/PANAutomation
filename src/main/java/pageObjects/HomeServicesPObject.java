package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static core.BaseClass.getDriver;
import static org.openqa.selenium.support.PageFactory.initElements;

public class HomeServicesPObject {

    WebDriver driver;

    public HomeServicesPObject() {
        driver = getDriver();
        initElements(getDriver(), this);
    }

    @FindBy(linkText = "HomeCare products")
    public WebElement homeServicesLink;

    public void SelectHomeCareProducts() throws InterruptedException {
        homeServicesLink.click();
        Thread.sleep(1000);
    }
}
