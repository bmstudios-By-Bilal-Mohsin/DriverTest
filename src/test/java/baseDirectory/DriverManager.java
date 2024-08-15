package baseDirectory;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DriverManager {

    protected WebDriver driver;
    protected Properties properties;
    private static final Logger logger = LogManager.getLogger(DriverManager.class);

    @BeforeEach
    public void setUp() {
        loadConfig();
        initializeDriver();
    }

    private void loadConfig() {

        properties = new Properties();

        try (FileInputStream fis = new FileInputStream("src/test/resources/config.properties")) {
            properties.load(fis);
            logger.info("Configuration file loaded");
        }
        catch (IOException e) {
            logger.error("Configuration file not found", e);
        }
    }

    private void initializeDriver() {

        String browser = properties.getProperty("browser");

        if (browser.equalsIgnoreCase("chrome")) {
            driver = new ChromeDriver();
        }

        driver.manage().window().maximize();
        driver.get(properties.getProperty("url"));
        logger.info("Browser initialized and navigated to " + properties.getProperty("url"));
    }

    @AfterEach
    public void tearDown() {

        if (driver != null) {
            driver.quit();
            logger.info("Driver closed successfully");
        }
    }
}
