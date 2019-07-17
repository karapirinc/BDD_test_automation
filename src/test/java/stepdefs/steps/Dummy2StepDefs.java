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
public class Dummy2StepDefs {

    private final DummySingleton dummySingleton;
    private final WebDriver webDriver;

    @Given("A Dummy2 background is given")
    public void aDummy2BackgroundIsGiven() {
        log.info("A Dummy2 background is given {} = {}", dummySingleton, webDriver);
    }

    @Given("Dummy2 Given {string} in {string}")
    public void dummy2Given(String scenario, String file) {
        log.info("Dummy dummyGiven 2");

    }

    @When("Dummy2 When {int}")
    public void dummy2When(int arg0) {
        log.info("Dummy2 When {}", arg0);
    }

    @Then("Dummy2 Then {int}")
    public void dummy2Then(int arg0) {
        log.info("Dummy2 Then {} {} = {}", arg0, dummySingleton, webDriver);
    }
}
