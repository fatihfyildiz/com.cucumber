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
        trendlifebuyPage.passwordBox.sendKeys(ConfigReader.getProperty("password"));
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

    @Then("Admin verifies that transactions are listed according to SL information in the Offline Recharge List")
    public void admin_verifies_that_transactions_are_listed_according_to_sl_information_in_the_offline_recharge_list() {
        Assert.assertTrue(trendlifebuyPage.informationSL.isDisplayed());
    }

    @Then("Admin verifies that transactions are listed according to Date information in the Offline Recharge List")
    public void admin_verifies_that_transactions_are_listed_according_to_date_information_in_the_offline_recharge_list() {
        Assert.assertTrue(trendlifebuyPage.informationDate.isDisplayed());
    }

    @Then("Admin verifies that transactions are listed according to Email information in the Offline Recharge List")
    public void admin_verifies_that_transactions_are_listed_according_to_email_information_in_the_offline_recharge_list() {
        Assert.assertTrue(trendlifebuyPage.informationEmail.isDisplayed());
    }

    @Then("Admin verifies that transactions are listed according to TXN ID information in the Offline Recharge List")
    public void admin_verifies_that_transactions_are_listed_according_to_txn_id_information_in_the_offline_recharge_list() {
        Assert.assertTrue(trendlifebuyPage.informationTxnId.isDisplayed());
    }

    @Then("Admin verifies that transactions are listed according to Amount information in the Offline Recharge List")
    public void admin_verifies_that_transactions_are_listed_according_to_amount_information_in_the_offline_recharge_list() {
        Assert.assertTrue(trendlifebuyPage.informationAmount.isDisplayed());
    }

    @Then("Admin verifies that transactions are listed according to Type information in the Offline Recharge List")
    public void admin_verifies_that_transactions_are_listed_according_to_type_information_in_the_offline_recharge_list() {
        Assert.assertTrue(trendlifebuyPage.informationType.isDisplayed());
    }

    @Then("Admin verifies that transactions are listed according to Payment Method information in the Offline Recharge List")
    public void admin_verifies_that_transactions_are_listed_according_to_payment_method_information_in_the_offline_recharge_list() {
        Assert.assertTrue(trendlifebuyPage.informationPaymentMethod.isDisplayed());
    }

    @Then("Admin verifies that transactions are listed according to Approval information in the Offline Recharge List")
    public void admin_verifies_that_transactions_are_listed_according_to_approval_information_in_the_offline_recharge_list() {
        Assert.assertTrue(trendlifebuyPage.informationApproval.isDisplayed());
    }

    @Then("Admin verifies that transactions are listed according to Action information in the Offline Recharge List")
    public void admin_verifies_that_transactions_are_listed_according_to_action_information_in_the_offline_recharge_list() {
        Assert.assertTrue(trendlifebuyPage.informationAction.isDisplayed());
    }


}
