package parallelrun.cucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber-report"}, features = "src/test/resources/features", tags = {"not @Dummy", "not @Ignore"}
        , glue = {"cucumber", "cucumber.api.parallelrun.spring"})
public class CucumberRunner {


}