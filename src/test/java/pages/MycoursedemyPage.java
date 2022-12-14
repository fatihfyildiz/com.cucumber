package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class MycoursedemyPage {

    public MycoursedemyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement loginLinki;

    @FindBy(xpath = "//input[@id='login-email']")
    public WebElement emailKutusu;

    @FindBy(xpath = "//input[@id='login-password']")
    public WebElement passwordKutusu;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButonu;

    @FindBy (linkText = "My courses")
    public WebElement myCoursesLink;

    @FindBy(xpath = "//a[@onclick='cookieAccept();']")
    public WebElement acceptCookies;

    // Group Working with Nvzt
    @FindBy(xpath = "//a[text()='Log in']")
    public WebElement loginLink;

    @FindBy(xpath = "//input[@id='login-email']")
    public WebElement emailBox;

    @FindBy(xpath = "//button[text()='Login']")
    public WebElement loginButton;

    @FindBy(xpath = "//*[text()='Accept']")
    public WebElement acceptCookies2;

    @FindBy(xpath = "//input[@id='login-password']")
    public WebElement passwordBox;

    @FindBy (linkText = "Course manager")
    public WebElement courseManagerLink;

    @FindBy(xpath = "//img[@src=\"https://qualitydemy.com/uploads/system/393645bf994114c23be28028a47a77a0.png\"]")
    public WebElement demyPicture;

    @FindBy (xpath = "//a[text () = 'Instructor']")
    public WebElement instructorLink;

    @FindBy(xpath = "//span[text()='Course manager']")
    public WebElement courseManagerButton;

    @FindBy (xpath = "//a[@class='btn btn-outline-primary btn-rounded alignToTitle']")
    public WebElement add_newcourse;

    @FindBy(xpath = "//span[text()='Requirements']")
    public WebElement requirementsButton;

    @FindBy(xpath = "//button[@onclick='appendRequirement()']")
    public WebElement requirementsGreenPlusButton;

    @FindBy(xpath = "(//button[@onclick='removeRequirement(this)'])[2]")
    public WebElement requirementsRedMinusButton;

    // Sign Up section locates
    @FindBy(xpath = "//a[@class='btn btn-sign-up']")
    public WebElement signupLink;

    @FindBy(xpath = "(//input[@type='text'])[2]")
    public WebElement firstnameBox;

    @FindBy(xpath = "(//input[@type='text'])[3]")
    public WebElement lastnameBox;

    @FindBy(xpath = "(//input[@type='text'])[4]")
    public WebElement signupEmailBox;

    @FindBy(xpath = "//input[@type='password']")
    public WebElement signupPasswordBox;

    @FindBy(xpath = "(//button[@type='submit'])[2]")
    public WebElement signupButton;

    @FindBy(xpath = "//div[@class='toast-message']")
    public WebElement hataMesaji;

}
