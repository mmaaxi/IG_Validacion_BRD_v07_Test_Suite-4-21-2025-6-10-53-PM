package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class tc_008Page {
    WebDriver driver;

    public tc_008Page(WebDriver driver) {
        this.driver = driver;
    }

    public void loginWithRole(String role) {
        // Implement login using role details
    }

    public boolean verifyAllowedFunctionalities(String role) {
        // Validate displayed functionalities against expected for the role
        return true; // Implement actual check
    }

    public void tryAccessingRestrictedFunctionality() {
        // Attempt to access functionality not allowed for the role
    }

    public boolean isAccessDenied() {
        // Verify if access denial message is displayed
        By deniedMessage = By.id("accessDeniedMessage");
        return driver.findElement(deniedMessage).isDisplayed();
    }
}