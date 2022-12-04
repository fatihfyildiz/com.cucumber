package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.AutomationExercisePage;
import utilities.ConfigReader;
import utilities.Driver;

public class AutomationExerciseStepDefinitions {

    AutomationExercisePage automationExercisePage= new AutomationExercisePage();

    @Given("Kullanici {string} sayfasina gider")
    public void kullaniciSayfasinaGider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @Then("Kullanici Signout Butonuna tiklar")
    public void kullanici_signout_butonuna_tiklar() {
        automationExercisePage.signUpLink.click();
    }

    @Then("Kullanici email bolumune {string} girer")
    public void kullanici_email_bolumune_girer(String istenenEmail) {
        automationExercisePage.emailBox.sendKeys(ConfigReader.getProperty(istenenEmail));
    }

    @Then("Kullanici password bolumune {string} girer")
    public void kullanici_password_bolumune_girer(String istenenPassword) {
        automationExercisePage.passwordBox.sendKeys(ConfigReader.getProperty(istenenPassword));
    }

    @Then("Kullanici Login Butonuna tiklar")
    public void kullanici_login_butonuna_tiklar() {
        automationExercisePage.loginButonu.click();
    }

    @Then("Kullanici Automation sayfasina giris yaptigini test eder")
    public void kullanici_automation_sayfasina_giris_yaptigini_test_eder() {
        Assert.assertTrue(automationExercisePage.logoutButonu.isDisplayed());
    }

    @Then("Kullanici sayfaya giris yapilamadigini test eder")
    public void kullanici_sayfaya_giris_yapilamadigini_test_eder() {
        Assert.assertTrue(automationExercisePage.loginButonu.isDisplayed());
    }

}