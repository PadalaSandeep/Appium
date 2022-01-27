package browser.appiumTests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import util.driver.DriverFactory;

import java.net.MalformedURLException;
import java.net.URL;

import static util.PropertyFileReader.getProperty;
import static util.driver.DriverHolder.getDriver;
import static util.driver.DriverHolder.setDriver;

public class BaseTest {

    @BeforeMethod
    public void before() throws MalformedURLException {
        //setDriver(DriverFactory.createChromeAndroidDriver("91.0.4472.19","Pixel_5_API_31_arm64-v8a",new URL("http://127.0.0.1:4723/wd/hub")));
        setDriver(DriverFactory.createAndroidChromeDriver());
        getDriver().get(getProperty("application_url"));
    }

    @AfterMethod
    public void after() {
        if (getDriver() != null) {
            getDriver().quit();
        }
    }
}
