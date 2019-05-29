package parallelrun.cucumber.config;

import org.springframework.boot.test.context.SpringBootTest;
import parallelrun.spring.Application;

@SpringBootTest(classes = Application.class)
//@RunWith(SpringRunner.class)
public class SpringContextConfig {

//    @Before
//    public void setupCucumberSpringContext(){
        // Dummy method so cucumber will recognize this class as glue
        // and use its context configuration.
//    }
}