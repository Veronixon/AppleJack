package pages;

import core.PropertyLoader;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public abstract class BasePage {

    public abstract boolean isPageLoaded();

    public static String getBaseUrl(){
        return PropertyLoader.getProperty(PropertyLoader.PropertyEnum.BASE_URL);
    }


}
