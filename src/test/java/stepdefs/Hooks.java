package stepdefs;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import spring.WebDriver;

import java.util.Random;

@Slf4j
@RequiredArgsConstructor
public class Hooks {

    private final WebDriver webDriver;

    @Before
    public void beforeScenario(Scenario scenario){
        webDriver.setSessionId(new Random().nextInt());
        log.info("========Before Scenario ========{} = webDriver {}",scenario.getName(), webDriver);
    }
    @BeforeStep
    public void beforeStep(Scenario scenario) {
        log.info("---Before Step--- {} = {}", scenario.getName(), webDriver);
    }
    @AfterStep
    public void afterStep(Scenario scenario){
        log.info("---After Step--- {} = {}",scenario.getName(), webDriver);
    }

    @After
    public void afterScenario(Scenario scenario){
      log.info("========After Scenario======== {} = webDriver {}",scenario.getName(), webDriver);
    }
}
