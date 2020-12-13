package core;

import lombok.SneakyThrows;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

public class PropertyLoader extends Properties {


    @SneakyThrows
    public static String getProperty(PropertyEnum property){
        return new PropertyLoader().getProperty(property.value);

    }

    public enum PropertyEnum {
        ENV("env"),
        BASE_URL("base.url");

        private String value;

        PropertyEnum(String value) {
            this.value = value;
        }
    }
}
