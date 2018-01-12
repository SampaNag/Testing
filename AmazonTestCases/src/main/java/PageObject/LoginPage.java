package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Hooks {
    @FindBy(id="ap_email")
    private WebElement mail;

    @FindBy(id="ap_password")
    private WebElement pwd;

    @FindBy(id="signInSubmit")
    private WebElement clicksubmit;

    public void LoginPage(){
        PageFactory.initElements(driver,this);
    }

    public void entertheemail(String email) {
        mail.sendKeys(email);
    }

    public void enterthepassword(String password) {
        pwd.sendKeys(password);
    }

    public void clickoonlink(String link) {
        clicksubmit.sendKeys(link);
    }
}
