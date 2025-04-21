import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.tc_009Page;

public class tc_009Steps {
    private tc_009Page mfaPage = new tc_009Page();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        mfaPage.navigateToLoginPage();
    }

    @When("the user logs in with valid credentials")
    public void the_user_logs_in_with_valid_credentials() {
        mfaPage.enterUsername("validUser");
        mfaPage.enterPassword("validPassword");
        mfaPage.submitLogin();
    }

    @Then("the system requests a second factor of authentication")
    public void the_system_requests_a_second_factor_of_authentication() {
        Assert.assertTrue(mfaPage.isSecondFactorPromptDisplayed());
    }

    @When("the user enters the code received in the second factor")
    public void the_user_enters_the_code_received_in_the_second_factor() {
        mfaPage.enterSecondFactorCode("123456");
        mfaPage.submitSecondFactor();
    }

    @Then("the system authenticates the user and allows access")
    public void the_system_authenticates_the_user_and_allows_access() {
        Assert.assertTrue(mfaPage.isUserAuthenticated());
    }
}