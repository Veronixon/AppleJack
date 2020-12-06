package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginPage extends BasePage{
    public static final String PAGE_PATH = "/home";

    @FindBy(xpath = ".//input[@name='session[username_or_email]']")
    private SelenideElement usernameInputField;

    @FindBy(how = How.NAME, using = "session[password]")
    public SelenideElement passwordInputField;

    @FindBy(how = How.XPATH, using = ".//div[@data-testid='LoginForm_Login_Button']")
    public SelenideElement loginButton;

    public static LoginPage navigateTo(){
        return open(PAGE_PATH, LoginPage.class);
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
