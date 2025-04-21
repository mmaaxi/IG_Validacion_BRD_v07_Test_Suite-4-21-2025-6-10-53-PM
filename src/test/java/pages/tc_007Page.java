package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_007Page {

    WebDriver driver;

    By usernameField = By.id("username");
    By passwordField = By.id("password");
    By loginButton = By.id("loginButton");
    By logoutMessage = By.id("logoutMessage");
    
    public tc_007Page(WebDriver driver) {
        this.driver = driver;
    }

    public void login(String username, String password) {
        driver.findElement(usernameField).sendKeys(username);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(loginButton).click();
    }

    public void verifyLoginSuccess() {
        // Lógica para verificar que el usuario ha iniciado sesión correctamente
        // Ejemplo: assert que verifica la presencia de un elemento del dashboard
    }

    public void verifySessionExpired() {
        // Lógica para comprobar que la sesión ha expirado y se solicita login nuevamente
        // Ejemplo: assert que verifica la visibilidad del mensaje de cerrar sesión
    }
}