package twitter;

import com.codeborne.selenide.Configuration;
import core.PropertiesLoader;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import lombok.extern.log4j.Log4j;

import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

@Log4j
public class BeforeAfter {

    @Before
    public void setUp() {
        Configuration.browser = PropertiesLoader.getProperty(PropertiesLoader.PropertyEnum.BROWSER);
        Configuration.timeout = Long.valueOf(PropertiesLoader.getProperty(PropertiesLoader.PropertyEnum.DEFAULT_TIMEOUT));
    }

    @After
    public void tearDown(Scenario scenario) {
        log.fatal(String.format("Status for current test: %s", scenario.getStatus()));
        log.fatal("TEST FINISHED");
        getWebDriver().close();
    }
}
