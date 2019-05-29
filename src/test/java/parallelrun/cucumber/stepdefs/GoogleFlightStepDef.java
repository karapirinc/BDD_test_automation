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
public class GoogleFlightStepDef extends BaseStepDef {


    @BeforeClass
    public static void beforeClass() {
        log.info("GoogleFlightStepDef Started in thread: {} , in JVM: {}", Thread.currentThread().getId(), ManagementFactory.getRuntimeMXBean().getName());
    }

    @Before
    public void before() {
        log.info("Google Test Started in thread: {} , in JVM: {}", Thread.currentThread().getId(), ManagementFactory.getRuntimeMXBean().getName());
    }


    @Given("^Open Google Flight$")
    public void openGoogleFlight() throws MalformedURLException {
        driver = getRemoteDriver();
        driver.get("https://www.google.com/flights");
        log.info("Opended google flight main page");
    }

    @When("^Search Google Flights$")
    public void googleFlightListResults() throws InterruptedException {
        driver.findElement(By.className("gws-flights-form__search-button")).click();
        log.info("Google googleFlightListResults");

    }

    @Then("^List Google Flight results$")
    public void flightResultsShouldBeListed() throws InterruptedException {
        log.info("Flight results should be listed");
    }

    @After
    public final void closeDriver() {
        if (driver != null)
            driver.quit();
        log.info("End of the test");
    }

}
