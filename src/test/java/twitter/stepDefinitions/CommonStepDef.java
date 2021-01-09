package twitter.stepDefinitions;

import core.DriverManager;
import io.cucumber.java.en.Given;
import pages.HomePage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class CommonStepDef {
    HomePage homePage;

    public CommonStepDef(HomePage homePage) {
        this.homePage = homePage;
    }

    @Given("I'm gonna use {string} device")
    public void iMGonnaUseMobileDevice(String device) {
        new DriverManager().setResolution(device);
    }


}
