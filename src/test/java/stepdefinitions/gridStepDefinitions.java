package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.Assert.*;

public class gridStepDefinitions {

    WebDriver driver;

    @Given("get URL")
    public void get_url() throws MalformedURLException {
        driver= new RemoteWebDriver( new URL("http://192.168.88.128:4444"), new ChromeOptions());

        driver.get("https://www.google.com/");

    }
    @Then("Verify title")
    public void verify_title() {

        String title =driver.getTitle();

        assertEquals("Google", title);

    }
    @Then("Verify currentURL")
    public void verify_current_url() {

        String  currentUR = driver.getCurrentUrl();

        assertEquals("https://www.google.com/", currentUR);

    }

    @Given("getURL firefox")
    public void get_url_firefox() throws MalformedURLException {

        driver= new RemoteWebDriver(new URL("http://192.168.88.128:4444"),new FirefoxOptions());

        driver.get("https://www.google.com/");

    }
    @Then("Verify title firefox")
    public void verify_title_firefox() {

        String title =driver.getTitle();

        assertEquals("Google", title);
    }
    @Then("Verify currentURL firefox")
    public void verify_current_url_firefox() {

        String  currentUR = driver.getCurrentUrl();

        assertEquals("https://www.google.com/", currentUR);

    }

}
