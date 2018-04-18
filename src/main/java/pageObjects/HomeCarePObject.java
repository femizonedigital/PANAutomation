package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static core.BaseClass.getDriver;
import static org.openqa.selenium.support.PageFactory.initElements;

public class HomeCarePObject {


    WebDriver driver;

    public HomeCarePObject() {
        driver = getDriver();
        initElements(getDriver(), this);
    }


    @FindBy(id = "panel_container")
    public WebElement promotionPanel;

    public boolean CheckPromotionIsDisplayed() {

        return promotionPanel.isDisplayed();
    }
}
