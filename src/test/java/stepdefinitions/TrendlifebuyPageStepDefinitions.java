package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pages.TrendlifebuyPage;

public class TrendlifebuyPageStepDefinitions {

    TrendlifebuyPage trendlifebuyPage= new TrendlifebuyPage();

    @Given("Open browser go to url {string}")
    public void open_browser_go_to_url(String string) {

    }
    @Then("Admin enters an {string}, a {string} and then clicks sign in link on admin page to login")
    public void admin_enters_an_a_and_then_clicks_sign_in_link_on_admin_page_to_login(String string, String string2) {

    }
    @Then("Admin clicks Wallet Manage link")
    public void admin_clicks_wallet_manage_link() {

    }
    @Then("Admin clicks Offline Recharge link")
    public void admin_clicks_offline_recharge_link() {

    }
    @Then("Admin verifies that Offline Recharge List is displayed on the Offline Recharge Page")
    public void admin_verifies_that_offline_recharge_list_is_displayed_on_the_offline_recharge_page() {

    }
    @Then("Closes the page")
    public void closes_the_page() {

    }


}
