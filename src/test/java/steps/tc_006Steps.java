package steps;

import pages.tc_006Page;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.*;

public class tc_006Steps {
    tc_006Page page = new tc_006Page();

    @Given("el usuario está en la página del formulario")
    public void elUsuarioEstaEnLaPaginaDelFormulario() {
        page.navigateToFormPage();
    }

    @When("el usuario ingresa datos insuficientes en el campo")
    public void elUsuarioIngresaDatosInsuficientesEnElCampo() {
        page.enterDataInField("abc");
    }

    @Then("el sistema muestra un mensaje de error por datos insuficientes")
    public void elSistemaMuestraUnMensajeDeErrorPorDatosInsuficientes() {
        assertTrue(page.isErrorMessageDisplayed("Datos insuficientes"));
    }

    @When("el usuario ingresa datos que exceden el límite en el campo")
    public void elUsuarioIngresaDatosQueExcedenElLímiteEnElCampo() {
        page.enterDataInField("abcdefghijklmno");
    }

    @Then("el sistema rechaza la entrada y notifica al usuario sobre el exceso de caracteres")
    public void elSistemaRechazaLaEntradaYNotificaAlUsuarioSobreElExcesoDeCaracteres() {
        assertTrue(page.isErrorMessageDisplayed("Exceso de caracteres"));
    }
}