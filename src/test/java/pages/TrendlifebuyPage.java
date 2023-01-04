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

    // Dashboard Page
    @FindBy (xpath = "//*[text()='Wallet Manage']")
    public WebElement walletManage;

    // Offline Recharge Page
    @FindBy (xpath = "//*[text()='Offline Recharge']")
    public WebElement offlineRecharge;

    @FindBy (xpath = "//h3[text()='Offline Recharge']")
    public WebElement offlineRechargeList;

    @FindBy (xpath = "//*[text()='SL']")
    public WebElement informationSL;

    @FindBy (xpath = "//*[text()='Date']")
    public WebElement informationDate;

    @FindBy (xpath = "//*[text()='Email']")
    public WebElement informationEmail;

    @FindBy (xpath = "//*[text()='TXN ID']")
    public WebElement informationTxnId;

    @FindBy (xpath = "//*[text()='Amount']")
    public WebElement informationAmount;

    @FindBy (xpath = "//*[text()='Type']")
    public WebElement informationType;

    @FindBy (xpath = "//*[text()='Payment Method']")
    public WebElement informationPaymentMethod;

    @FindBy (xpath = "//*[text()='Approval']")
    public WebElement informationApproval;

    @FindBy (xpath = "//*[text()='Action']")
    public WebElement informationAction;


    // Keywords Search Page

    // Visitor Report Page

    // My Ticket Page



}
