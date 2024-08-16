import baseDirectory.DriverManager;

import methods.HomePageMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class HomeClassTest extends DriverManager {

    HomePageMethod homePage;

    @BeforeClass(alwaysRun = true)
    public void setup() {

        super.setUp();
        homePage = new HomePageMethod(driver);
    }

    @Test
    public void testLogin() {

        homePage.enterSearch("What is Selenium");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {

        super.tearDown();
    }
}
