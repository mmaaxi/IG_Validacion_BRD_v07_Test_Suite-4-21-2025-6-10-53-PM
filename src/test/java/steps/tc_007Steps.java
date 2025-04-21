package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_007Page;

public class tc_007Steps {

    WebDriver driver;
    tc_007Page page;

    @Given("el usuario está en la página de inicio de sesión")
    public void elUsuarioEstaEnLaPaginaDeInicioDeSesion() {
        driver = new ChromeDriver();
        page = new tc_007Page(driver);
        driver.get("http://www.example.com/login");
    }

    @When("el usuario inicia sesión con credenciales válidas")
    public void elUsuarioIniciaSesionConCredencialesValidas() {
        page.login("usuario_valido", "contraseña_valida");
    }

    @Then("el usuario debería acceder al sistema")
    public void elUsuarioDeberiaAccederAlSistema() {
        page.verifyLoginSuccess();
    }

    @When("el usuario deja la sesión inactiva por un tiempo predeterminado")
    public void elUsuarioDejaLaSesionInactivaPorUnTiempoPredeterminado() throws InterruptedException {
        Thread.sleep(600000); // Espera de 10 minutos para simular inactividad
    }

    @Then("el sistema debería cerrar la sesión automáticamente y solicitar nuevo login")
    public void elSistemaDeberiaCerrarLaSesionAutomaticamenteYSolicitarNuevoLogin() {
        page.verifySessionExpired();
        driver.quit();
    }
}