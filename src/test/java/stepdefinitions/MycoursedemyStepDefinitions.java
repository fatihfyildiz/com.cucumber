package stepdefinitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.MycoursedemyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class MycoursedemyStepDefinitions {

    MycoursedemyPage mycoursedemyPage= new MycoursedemyPage();

    @Then("mycoursedemy anasayfa login linkine tiklar")
    public void mycoursedemy_anasayfa_login_linkine_tiklar() {
        mycoursedemyPage.loginLinki.click();
    }

    @Then("mycoursedemy kullanici adi olarak {string} girer")
    public void mycoursedemy_kullanici_adi_olarak_girer(String verilenEmail) {
        mycoursedemyPage.emailKutusu.sendKeys(ConfigReader.getProperty(verilenEmail));
    }

    @Then("mycoursedemy password olarak {string} girer")
    public void mycoursedemy_password_olarak_gireer(String verilenPassword) {
        mycoursedemyPage.passwordKutusu.sendKeys(ConfigReader.getProperty(verilenPassword));
    }

    @Then("mycoursedemy login butonuna basar")
    public void mycoursedemy_login_butonuna_basar() {
        mycoursedemyPage.loginButonu.click();
    }

    @Then("mycoursedemy giris yapabildigini test eder")
    public void mycoursedemy_giris_yapabildigini_test_eder() {
        Assert.assertTrue(mycoursedemyPage.myCoursesLink.isDisplayed());
    }

    @Then("mycoursedemy giris yapilamadigini test eder")
    public void mycoursedemyGirisYapilamadiginiTestEder() {
        Assert.assertTrue(mycoursedemyPage.loginLinki.isDisplayed());
    }

    @Then("mycoursedemy cookies butonuna basar")
    public void mycoursedemy_cookies_butonuna_basar (){

        mycoursedemyPage.acceptCookies.click();
    }

    /*
    @Then("Click on Add New Course in the upper right corner of the page")
    public void clickOnAddNewCourseInTheUpperRightCornerOfThePage() {
        mycoursedemyPage.add_newcourse.click();
    }
     */


}
