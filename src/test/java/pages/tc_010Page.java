package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class tc_010Page {

    WebDriver driver;

    By numberField = By.id("number_field");
    By errorInvalidInput = By.id("error_invalid_input");

    public tc_010Page(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToFormPage() {
        driver.get("https://example.com/form");
    }

    public void enterTextInNumberField(String text) {
        WebElement field = driver.findElement(numberField);
        field.clear();
        field.sendKeys(text);
    }

    public boolean isNumberFieldErrorDisplayed() {
        return driver.findElement(errorInvalidInput).isDisplayed();
    }

    public boolean isInvalidInputErrorDisplayed() {
        return driver.findElement(errorInvalidInput).isDisplayed();
    }
}