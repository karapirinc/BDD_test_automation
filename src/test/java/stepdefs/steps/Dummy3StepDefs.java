package stepdefs.steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import spring.DummySingleton;
import spring.WebDriver;

@Slf4j
@RequiredArgsConstructor
public class Dummy3StepDefs {

    private final DummySingleton dummySingleton;
    private final WebDriver webDriver;

    @Given("A Dummy3 background is given")
    public void aDummy3BackgroundIsGiven() {
        log.info("A Dummy3 background is given {} = {}", dummySingleton, webDriver);
    }

    @Given("Dummy3 Given {string} in {string}")
    public void Dummy3Given(String scenario, String file) {
        log.info("Dummy dummyGiven 3");

    }

    @When("Dummy3 When {int}")
    public void Dummy3When(int arg0) {
        log.info("Dummy3 When {}", arg0);
    }

    @Then("Dummy3 Then {int}")
    public void Dummy3Then(int arg0) {
        log.info("Dummy3 Then {} {} = {}", arg0, dummySingleton, webDriver);
    }
}
