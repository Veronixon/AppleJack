package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.open;

public class LoginPage extends BasePage{

    public final String PAGE_PATH = "https://twitter.com/home";

    @FindBy(how = How.XPATH, using = ".//input[@name='session[username_or_email]']")
    public SelenideElement usernameInputField;

    @FindBy(how = How.NAME, using = "session[password]")
    public SelenideElement passwordInputField;

    @FindBy(how = How.XPATH, using = ".//div[@data-testid='LoginForm_Login_Button']")
    public SelenideElement loginButton;

    public void navigateToLoginPage(){
        open(PAGE_PATH);
    }

    public boolean isPageLoaded(){
        return usernameInputField.isDisplayed();
    }

    public void login(){
        usernameInputField.sendKeys("Veronik17231118");
        passwordInputField.sendKeys("MyPass123");
        loginButton.click();
    }

}
