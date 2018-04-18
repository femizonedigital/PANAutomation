package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;
import pageObjects.HomeCarePObject;
import pageObjects.HomePObject;
import pageObjects.HomeServicesPObject;

public class NavigationSteps {


    @Given("^I select Home Services$")
    public void iSelectHomeServices() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        HomePObject homePObject = new HomePObject();
        homePObject.OpenHomeServices();
    }

    @And("^I select home care products$")
    public void iSelectHomeCareProducts() throws Throwable {

        HomeServicesPObject homeServicesPObject = new HomeServicesPObject();
        homeServicesPObject.SelectHomeCareProducts();
    }

    @Then("^I should see the default BNA$")
    public void iShouldSeeTheDefaultBna() throws Throwable {

        HomeCarePObject homeCarePObject = new HomeCarePObject();        ;
        //homeCarePObject.GetPromotionText();
        Assert.assertTrue(homeCarePObject.CheckPromotionIsDisplayed());
    }
}


