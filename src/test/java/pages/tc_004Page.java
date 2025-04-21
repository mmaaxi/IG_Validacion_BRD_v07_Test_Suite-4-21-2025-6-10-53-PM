package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_004Page {

    private WebDriver driver;

    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.id("login-button");
    private By lockoutMessage = By.id("lockout-message");

    public tc_004Page(WebDriver driver) {
        this.driver = driver;
    }

    public void openLoginPage() {
        driver.navigate().to("https://example.com/login");
    }

    public void enterInvalidCredentials() {
        driver.findElement(usernameField).sendKeys("invalidUser");
        driver.findElement(passwordField).sendKeys("invalidPass");
    }

    public void submitLogin() {
        driver.findElement(loginButton).click();
    }

    public int getFailedAttemptCount() {
        // This method would contain logic to retrieve the number of failed login attempts from system logs or display.
        return 3; // Placeholder return value
    }

    public boolean isAccountLocked() {
        // This method would check if the account is locked by verifying an element or system log.
        return true; // Placeholder return value
    }

    public boolean isLockoutMessageDisplayed() {
        return driver.findElement(lockoutMessage).isDisplayed();
    }
}