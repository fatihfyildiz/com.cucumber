package stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.MycoursedemyPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class QualityDemyStepDefinitions {
    MycoursedemyPage mycoursedemyPage=new MycoursedemyPage();

    @Given("Kullanici quality demy sayfasina gider")
    public void kullanici_quality_demy_sayfasina_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
    }
    @When("Email ve password bilgilerini girerek giris yapar")
    public void email_ve_password_bilgilerini_girerek_giris_yapar() {
        ReusableMethods.waitFor(2);
        mycoursedemyPage.acceptCookies2.click();
        ReusableMethods.waitFor(2);
        mycoursedemyPage.loginLink.click();
        mycoursedemyPage.emailBox.sendKeys(ConfigReader.getProperty("myGecerliEmailInsBora"));
        mycoursedemyPage.passwordBox.sendKeys(ConfigReader.getProperty("myGecerliPasswordInsBora"));
        mycoursedemyPage.loginButton.click();
    }
    @Then("Basarili bir sekilde giris yaptigini test eder")
    public void basarili_bir_sekilde_giris_yaptigini_test_eder() {
        Assert.assertTrue(mycoursedemyPage.demyPicture.isDisplayed());
    }
    @And("Sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.closeDriver();

    }

    // step definitions for US0030 Requirements Adding Test is below
    @Given("Launch browser Go to url")
    public void launch_browser_go_to_url() {
        Driver.getDriver().get(ConfigReader.getProperty("myUrl"));
    }

    @Then("Click on Login button")
    public void click_on_login_button() {
        mycoursedemyPage.loginButonu.click();
    }

    @Then("Enter correct instructor email address and password")
    public void enter_correct_instructor_email_address_and_password() {
        mycoursedemyPage.emailBox.sendKeys(ConfigReader.getProperty("myValidEmail"));
        mycoursedemyPage.passwordBox.sendKeys(ConfigReader.getProperty("myValidPassword"));
        mycoursedemyPage.loginButton.click();
    }
    @Then("Click on the Instructor button")
    public void click_on_the_ınstructor_button() {
        mycoursedemyPage.instructorLink.click();
    }
    @Then("Click on Course Manager from the menu under Navigation")
    public void click_on_course_manager_from_the_menu_under_navigation() {
        mycoursedemyPage.courseManagerButton.click();
    }

    @Then("Click on Add New Course in the upper right corner of the page")
    public void click_on_add_new_course_in_the_upper_right_corner_of_the_page() {
        mycoursedemyPage.add_newcourse.click();
    }

    @Then("Click Requirements from the row under the Course Add Form")
    public void click_requirements_from_the_row_under_the_course_add_form() {
        mycoursedemyPage.requirementsButton.click();
    }

    @Then("Add a box by pressing the green + button.")
    public void add_a_box_by_pressing_the_green_button() {
        mycoursedemyPage.requirementsGreenPlusButton.click();
        Assert.assertTrue(mycoursedemyPage.requirementsRedMinusButton.isDisplayed());
    }

    @Then("Log out by closing the page")
    public void log_out_by_closing_the_page() {
        Driver.closeDriver();
    }


}