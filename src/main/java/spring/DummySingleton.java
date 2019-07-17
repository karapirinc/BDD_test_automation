package spring;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

@Slf4j
@Getter
@Component
@Scope(SCOPE_CUCUMBER_GLUE)
public class DummySingleton {

    @PostConstruct
    public void postConstruct() {
        log.info("postConstruct Singleton {}",this);
    }
    @PreDestroy
    public void preDestroy() {
        log.info("preDestroy Singleton {}",this);
    }
}
