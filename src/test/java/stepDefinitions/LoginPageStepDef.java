package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class LoginPageStepDef {

    private LoginPage loginPage;

    @And("I'm on Login page")
    public void iCheckLoginPageLoaded() {
        assertTrue(loginPage.isPageLoaded(), "Log in page is not displayed");
    }

    @Given("I navigate to Login page")
    public void iNavigateToLoginPage() {
        loginPage = LoginPage.navigateToLoginPage();
    }

    @And("I login to account")
    public void iLoginToAccount() {
        loginPage.login();
    }
}
