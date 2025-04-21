package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_003Page {
    private WebDriver driver;

    private By forgotPasswordLink = By.linkText("Olvidé mi contraseña");
    private By emailField = By.id("email");
    private By submitButton = By.id("submit");
    private By confirmationMessage = By.id("confirmation_message");

    public tc_003Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToLoginPage() {
        driver.get("http://www.example.com/login");
    }

    public void clickForgotPasswordLink() {
        driver.findElement(forgotPasswordLink).click();
    }

    public boolean isOnPasswordRecoveryPage() {
        return driver.getCurrentUrl().contains("recover-password");
    }

    public void enterEmail(String email) {
        WebElement emailElem = driver.findElement(emailField);
        emailElem.clear();
        emailElem.sendKeys(email);
    }

    public boolean isEmailFormatValid() {
        String email = driver.findElement(emailField).getAttribute("value");
        return email.contains("@") && email.contains(".");
    }

    public void clickSubmitButton() {
        driver.findElement(submitButton).click();
    }

    public boolean isConfirmationMessageDisplayed() {
        return driver.findElement(confirmationMessage).isDisplayed();
    }

    public boolean isRecoveryEmailReceived() {
        // Esto sería una lógica simulada para revisar el correo.
        return true;
    }
}