package methods;

import Body.HomeBody;
import org.openqa.selenium.WebDriver;

public class HomePageMethod {

    private final HomeBody homeBody;

    public HomePageMethod(WebDriver driver) {

        this.homeBody = new HomeBody(driver);
    }

    public void enterSearch(String text) {

        homeBody.searchField.sendKeys(text);
    }
}
