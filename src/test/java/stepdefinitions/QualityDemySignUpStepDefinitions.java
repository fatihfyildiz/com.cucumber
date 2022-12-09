package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.MycoursedemyPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

public class QualityDemySignUpStepDefinitions {

    MycoursedemyPage mycoursedemyPage=new MycoursedemyPage();

    @Then("Kullanici Quality Demy Sign Up linkine tiklar")
    public void kullanici_quality_demy_sign_up_linkine_tiklar() {
        ReusableMethods.waitFor(2);
        mycoursedemyPage.acceptCookies2.click();
        ReusableMethods.waitFor(2);
        mycoursedemyPage.signupLink.click();
    }
    @Then("Kullanici Firstname Kutusuna {string} girer")
    public void kullanici_firstname_kutusuna_girer(String istenenIsim) {
        mycoursedemyPage.firstnameBox.sendKeys(ConfigReader.getProperty(istenenIsim)); // Configuration Properties'den getiriyor
        // mycoursedemyPage.firstnameBox.sendKeys(isim); ==> Features USzzzz'deki Examples altindaki istenenIsim'den getirir
    }
    @Then("Kullanici Lastname Kutusuna {string} girer")
    public void kullanici_lastname_kutusuna_girer(String istenenSoysim) {
        mycoursedemyPage.lastnameBox.sendKeys(istenenSoysim);
    }
    @Then("Kullanici Email Kutusuna {string} girer")
    public void kullanici_email_kutusuna_girer(String istenenEmail) {
        mycoursedemyPage.signupEmailBox.sendKeys(ConfigReader.getProperty(istenenEmail));
    }
    @Then("Kullanici Password Kutusuna {string} girer")
    public void kullanici_password_kutusuna_girer(String istenenPassword) {
        mycoursedemyPage.signupPasswordBox.sendKeys(ConfigReader.getProperty(istenenPassword));
    }
    @Then("Kullanici Quality Demy Sign Up Butonuna tiklar")
    public void kullanici_quality_demy_sign_up_butonuna_tiklar() {
        mycoursedemyPage.signupButton.click();
    }
    @Then("Kullanici uye hesabi olusturamadigini test eder")
    public void kullanici_uye_hesabi_olusturamadigini_test_eder() {
        Assert.assertTrue(mycoursedemyPage.signupButton.isDisplayed());
        System.out.println(mycoursedemyPage.hataMesaji.getText());
    }

}
