package parallelrun.cucumber.stepdefs;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.BeforeClass;
import org.openqa.selenium.By;

import java.lang.management.ManagementFactory;
import java.net.MalformedURLException;

@Slf4j
public class KayakStepDef extends BaseStepDef {

    @BeforeClass
    public static void beforeClass() {
        log.info("KayakStepDef Started in thread: {} , in JVM: {}", Thread.currentThread().getId(), ManagementFactory.getRuntimeMXBean().getName());
    }

    @Before
    public void before() {
        log.info("Kayak Test Started in thread: {} , in JVM: {}", Thread.currentThread().getId(), ManagementFactory.getRuntimeMXBean().getName());
    }

    @Given("Open Kayak")
    public void openKayak() throws MalformedURLException {
        driver = getRemoteDriver();
        driver.get("https://www.kayak.com/horizon/sem/flights/general");
        log.info("Open Kayak");
    }

    @When("Kayak Search button clicked")
    public void kayakSearchButtonClicked() {
        driver.findElement(By.id("c-XqV-submit")).click();
        log.info("Kayak Search button clicked");

    }

    @Then("Kayak List results")
    public void kayakListResults() {
        log.info("Kayak List results");
    }

    @After
    public final void closeDriver() {
        if (driver != null)
            driver.quit();
        log.info("End of the test");
    }

}
