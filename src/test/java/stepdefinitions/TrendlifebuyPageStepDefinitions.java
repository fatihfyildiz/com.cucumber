package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.TrendlifebuyPage;
import utilities.ConfigReader;
import utilities.Driver;

public class TrendlifebuyPageStepDefinitions {

    TrendlifebuyPage trendlifebuyPage= new TrendlifebuyPage();

    @Given("Open browser go to url {string}")
    public void open_browser_go_to_url(String string) {
        Driver.getDriver().get(ConfigReader.getProperty("AdminUrl"));
    }

    @Then("Admin enters an {string}, a {string} and then clicks sign in link on admin page to login")
    public void admin_enters_an_a_and_then_clicks_sign_in_link_on_admin_page_to_login(String string, String string2) {
        trendlifebuyPage.emailBox.sendKeys(ConfigReader.getProperty("fatihmail"));
        trendlifebuyPage.passwordBox.sendKeys(ConfigReader.getProperty("passwordfatih"));
        trendlifebuyPage.signInLink.click();
    }

    @Then("Admin clicks Wallet Manage link")
    public void admin_clicks_wallet_manage_link() {
        trendlifebuyPage.walletManage.click();
    }

    @Then("Admin clicks Offline Recharge link")
    public void admin_clicks_offline_recharge_link() {
        trendlifebuyPage.offlineRecharge.click();
    }

    @Then("Admin verifies that Offline Recharge List is displayed on the Offline Recharge Page")
    public void admin_verifies_that_offline_recharge_list_is_displayed_on_the_offline_recharge_page() {
        Assert.assertTrue(trendlifebuyPage.offlineRechargeList.isDisplayed());
    }

    @Then("Closes the page")
    public void closes_the_page() {
        Driver.closeDriver();
    }


}
