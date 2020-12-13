package stepDefinitions;

import com.codeborne.selenide.Configuration;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BeforeAfter {

    @Before
    public void setUp(Scenario scenario) {
        Configuration.timeout = 15000;
    }
}
