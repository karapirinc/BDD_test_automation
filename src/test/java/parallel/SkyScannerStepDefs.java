package parallel;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lombok.extern.slf4j.Slf4j;

import java.net.MalformedURLException;

@Slf4j
public class SkyScannerStepDefs extends BaseStepDefs {


    @Given("^SkyScanner Default inputs$")
    public void skyScannerDefaultInputs() throws MalformedURLException {
        driver = getRemoteDriver();
        driver.navigate().to("https://www.skyscanner.net");
        log.info("skyScannerDefaultInputs");
    }

    @When("^SkyScanner Search button clicked$")
    public void skyScannerSearchButtonClicked() {
//        driver.findElement(By.xpath("//*[@id=\"flights-search-controls-root\"]/div/div/form/div[3]/button")).click();
        log.info("SkyScanner Flight Search button clicked");
    }

    @Then("^SkyScanner List results$")
    public void skyScannerListResults() {
        log.info("SkyScanner Flight List results");
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
