package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class tc_006Page {
    WebDriver driver;

    @FindBy(id = "inputField")
    WebElement inputField;

    @FindBy(id = "errorMessage")
    WebElement errorMessage;

    public tc_006Page(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void navigateToFormPage() {
        driver.get("https://example.com/form");
    }

    public void enterDataInField(String data) {
        inputField.clear();
        inputField.sendKeys(data);
    }

    public boolean isErrorMessageDisplayed(String expectedMessage) {
        return errorMessage.isDisplayed() && errorMessage.getText().equals(expectedMessage);
    }
}