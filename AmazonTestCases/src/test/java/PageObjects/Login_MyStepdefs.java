package PageObjects;

import PageObject.HomePage;
import PageObject.LoginPage;
import PageObject.WebDriverUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class Login_MyStepdefs {
    HomePage homePage;
    LoginPage loginPage;
    @When("^user clicks \"([^\"]*)\" link$")
    public void userClicksLink(String slink) {
        homePage=new HomePage();
        homePage.clickonlink(slink);

    }

    @And("^user types valid email \"([^\"]*)\"  and password \"([^\"]*)\"$")
    public void userTypesValidEmailAndPassword(String email, String password) {
        loginPage=new LoginPage();
        loginPage.entertheemail(email);
        loginPage.enterthepassword(password);

    }

    @And("^user clicks on \"([^\"]*)\"$")
    public void userClicksOn(String link) {
        loginPage.clickoonlink(link);
    }

    @Then("^user should landed on the page with text \"([^\"]*)\"$")
    public void userShouldLandedOnThePageWithText(String text2) {
        Assert.assertTrue(WebDriverUtil.isTextPresent(text2));
    }
}
