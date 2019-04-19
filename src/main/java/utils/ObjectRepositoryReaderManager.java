package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ObjectRepositoryReaderManager {

    private static ObjectRepositoryReaderManager instance  = null;
    private Properties properties = new Properties();

    private ObjectRepositoryReaderManager() {
        loadRepository();
    }

    public static ObjectRepositoryReaderManager getInstance() {
        if(instance == null) {
            instance = new ObjectRepositoryReaderManager();
        }
        return instance;
    }

    private void loadRepository() {

        String fileName = System.getProperty("user.dir") + "/ObjectRepo.properties";

        InputStream input = null;
        try {
            input = new FileInputStream(fileName);
            properties.load(input);
        } catch (IOException io) {
            io.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }

    }

    public String get(String key) {
        String value = properties.getProperty(key);
        return value;
    }
  /*  public String getLocatorBy(String key) {
        String locator = null;
        String value = properties.getProperty(key);
        locator = value.split(":")[0];
        return locator;
    }
    public String getLocator(String key) {
        String locator = null;
        String value = properties.getProperty(key);
        locator = value.split(":")[1];
        return locator;
    }*/
}
