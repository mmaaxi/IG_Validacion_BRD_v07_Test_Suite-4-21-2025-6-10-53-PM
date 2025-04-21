package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import pages.tc_003Page;

import static org.junit.Assert.*;

public class tc_003Steps {
    private WebDriver driver;
    private WebDriverWait wait;
    private tc_003Page page;

    @Given("Estoy en la página de inicio de sesión")
    public void estoy_en_la_página_de_inicio_de_sesión() {
        page = new tc_003Page(driver);
        page.navigateToLoginPage();
    }

    @When("hago clic en \"Olvidé mi contraseña\"")
    public void hago_clic_en_olvidé_mi_contraseña() {
        page.clickForgotPasswordLink();
    }

    @Then("debería ser redirigido a la página de recuperación de contraseña")
    public void debería_ser_redirigido_a_la_página_de_recuperación_de_contraseña() {
        assertTrue(page.isOnPasswordRecoveryPage());
    }

    @When("ingreso un correo electrónico registrado {string}")
    public void ingreso_un_correo_electrónico_registrado(String email) {
        page.enterEmail(email);
    }

    @Then("el sistema debería aceptar la entrada y validar el formato del correo")
    public void el_sistema_debería_aceptar_la_entrada_y_validar_el_formato_del_correo() {
        assertTrue(page.isEmailFormatValid());
    }

    @When("hago clic en el botón \"Enviar\"")
    public void hago_clic_en_el_botón_enviar() {
        page.clickSubmitButton();
    }

    @Then("el sistema debería enviar un correo de recuperación y mostrar un mensaje de confirmación")
    public void el_sistema_debería_enviar_un_correo_de_recuperación_y_mostrar_un_mensaje_de_confirmación() {
        assertTrue(page.isConfirmationMessageDisplayed());
    }

    @When("reviso la bandeja de entrada del correo electrónico")
    public void reviso_la_bandeja_de_entrada_del_correo_electrónico() {
        // Este paso supondrá que el correo está siendo verificado por alguna herramienta de testeo de correos como Mailosaur.
    }

    @Then("debería recibir un correo con instrucciones para recuperar la contraseña")
    public void debería_recibir_un_correo_con_instrucciones_para_recuperar_la_contraseña() {
        assertTrue(page.isRecoveryEmailReceived());
    }
}