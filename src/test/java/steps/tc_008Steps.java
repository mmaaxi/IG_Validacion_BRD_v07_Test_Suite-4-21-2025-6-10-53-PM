package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pages.tc_008Page;

public class tc_008Steps {
    WebDriver driver;
    tc_008Page roleAccessPage;
    
    @Given("the user with role {string} logs into the system")
    public void userLogsInWithRole(String role) {
        roleAccessPage = new tc_008Page(driver);
        roleAccessPage.loginWithRole(role);
    }

    @Then("the system shows only functionalities allowed for {string} role")
    public void systemShowsAllowedFunctionalities(String role) {
        Assert.assertTrue(roleAccessPage.verifyAllowedFunctionalities(role), 
                          "Not all functionalities are displayed correctly for role: " + role);
    }

    @When("the user attempts to access a restricted functionality")
    public void userAttemptsRestrictedAccess() {
        roleAccessPage.tryAccessingRestrictedFunctionality();
    }

    @Then("the system denies access and displays an insufficient authorization message")
    public void systemDeniesAccess() {
        Assert.assertTrue(roleAccessPage.isAccessDenied(), 
                          "Access denial message is not displayed as expected.");
    }
}