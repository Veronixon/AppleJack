import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
        glue = {"stepDefinitions"},
        features = {"src/test/java/scenarios"},
        stepNotifications = true,
        tags = "@t"
)
public class TestRunner {

}
