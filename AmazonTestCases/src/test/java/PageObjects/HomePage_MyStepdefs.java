package PageObjects;

import PageObject.HomePage;
import PageObject.Hooks;
import PageObject.SearchPage;
import PageObject.WebDriverUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class HomePage_MyStepdefs extends Hooks {
    HomePage homepage;

    @Given("^User is on the home page$")
    public void userIsOnTheHomePage() {
        homepage=new HomePage();
        Assert.assertTrue(homepage.IsUserInHomepage());

    }

    @When("^he clicks on \"([^\"]*)\" link$")
    public void heClicksOnLink(String link) {
        homepage.clickOnPage(link);
    }

    @Then("^he should be landed on page with text \"([^\"]*)\"$")
    public void heShouldBeLandedOnPageWithText(String text) {

            Assert.assertTrue(WebDriverUtil.isTextPresent(text));
        }

    @When("^user navigates back$")
    public void userNavigatesBack() {
        homepage.goBack();
    }
}

