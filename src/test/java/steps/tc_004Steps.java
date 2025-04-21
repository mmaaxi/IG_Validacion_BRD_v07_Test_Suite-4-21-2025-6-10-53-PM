package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_004Page;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class tc_004Steps {

    private WebDriver driver = new ChromeDriver();
    private tc_004Page loginPage = new tc_004Page(driver);

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        loginPage.openLoginPage();
    }

    @When("the user enters invalid credentials three times")
    public void the_user_enters_invalid_credentials_three_times() {
        for (int i = 0; i < 3; i++) {
            loginPage.enterInvalidCredentials();
            loginPage.submitLogin();
        }
    }

    @Then("the system records three failed attempts")
    public void the_system_records_three_failed_attempts() {
        Assert.assertEquals(3, loginPage.getFailedAttemptCount());
    }

    @When("the user tries to login again")
    public void the_user_tries_to_login_again() {
        loginPage.submitLogin();
    }

    @Then("the system temporarily locks the account and displays a lockout message")
    public void the_system_temporarily_locks_the_account_and_displays_a_lockout_message() {
        Assert.assertTrue(loginPage.isAccountLocked());
        Assert.assertTrue(loginPage.isLockoutMessageDisplayed());
    }
}