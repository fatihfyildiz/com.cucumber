package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class TrendlifebuyPage {

    public TrendlifebuyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // User Story 37: recharge - offline - index

    // Admin Login Page
    @FindBy(xpath = "//input[@name='login']")
    public WebElement emailBox;

    @FindBy(xpath = "//input[@name='password']")
    public WebElement passwordBox;

    @FindBy(id = "sign_in_btn")
    public WebElement signInLink;

    // Dashboard
    @FindBy (xpath = "//*[text()='Wallet Manage']")
    public WebElement walletManage;

    // Offline Recharge Page
    @FindBy (xpath = "//*[text()='Offline Recharge']")
    public WebElement offlineRecharge;

    // Keywords Search Page

    // Visitor Report Page

    // My Ticket Page



}
