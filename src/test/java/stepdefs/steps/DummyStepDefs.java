package stepdefs.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import spring.WebDriver;
import spring.DummySingleton;

@Slf4j
@RequiredArgsConstructor
public class DummyStepDefs {

    private final DummySingleton dummySingleton;
    private final WebDriver webDriver;

    @Given("A Dummy background is given")
    public void aDummyBackgroundIsGiven() {
        log.info("A Dummy background is given {} = {}", dummySingleton, webDriver);
    }

    @Given("Dummy Given {string} in {string}")
    public void dummyGiven(String scenario, String file) {
        log.info("Dummy dummyGiven 1");

    }

    @When("Dummy When {int}")
    public void dummyWhen(int arg0) {
        log.info("Dummy When {}", arg0);
    }

    @Then("Dummy Then {int}")
    public void dummyThen(int arg0) {
        log.info("Dummy Then {} {} = {}",arg0,dummySingleton, webDriver);
    }
}
