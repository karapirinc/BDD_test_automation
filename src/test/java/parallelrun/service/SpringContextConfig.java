package parallelrun.service;

import cucumber.api.java.Before;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import parallel.Config;

@SpringBootTest(classes = Config.class)
@DirtiesContext
public class SpringContextConfig {

    @Before
    public void setupCucumberSpringContext(){
//         Dummy method so cucumber will recognize this class as glue
//         and use its context configuration.
    }
}