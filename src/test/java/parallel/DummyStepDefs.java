package parallel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import parallelrun.model.DummyDataModel;
import parallelrun.service.DummyService;

@Slf4j
public class DummyStepDefs {

    private static final String KEY = "MY_KEY";

    private DummyDataModel dummyDataModel;

    private final DummyService dummyService;

    @Autowired
    public DummyStepDefs(DummyService dummyService) {
        this.dummyService = dummyService;
        this.dummyDataModel = new DummyDataModel();
    }

    @Given("A Dummy background is given")
    public void aDummyBackgroundIsGiven() {
        log.info("A Dummy background is given");
    }

    @Given("Dummy Given {string} in {string}")
    public void dummyGiven(String scenario, String file) {
        dummyDataModel.setValue(1);
        System.out.format("Thread ID - %2d - %s from %s feature file.\n",
                Thread.currentThread().getId(), scenario, file);
        log.info("Dummy Given {}", dummyDataModel);
        log.info("Dummy Service Dummy Value : {}", dummyService.getDummy());
    }

    @When("^Dummy When$")
    public void dummyWhen() {
        log.info("Dummy When {}", dummyDataModel);
    }

    @Then("^Dummy Then$")
    public void dummyThen() {
        log.info("Dummy Then {}", dummyDataModel);
    }

    @Given("^Dummy Given2")
    public void dummyGiven2() {
        dummyDataModel = new DummyDataModel();
        dummyDataModel.setValue(1);
        log.info("Dummy Given 2{}", dummyDataModel);
    }

    @When("^Dummy When2$")
    public void dummyWhen2() {
        log.info("Dummy When 2{}", dummyDataModel);
    }

    @Then("^Dummy Then2$")
    public void dummyThen2() {
        log.info("Dummy Then 2{}", dummyDataModel);
    }
}
