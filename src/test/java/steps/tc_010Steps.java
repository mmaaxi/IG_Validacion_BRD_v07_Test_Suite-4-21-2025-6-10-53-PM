package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.tc_010Page;
import org.junit.Assert;

public class tc_010Steps {

    WebDriver driver;
    tc_010Page page = PageFactory.initElements(driver, tc_010Page.class);

    @Given("^el usuario está en la página del formulario$")
    public void el_usuario_está_en_la_página_del_formulario() {
        page.navigateToFormPage();
    }

    @When("^el usuario ingresa \"([^\"]*)\" en el campo \"Número\"$")
    public void el_usuario_ingresa_caracteres_en_el_campo_número(String input) {
        page.enterTextInNumberField(input);
    }

    @Then("^el campo \"Número\" debe rechazar la entrada y mostrar el mensaje de error \"Entrada inválida\"$")
    public void el_campo_número_debe_rechazar_la_entrada_y_mostrar_mensaje_de_error() {
        Assert.assertTrue(page.isNumberFieldErrorDisplayed());
    }

    @Then("^el sistema debe mostrar un mensaje de error indicando que la entrada es inválida$")
    public void el_sistema_debe_mostrar_un_mensaje_de_error() {
        Assert.assertTrue(page.isInvalidInputErrorDisplayed());
    }
}