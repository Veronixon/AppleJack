package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.open;

public class LoginPage extends BasePage{

    public final String PAGE_PATH = "https://twitter.com/home";

    @FindBy(xpath = ".//input[@name='session[username_or_email]']")
    public WebElement usernameInputField;

    @FindBy(name = "session[password]")
    public WebElement passwordInputField;

    @FindBy(xpath = ".//div[@data-testid='LoginForm_Login_Button']")
    public WebElement loginButton;

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
