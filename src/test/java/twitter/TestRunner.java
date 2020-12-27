package twitter;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
        glue = {"twitter"},
        features = {"src/test/java/twitter/scenarios"},
        stepNotifications = true,
        tags = "@TwitterRegression"
)
public class TestRunner {

}
