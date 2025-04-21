package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_001Page;

public class tc_001Steps {

    WebDriver driver = new ChromeDriver();
    tc_001Page loginPage = new tc_001Page(driver);

    @Given("El usuario está en la página de inicio de sesión")
    public void usuarioEnPaginaDeInicioDeSesion() {
        driver.get("http://url_de_la_aplicacion/login");
    }

    @When("El usuario ingresa un nombre de usuario válido")
    public void ingresarUsuarioValido() {
        loginPage.ingresarNombreUsuario("usuario_valido");
    }

    @When("El usuario ingresa una contraseña válida")
    public void ingresarContraseñaValida() {
        loginPage.ingresarContraseña("contraseña_valida");
    }

    @When("El usuario hace clic en el botón 'Iniciar sesión'")
    public void clicEnIniciarSesion() {
        loginPage.hacerClicEnIniciarSesion();
    }

    @Then("El usuario es redirigido a la página principal")
    public void usuarioRedirigidoAPaginaPrincipal() {
        assertTrue(loginPage.esPaginaPrincipalDesplegada());
        driver.quit();
    }
}