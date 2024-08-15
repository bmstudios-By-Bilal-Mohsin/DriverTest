package methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private final WebDriver driver;

    private final By searchField = By.id("APjFqb");

    public HomePage(WebDriver driver) {

        this.driver = driver;
    }

    public void enterSearch(String username) {
        driver.findElement(searchField).sendKeys(username);
    }
}
