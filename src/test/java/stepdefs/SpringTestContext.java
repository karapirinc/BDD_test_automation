package stepdefs;

import io.cucumber.java.Before;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;

@Slf4j
@SpringBootTest(classes = {SpringConfig.class})
@DirtiesContext
public class SpringTestContext {

    @Before
    public void setupCucumberSpringContext(){
        log.info("========setupCucumberSpringContext========{}",this);
//         Dummy method so cucumber will recognize this class as glue
//         and use its context configuration.
    }
}