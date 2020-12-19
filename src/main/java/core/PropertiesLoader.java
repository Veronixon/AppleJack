package core;

import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

@Log4j
public class PropertiesLoader extends Properties {
    InputStream inputStream;

    @SneakyThrows
    public static String getProperty(PropertyEnum property) {
        return new PropertiesLoader().getPropertyValue(property);
    }

    @SneakyThrows
    public String getPropertyValue(PropertyEnum propertyName) {
        String propertyValue = "";
        try {
            Properties prop = new Properties();
            String propFileName = getEnvironmentConfiguration() + ".properties";

            inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
            }

            propertyValue = prop.getProperty(propertyName.value);

        } catch (Exception e) {
            log.fatal("Cannot get property " + propertyName + " from config file.");
        } finally {
            inputStream.close();
        }

        return propertyValue;
    }

    @SneakyThrows
    public String getEnvironmentConfiguration() {
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
            log.fatal("Cannot get property " + propertyName + " from config file.");
        } finally {
            inputStream.close();
        }
        return propertyValue;
    }

    public enum PropertyEnum {
        ENV("env"),
        BASE_URL("base.url"),
        TEST_DATA_FOLDER("test.data.folder");

        private String value;

        PropertyEnum(String value) {
            this.value = value;
        }
    }
}
