package parallel;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lombok.extern.slf4j.Slf4j;

import java.net.MalformedURLException;

@Slf4j
public class KayakStepDefs extends BaseStepDefs {



    @Given("Open Kayak")
    public void openKayak() throws MalformedURLException {
        driver = getRemoteDriver();
        driver.navigate().to("https://www.kayak.com/horizon/sem/flights/general");
        log.info("Open Kayak");
    }

    @When("Kayak Search button clicked")
    public void kayakSearchButtonClicked() {
//        driver.findElement(By.id("c-XqV-submit")).click();
        log.info("Kayak Search button clicked");

    }

    @Then("Kayak List results")
    public void kayakListResults() {
        log.info("Kayak List results");
    }

    @After
    public final void closeDriver() {
        if (driver != null) {
            log.info("close driver");
            driver.manage().deleteAllCookies();
            driver.close();
            driver.quit();
        }
    }

}
