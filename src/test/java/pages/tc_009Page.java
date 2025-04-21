import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_009Page {
    private WebDriver driver;

    private By usernameField = By.id("username");
    private By passwordField = By.id("password");
    private By loginButton = By.id("loginButton");
    private By secondFactorPrompt = By.id("secondFactorPrompt");
    private By secondFactorCodeField = By.id("secondFactorCode");
    private By secondFactorSubmitButton = By.id("submitSecondFactor");
    private By userAuthenticatedLabel = By.id("userAuthenticated");

    public tc_009Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToLoginPage() {
        driver.get("http://example.com/login");
    }

    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void submitLogin() {
        driver.findElement(loginButton).click();
    }

    public boolean isSecondFactorPromptDisplayed() {
        return driver.findElement(secondFactorPrompt).isDisplayed();
    }

    public void enterSecondFactorCode(String code) {
        driver.findElement(secondFactorCodeField).sendKeys(code);
    }

    public void submitSecondFactor() {
        driver.findElement(secondFactorSubmitButton).click();
    }

    public boolean isUserAuthenticated() {
        return driver.findElement(userAuthenticatedLabel).isDisplayed();
    }
}