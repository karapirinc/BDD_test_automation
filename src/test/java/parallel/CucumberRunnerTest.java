package parallel;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(glue = {"parallel","cucumber.api.spring"},features = "src/test/resources/parallel")
public class CucumberRunnerTest {


}