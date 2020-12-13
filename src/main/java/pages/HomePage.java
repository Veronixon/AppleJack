package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class HomePage extends BasePage{

    public HomePage() {
        page(this);
    }

    public static final String PAGE_PATH = "https://twitter.com/home";

    @FindBy(xpath = ".//span[text()='Home']")
    public SelenideElement pageTitle;

    public boolean isPageLoaded(){
        return pageTitle.isDisplayed();
    }

    public void navigateTo(){
        open(PAGE_PATH);
    }
}
