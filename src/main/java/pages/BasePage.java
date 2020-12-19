package pages;

import core.PropertiesLoader;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public abstract class BasePage {
    String BASE_URL = PropertiesLoader.getProperty(PropertiesLoader.PropertyEnum.BASE_URL);

    public abstract boolean isPageLoaded();

    public static String getBaseUrl(){
        return PropertiesLoader.getProperty(PropertiesLoader.PropertyEnum.BASE_URL);
    }


}
