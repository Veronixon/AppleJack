package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.*;

public class HomePage extends BasePage{

    public static final String PAGE_PATH = "https://twitter.com/home";

    private SelenideElement pageTitle= $(By.xpath(".//span[text()='Home']"));

    public boolean isPageLoaded(){
        return pageTitle.isDisplayed();
    }

    public void navigateTo(){
        open(PAGE_PATH);
    }
}
