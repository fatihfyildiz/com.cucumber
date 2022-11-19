package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.AutomationPage;
import utilities.Driver;

public class AutomationStepDefinitions {

    AutomationPage automationPage= new AutomationPage();

    @Given("user signup linkine tiklar")
    public void user_signup_linkine_tiklar() {
        automationPage.signUpLink.click();
    }

    @Given("new user bölümüne name ve email adresi girer")
    public void new_user_bolümüne_name_ve_email_adresi_girer() {
        automationPage.isimKutusu.sendKeys("Fatih");
        automationPage.emailKutusu.sendKeys("f3t1h5@gmail.com");
    }
    @Given("sign Up butonuna basar")
    public void sign_up_butonuna_basar() {
        automationPage.signUpButton.click();
    }

    @Given("user kisisel bilgilerini ve iletisim bilgilerini girer")
    public void user_kisisel_bilgilerini_ve_iletisim_bilgilerini_girer() {
        Actions actions= new Actions(Driver.getDriver());
        actions.click(automationPage.erkekTitleRadioButton).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys("123456").
                sendKeys(Keys.TAB).
                sendKeys("40").
                sendKeys(Keys.TAB).
                sendKeys("April").
                sendKeys(Keys.TAB).
                sendKeys("1988").
                sendKeys(Keys.TAB).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.ARROW_DOWN).
                sendKeys(Keys.TAB).
                sendKeys(Keys.TAB).
                sendKeys("Fatih").
                sendKeys(Keys.TAB).
                sendKeys("Yildiz").
                sendKeys(Keys.TAB).
                sendKeys("Isvicre").
                sendKeys(Keys.TAB).
                sendKeys("Cenevre").
                sendKeys(Keys.TAB).
                sendKeys("-").
                sendKeys(Keys.TAB).
                sendKeys("New Zealand").
                sendKeys(Keys.TAB).
                sendKeys("-").
                sendKeys(Keys.TAB).
                sendKeys("Zurich").
                sendKeys(Keys.TAB).
                sendKeys("12321").
                sendKeys(Keys.TAB).
                sendKeys("+4623232003").
                sendKeys(Keys.TAB).
                sendKeys(Keys.ENTER).
                perform();


    }

    @Given("user create account butonuna basar")
    public void user_create_account_butonuna_basar() {
        // automationPage.createAccountButton.click();
    }

    @Then("hesap olustugunu dogrulayin")
    public void hesap_olustugunu_dogrulayin() {
        Assert.assertTrue(automationPage.createAccountButton.isDisplayed());
    }

}
