package PageObjects;

import PageObject.SearchPage;
import PageObject.WebDriverUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Search_MyStepdefs {
    SearchPage searchpage;
    @When("^user types \"([^\"]*)\" in the search bar$")
    public void userTypesInTheSearchBar(String type) {
        searchpage=new SearchPage();
        searchpage.enterinsearchbar(type);
    }

    @And("^clicks on \"([^\"]*)\" button$")
    public void clicksOnButton(String clickbutton) {
        searchpage.clickonbutton(clickbutton);

    }

    @And("^clicks on \"([^\"]*)\" link$")
    public void clicksOnLink(String legolink) {
        searchpage.clickonlegolink(legolink);
    }

    @And("^user clicks on \"([^\"]*)\" button$")
    public void userClicksOnButton(String basketlink) {
        searchpage.clickonaddtobasket(basketlink);
    }

    @Then("^user is able to see the item in the basket as \"([^\"]*)\"$")
    public void userIsAbleToSeeTheItemInTheBasketAs(String text1) {
        Assert.assertTrue(WebDriverUtil.isTextPresent(text1));
    }
}
