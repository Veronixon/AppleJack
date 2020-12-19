package core;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j;

import java.io.File;

@Log4j
public class TestDataLoader {
    private static final String EXT = ".json";

    @SneakyThrows
    public static User getTestUser(String userFileId) {
        ObjectMapper mapper = new ObjectMapper();
        String directoryPath = TestDataLoader.getRootFolder() + "/users/";
        File file = new File(TestDataLoader.class.getClassLoader().getResource(directoryPath + userFileId + EXT).getFile());
        return mapper.readValue(file, User.class);
    }


    private static String getRootFolder() {
        return new PropertiesLoader().getEnvironmentConfiguration();
    }

}


