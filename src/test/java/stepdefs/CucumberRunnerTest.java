package stepdefs;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import lombok.extern.slf4j.Slf4j;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@Slf4j
@RunWith(Cucumber.class)
@CucumberOptions(glue = {"stepdefs", "io.cucumber.spring"},
        features = "src/test/resources/stepdefs",
        plugin = {"pretty", "html:target/cucumber-report/", "json:target/cucumber-report/cucumber.json"},
        tags = {"@Dummy"}
)
public class CucumberRunnerTest {

    @BeforeClass
    public static void startTests() {
        log.info("********** Start testing **********");
    }

    @AfterClass
    public static void endOfTheTests()
    {
        log.info("********** End of the tests! **********");
    }
}