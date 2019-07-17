package stepdefs.steps;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import spring.constant.ChromeConstant;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;

@Slf4j
public abstract class BaseStepDefs {


    protected WebDriver driver;

//    protected WebDriver getRemoteDriver() throws MalformedURLException {
//        System.setProperty(ChromeConstant.CHROME_DRIVER_SYSTEM_PROPERTY, ChromeConstant.CHROME_DRIVER_LOCATION);
//        ChromeOptions options = new ChromeOptions();
//
//        Map<String, Object> prefs = new HashMap<>();
//        prefs.put("download.prompt_for_download", true);
//        options.setExperimentalOption("prefs", prefs);
//
//        driver = new RemoteWebDriver(new URL(ChromeConstant.CHROME_REMOTE_URL), options);
//        driver.manage().window().setPosition(new Point(1920, 0));
//        driver.manage().window().maximize();
//        log.info("Starting Chrome with window size {}", driver.manage().window().getSize());
//        return driver;
//
//    }

    protected   WebDriver getRemoteDriver() {
        System.setProperty(ChromeConstant.CHROME_DRIVER_SYSTEM_PROPERTY, ChromeConstant.CHROME_DRIVER_LOCATION);

        String remoteUrl = ChromeConstant.CHROME_REMOTE_URL;
        DesiredCapabilities capabilities;
        capabilities = DesiredCapabilities.chrome();
        capabilities.setBrowserName("chrome");
        capabilities.setCapability("chromedriver.switches", Collections.singletonList("--disable-extensions"));
        RemoteWebDriver driver = null;
        try {
            driver = new RemoteWebDriver(new URL(remoteUrl), capabilities);
            log.info("Connected to grid at url {}", remoteUrl);
            driver.manage().window().setSize(new Dimension(2400, 1400));
            log.info("Starting Chrome with window size {}.", driver.manage().window().getSize());
        } catch (MalformedURLException e) {
            log.error("Cannot connect to url {}", remoteUrl);
        }
        return driver;
    }

}
