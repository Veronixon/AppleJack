package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pages.LoginPage;

import static org.junit.jupiter.api.Assertions.assertTrue;


public class LoginPageStepDef {
    LoginPage loginPage;

    public LoginPageStepDef(LoginPage loginPage) {
        this.loginPage = loginPage;
    }

    @And("I'm on Login page")
    public void iCheckLoginPageLoaded() {
        assertTrue(loginPage.isPageLoaded(), "Login page is not downloaded");
    }

    @Given("I navigate to Login page")
    public void iNavigateToLoginPage() {
        loginPage.navigateToLoginPage();
    }

    @And("I login to account")
    public void iLoginToAccount() {
        loginPage.login();
    }
}
