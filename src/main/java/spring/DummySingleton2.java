package spring;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import static io.cucumber.spring.CucumberTestContext.SCOPE_CUCUMBER_GLUE;

@Slf4j
@Getter
@Component
@RequiredArgsConstructor
@Scope(SCOPE_CUCUMBER_GLUE)
public class DummySingleton2 {

    private final WebDriver webDriver;

    @PostConstruct
    public void postConstruct() {
        log.info("postConstruct Singleton 2 {} = {}",this, webDriver);
    }
    @PreDestroy
    public void preDestroy() {
        log.info("preDestroy Singleton 2 {} = {}",this, webDriver);
    }
}
