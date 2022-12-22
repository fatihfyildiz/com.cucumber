package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TrendlifebuyPage {

    public TrendlifebuyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // Admin Page
    @FindBy(xpath = "//input[@name='login']")
    public WebElement EmailBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement PasswordBox;

    @FindBy(id = "sign_in_btn")
    public WebElement SignInLink;

    // Dashboard





}
