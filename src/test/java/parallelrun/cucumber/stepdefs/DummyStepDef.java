package parallelrun.cucumber.stepdefs;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import parallelrun.cucumber.model.DummyDataModel;
import lombok.extern.slf4j.Slf4j;
import org.junit.BeforeClass;

import java.lang.management.ManagementFactory;

@Slf4j
public class DummyStepDef {


    @BeforeClass
    public static void beforeClass() {
        log.info("DummyStepDef Started in thread: {} , in JVM: {}", Thread.currentThread().getId(), ManagementFactory.getRuntimeMXBean().getName());
    }

    @Before
    public void before() {
        log.info("DummyStepDef Test Started in thread: {} , in JVM: {}", Thread.currentThread().getId(), ManagementFactory.getRuntimeMXBean().getName());
    }

    private DummyDataModel myModel;

    @Given("^Dummy Given")
    public void dummyGiven() {
        myModel = new DummyDataModel();
        myModel.setValue(1);
        log.info("Dummy Given {}", myModel);
    }

    @When("^Dummy When$")
    public void dummyWhen() {
        log.info("Dummy When {}", myModel);
    }

    @Then("^Dummy Then$")
    public void dummyThen() {
        log.info("Dummy Then {}", myModel);
    }

    @After
    public final void closeDriver() {
        log.info("End of the test {}", myModel);
    }

}
