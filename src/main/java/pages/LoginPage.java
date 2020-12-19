package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class LoginPage extends BasePage{
    public static final String PAGE_PATH = "/login";

    private SelenideElement usernameInputField= $(By.xpath(".//input[@name='session[username_or_email]']"));
    private SelenideElement passwordInputField= $(By.name("session[password]"));
    private SelenideElement loginButton= $(By.xpath(".//div[@data-testid='LoginForm_Login_Button']"));


    public void navigateTo(){
        open(BASE_URL + PAGE_PATH);
    }

    public boolean isPageLoaded(){
        return usernameInputField.isDisplayed();
    }

    public void login(String username, String password){
        usernameInputField.sendKeys(username);
        passwordInputField.sendKeys(password);
        loginButton.click();
    }

}
