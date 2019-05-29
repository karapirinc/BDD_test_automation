package parallelrun.cucumber.stepdefs;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.junit.BeforeClass;
import org.openqa.selenium.By;

import java.lang.management.ManagementFactory;
import java.net.MalformedURLException;

@Slf4j
public class SkyScannerStepDef extends BaseStepDef {


    @BeforeClass
    public static void beforeClass() {
        log.info("SkyScannerStepDef Started in thread: {} , in JVM: {}", Thread.currentThread().getId(), ManagementFactory.getRuntimeMXBean().getName());
    }

    @Before
    public void before() {
        log.info("SkyScanner Test Started in thread: {} , in JVM: {}", Thread.currentThread().getId(), ManagementFactory.getRuntimeMXBean().getName());
    }

    @Given("^SkyScanner Default inputs$")
    public void skyScannerDefaultInputs() throws MalformedURLException {
        driver = getRemoteDriver();
        driver.get("https://www.skyscanner.net");
        log.info("skyScannerDefaultInputs");
    }

    @When("^SkyScanner Search button clicked$")
    public void skyScannerSearchButtonClicked() {
        driver.findElement(By.xpath("//*[@id=\"flights-search-controls-root\"]/div/div/form/div[3]/button")).click();
        log.info("SkyScanner Flight Search button clicked");
    }

    @Then("^SkyScanner List results$")
    public void skyScannerListResults() {
        log.info("SkyScanner Flight Search button clicked");
    }

    @After
    public final void closeDriver() {
        if (driver != null)
            driver.quit();
        log.info("End of the test");
    }

}
