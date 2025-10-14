package base;

import io.appium.java_client.AppiumDriver;
import lombok.SneakyThrows;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.net.URL;

public class BaseMobileTest {

    protected AppiumDriver driver;

    @SneakyThrows
    @BeforeTest
    public void setUp() {
        PropertiesConfiguration config = new PropertiesConfiguration("src/test/resources/config.properties");
        String device = config.getString("deviceName");
        String platform = config.getString(("platformName"));
        String appActivity = config.getString("appActivity");
        String appPackage = config.getString("appPackage");
        String appPath = config.getString("appPath");

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("platformName", platform);
//        caps.setCapability("appium:deviceName", device);
        caps.setCapability("appium:appActivity", appActivity);
        caps.setCapability("appium:appPackage", appPackage);
        caps.setCapability("appium:automationName", "UiAutomator2");

        driver = new AppiumDriver(new URL("http://127.0.0.1:4723/"), caps);
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}