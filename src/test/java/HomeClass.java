import baseDirectory.DriverManager;

import methods.HomePage;
import org.junit.jupiter.api.Test;

public class HomeClass extends DriverManager {

    @Test
    public void testLogin() {

        HomePage homePage = new HomePage(driver);

        homePage.enterSearch("testuser");
    }
}
