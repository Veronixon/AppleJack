package core;

import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Date;
import java.util.Properties;

@Log4j
public class PropertyLoader extends Properties {
    InputStream inputStream;

    @SneakyThrows
    public static String getProperty(PropertyEnum property) {
        return new PropertyLoader().getPropertyValue(property);
    }

    @SneakyThrows
    public String getPropertyValue(PropertyEnum propertyName) {
        String propertyValue = "";
        try {
            Properties prop = new Properties();
            String propFileName = setEnvironmentConfiguration() + ".properties";

            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }

            propertyValue = prop.getProperty(propertyName.value);

        } catch (Exception e) {
            log.error("Cannot get property " + propertyName + " from config file.");
        } finally {
            inputStream.close();
        }

        return propertyValue;
    }

    @SneakyThrows
    public String setEnvironmentConfiguration() {
        String propertyValue = "";
        String propertyName = PropertyEnum.ENV.value;
        try {
            Properties prop = new Properties();
            String propFileName = "base.properties";

            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }

            propertyValue = prop.getProperty(propertyName);

        } catch (Exception e) {
            log.error("Cannot get property " + propertyName + " from config file.");
        } finally {
            inputStream.close();
        }
        return propertyValue;
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
