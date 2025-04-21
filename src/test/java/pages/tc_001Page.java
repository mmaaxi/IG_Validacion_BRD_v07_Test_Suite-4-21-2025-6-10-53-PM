package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_001Page {

    WebDriver driver;

    By campoNombreUsuario = By.id("campoUsuario");
    By campoContrasena = By.id("campoContrasena");
    By botonIniciarSesion = By.id("botonIniciarSesion");
    By paginaPrincipal = By.id("paginaPrincipal");

    public tc_001Page(WebDriver driver) {
        this.driver = driver;
    }

    public void ingresarNombreUsuario(String usuario) {
        driver.findElement(campoNombreUsuario).sendKeys(usuario);
    }

    public void ingresarContraseña(String contrasena) {
        driver.findElement(campoContrasena).sendKeys(contrasena);
    }

    public void hacerClicEnIniciarSesion() {
        driver.findElement(botonIniciarSesion).click();
    }

    public boolean esPaginaPrincipalDesplegada() {
        return driver.findElement(paginaPrincipal).isDisplayed();
    }
}