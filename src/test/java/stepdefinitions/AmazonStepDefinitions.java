package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.AmazonPage;
import utilities.ConfigReader;
import utilities.Driver;

public class AmazonStepDefinitions {

    AmazonPage amazonPage= new AmazonPage();

    @Given("Kullanici Amazon ana sayfaya gider")
    public void kullanici_amazon_ana_sayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
    }

    @When("Arama cubuguna Nutella yazip aratir")
    public void arama_cubuguna_nutella_yazip_aratir() {
        amazonPage.searchBox.sendKeys("Nutella" + Keys.ENTER);
    }

    @Then("Arama sonuclarinin Nutella icerdigini test eder")
    public void arama_sonuclarinin_nutella_icerdigini_test_eder() {
        String actualAramaSonucu= amazonPage.searchResultElement.getText();
        String expectedKelime= "Nutella";
        Assert.assertTrue(actualAramaSonucu.contains(expectedKelime));
    }

    @Then("Sonra da sayfayi kapatir")
    public void sonra_da_sayfayi_kapatir() {
        Driver.closeDriver();
    }


    @Then("Arama kutusuna Java yazip aratir")
    public void aramaKutusunaJavaYazipAratir() { amazonPage.searchBox.sendKeys("Java" + Keys.ENTER); }

    @And("Arama sonuclarinin Java icerdigini test eder")
    public void aramaSonuclarininJavaIcerdiginiTestEder() {
        String actualAramaSonucu= amazonPage.searchResultElement.getText();
        String expectedKelime= "Java";
        Assert.assertTrue(actualAramaSonucu.contains(expectedKelime));
    }

    @Then("Arama kutusuna Apple yazip aratir")
    public void aramaKutusunaAppleYazipAratir() {
        amazonPage.searchBox.sendKeys("Apple" + Keys.ENTER); }

    @And("Sonuclarin Apple icerdigini test eder")
    public void sonuclarinAppleIcerdiginiTestEder() {
        String actualAramaSonucu= amazonPage.searchResultElement.getText();
        String expectedKelime= "Apple";
        Assert.assertTrue(actualAramaSonucu.contains(expectedKelime));
    }

    @Then("Arama cubuguna {string} yazip aratir")
    public void aramaCubugunaYazipAratir(String istenenKelime) {
        amazonPage.searchBox.sendKeys(istenenKelime + Keys.ENTER);
    }

    @And("Arama sonuclarinin {string} icerdigini test eder")
    public void aramaSonuclarininIcerdiginiTestEder(String istenenKelime) {
        String actualAramaSonucu= amazonPage.searchResultElement.getText();
        Assert.assertTrue(actualAramaSonucu.contains(istenenKelime));
    }

    @Given("Kullanici {string} ana sayfaya gider")
    public void kullaniciAnaSayfayaGider(String istenenUrl) {
        Driver.getDriver().get(ConfigReader.getProperty(istenenUrl));
    }

    @Then("url'in {string} icerdigini test eder")
    public void urlInIcerdiginiTestEder(String istenenKelime) {
        String actualUrl= Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(istenenKelime));
    }


}
