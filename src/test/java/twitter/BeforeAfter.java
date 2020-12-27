package twitter;

import com.codeborne.selenide.Configuration;
import core.PropertiesLoader;
import core.Resolutions;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BeforeAfter {

    @Before
    public void setUp(Scenario scenario) {
        Configuration.browser = PropertiesLoader.getProperty(PropertiesLoader.PropertyEnum.BROWSER);
        Configuration.timeout = Long.valueOf(PropertiesLoader.getProperty(PropertiesLoader.PropertyEnum.DEFAULT_TIMEOUT));

        if (scenario.getSourceTagNames().contains("@MobileView")) {
            Configuration.browserSize = Resolutions.iPhone_X.getValue();
        }

        if (scenario.getSourceTagNames().contains("@TabletView")) {
            Configuration.browserSize = Resolutions.iPad.getValue();
        }
    }
}
