package core;

import com.codeborne.selenide.Configuration;

public class DriverManager {

    public void setResolution(String deviceName){
        switch (deviceName) {
            case ("iPad"):
                Configuration.browserSize = DriverManager.Resolutions.iPad.getValue();
                break;
            case ("iPhone X"):
                Configuration.browserSize = DriverManager.Resolutions.iPhone_X.getValue();
                break;
        }
    }

    public enum Resolutions {
        iPhone_X("375x812"),
        iPad("768x1024"),
        iPad_PRO("1024x1366"),
        iPhone_6_7_8("375x667");

        private String value;

        Resolutions(String device) {
            this.value = device;
        }

        public String getValue(){
            return value;
        }
    }
}
