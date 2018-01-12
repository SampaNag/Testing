package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Hooks {
    @FindBy(tagName = "body")
    private WebElement checkingtext;

    @FindBy(xpath = "html/body/div[1]/header/div/div[2]/div[3]/div/div/a[3]")
    private WebElement clickinglink;

    @FindBy(xpath = ".//*[@id='nav-link-accountList']/span[1]")
    private WebElement Clinkingsig;


    public void  Homepage(){
        PageFactory.initElements(driver,this);
    }

    public boolean IsUserInHomepage() {
        return checkingtext.getText().contains("Amazon.co.uk");
    }

    public void clickOnPage(String link) {
        System.out.println("Clicking on the link:" + link);
        clickinglink.click();

    }

    public void goBack() {
        {
            driver.navigate().back();
        }
    }

    public void clickonlink(String slink) {
        Clinkingsig.click();
    }
}
