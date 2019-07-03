package parallelrun.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber-report"}, features = "src/test/resources/features"
        , tags = {"not @Ignore"}
        , glue = {"parallelrun", "cucumber.api.spring"})
public class CucumberRunner {


}