package parallelrun.cucumber.stepdefs;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import parallelrun.constant.ChromeConstant;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

@Slf4j
public abstract class BaseStepDef {


    protected WebDriver driver;

    protected WebDriver getRemoteDriver() throws MalformedURLException {
        System.setProperty(ChromeConstant.CHROME_DRIVER_SYSTEM_PROPERTY, ChromeConstant.CHROME_DRIVER_LOCATION);
        ChromeOptions options = new ChromeOptions();
//        options.setExperimentalOption("useAutomationExtension", false); local chromeda calisirken gerekli olabilir
//        capabilities.setCapability("chromedriver.switches", Collections.singletonList("--disable-extensions"));

        Map<String, Object> prefs = new HashMap<>();
        prefs.put("download.prompt_for_download", true);
        options.setExperimentalOption("prefs", prefs);

        driver = new RemoteWebDriver(new URL(ChromeConstant.CHROME_REMOTE_URL), options);
        driver.manage().window().setPosition(new Point(1920, 0));
        driver.manage().window().maximize();
        log.info("Starting Chrome with window size {}", driver.manage().window().getSize());
//        driver = new ChromeDriver(options);
        return driver;


    }

}
