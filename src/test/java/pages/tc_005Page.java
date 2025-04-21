package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_005Page {

    WebDriver driver;

    // Selectores
    By logoutButton = By.id("logoutButton");
    By loginPageLocator = By.id("loginPage");
    By homePageLocator = By.id("homePage");

    public tc_005Page(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String username, String password) {
        // Lógica de inicio de sesión
    }

    public void clickLogoutButton() {
        driver.findElement(logoutButton).click();
    }

    public void verifyRedirectToHomePage() {
        assert driver.findElement(homePageLocator).isDisplayed();
    }

    public void tryAccessProtectedPage() {
        // Lógica para acceder a una página protegida
    }

    public void verifyRedirectToLoginPage() {
        assert driver.findElement(loginPageLocator).isDisplayed();
    }
}