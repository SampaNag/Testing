package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage extends Hooks {

    @FindBy(xpath = "html/body/div[1]/header/div/div[1]/div[3]/div/form/div[3]/div[1]/input")
    private WebElement entersearch;

    @FindBy(xpath = "html/body/div[1]/header/div/div[1]/div[3]/div/form/div[2]/div/input")
    private WebElement clickonsearch;

    @FindBy(xpath = "html/body/div[1]/div[2]/div/div[3]/div[2]/div/div[4]/div[1]/div/ul/li[1]/div/div[3]/div/a/h2")
    private WebElement clickonlego;

    @FindBy(xpath = "html/body/div[2]/div[2]/div[6]/div[4]/div[2]/div/div/form/div[1]/div/div[1]/div/div/div[2]/div[3]/span/span/input")
    private WebElement clickonbasket;


    public void SearchPage(){
        PageFactory.initElements(driver,this);
    }
    public void enterinsearchbar(String type) {
        entersearch.sendKeys(type);

    }

    public void clickonbutton(String clickbutton) {
        clickonsearch.click();

    }
    public void clickonlegolink(String legolink) {
        clickonlego.click();
    }




    public void clickonaddtobasket(String basketlink) {
        clickonbasket.click();
    }


}
