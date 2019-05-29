package parallelrun.cucumber.stepdefs;

import parallelrun.constants.ChromeConstant;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

@Slf4j
public abstract class BaseStepDef {


    protected WebDriver driver;

    protected WebDriver getRemoteDriver() throws MalformedURLException {
        System.setProperty(ChromeConstant.CHROME_DRIVER_SYSTEM_PROPERTY, ChromeConstant.CHROME_DRIVER_LOCATION);
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("useAutomationExtension", false);
//        capabilities.setCapability("chromedriver.switches", Collections.singletonList("--disable-extensions"));
        driver = new RemoteWebDriver(new URL(ChromeConstant.CHROME_REMOTE_URL), options);
//        driver = new ChromeDriver(options);
        log.info("Connected to grid at url {}", ChromeConstant.CHROME_REMOTE_URL);
        return driver;


    }

}
