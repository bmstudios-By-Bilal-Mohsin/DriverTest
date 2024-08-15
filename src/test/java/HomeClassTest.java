import baseDirectory.DriverManager;

import methods.HomePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeClassTest extends DriverManager {

    @BeforeClass(alwaysRun = true)
    public void setup() {

        super.setUp();
    }

    @Test
    public void testLogin() {

        HomePage homePage = new HomePage(driver);
        homePage.enterSearch("What is Selenium");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {

        super.tearDown();
    }
}
