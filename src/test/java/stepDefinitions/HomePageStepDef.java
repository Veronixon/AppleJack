package stepDefinitions;

import io.cucumber.java.en.And;
import pages.HomePage;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class HomePageStepDef {
    HomePage homePage;

    public HomePageStepDef(HomePage homePage) {
        this.homePage = homePage;
    }

    @And("I'm on Home page")
    public void iCheckHomePageLoaded() {
        assertTrue(homePage.isPageLoaded(), "Home page is not downloaded.");
    }
}
