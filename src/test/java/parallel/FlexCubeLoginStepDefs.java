package parallel;

import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.By;

import java.net.MalformedURLException;

@Slf4j
public class FlexCubeLoginStepDefs extends BaseStepDefs {

    private static final By USERID_INPUT = By.id("LOGINUSERID");
    private static final By PASSWORD_INPUT = By.id("user_pwd");
    private static final By SUBMIT_BTN = By.id("fc_sbmit");

    @Given("Open Flexcube login page")
    public void openFlexcubeLoginPage() throws MalformedURLException {
        log.info("Opended openFlexcubeLoginPage");
        driver = getRemoteDriver();
        driver.navigate().to("https://core-dev-elcm.eu.rabodev.com:4443/FCJNeoWeb/LoginServlet");


    }

    @When("Fill username input")
    public void fillUsernameInput() {
        log.info("Fill username input");
        driver.findElement(USERID_INPUT).sendKeys("Hey Budy");


    }

    @And("Fill password")
    public void fillPassword() {
        log.info("fillPassword");
        driver.findElement(PASSWORD_INPUT).sendKeys("bababa");
    }

    @Then("Click login button")
    public void clickLoginButton() {
        log.info("clickLoginButton");
//        driver.findElement(SUBMIT_BTN).click();

    }

    @After
    public final void closeDriver() {

        if (driver != null) {
            log.info("close driver");
            driver.manage().deleteAllCookies();
            driver.close();
            driver.quit();
        }
    }
}
