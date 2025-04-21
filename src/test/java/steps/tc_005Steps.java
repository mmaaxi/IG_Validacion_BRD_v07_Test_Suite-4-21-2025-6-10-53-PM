package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_005Page;

public class tc_005Steps {

    WebDriver driver;
    tc_005Page page;

    @Given("que el usuario ha iniciado sesión con credenciales válidas")
    public void usuarioHaIniciadoSesion() {
        page = PageFactory.initElements(driver, tc_005Page.class);
        page.login("usuario_valido", "contrasena_valida");
    }

    @When("el usuario hace clic en el botón 'Cerrar sesión'")
    public void usuarioHaceClicEnCerrarSesion() {
        page.clickLogoutButton();
    }

    @Then("el usuario es redirigido a la página de inicio")
    public void usuarioEsRedirigidoAPaginaInicio() {
        page.verifyRedirectToHomePage();
    }

    @When("el usuario intenta acceder a una página protegida")
    public void usuarioIntentaAccederPaginaProtegida() {
        page.tryAccessProtectedPage();
    }

    @Then("el sistema redirige al usuario a la página de inicio de sesión")
    public void sistemaRedirigeAPaginaLogin() {
        page.verifyRedirectToLoginPage();
    }
}