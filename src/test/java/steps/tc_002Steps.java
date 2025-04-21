package steps;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.tc_002Page;

public class tc_002Steps {
    WebDriver driver;
    tc_002Page loginPage;

    @Given("el usuario está en la página de inicio de sesión")
    public void el_usuario_está_en_la_página_de_inicio_de_sesión() {
        driver = new ChromeDriver();
        driver.get("http://www.ejemplo.com/login");
        loginPage = new tc_002Page(driver);
    }

    @When("el usuario ingresa un nombre de usuario inválido")
    public void el_usuario_ingresa_un_nombre_de_usuario_inválido() {
        loginPage.enterUsername("usuario_inválido");
    }

    @And("el usuario ingresa una contraseña incorrecta")
    public void el_usuario_ingresa_una_contraseña_incorrecta() {
        loginPage.enterPassword("contraseña_incorrecta");
    }

    @And("el usuario hace clic en el botón 'Iniciar sesión'")
    public void el_usuario_hace_clic_en_el_boton_Iniciar_sesión() {
        loginPage.clickLoginButton();
    }

    @Then("el sistema muestra un mensaje de error indicando 'Credenciales incorrectas'")
    public void el_sistema_muestra_un_mensaje_de_error_indicando_Credenciales_incorrectas() {
        loginPage.verifyErrorMessage();
        driver.quit();
    }
}