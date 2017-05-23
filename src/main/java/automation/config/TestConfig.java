package automation.config;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;

public class TestConfig {

    private static TestConfig testConfig;
    private static Properties properties;

    public static String valueFor(final String keyName) throws Throwable{
        return getInstance().getProperty(keyName);
    }

    private static TestConfig getInstance() throws Throwable {
        if (testConfig == null) {
            properties = new Properties();
            populateCommonProperties();
//            populateEnvProperties(requiredEnvironmentName);
            testConfig = new TestConfig();
        }
        return testConfig;
    }

    private static void populateCommonProperties() throws Throwable {
        readInPropertiesFile("common");
    }



    private static void readInPropertiesFile(String filePath) throws Throwable {
        System.out.println("***********************");
        System.out.println(filePath);
        System.out.println("***********************");
//        String propertiesFilePath = String.format("/Users/kartikeyaj/Desktop/SeleniumMavenPageObjectTest/src/test/resources/config/%s.properties", filePath);
//        String propertiesFilePath = "/Users/kartikeyaj/Desktop/SeleniumMavenPageObjectTest/src/test/resource/config/common.properties";
        String propertiesFilePath = String.format("src/test/resource/config/%s.properties", filePath);

        System.out.println(propertiesFilePath);
        File propertiesFile = new File(propertiesFilePath);
        if(!propertiesFile.exists()) {
            throw new FileNotFoundException(
                    String.format("No properties file found at: %s", filePath));
        }
        InputStream input = new FileInputStream(propertiesFilePath);
        properties.load(input);
        input.close();
    }

    private String getProperty(final String keyName) {
        System.out.println("$$$$$$$$");
        String value = properties.getProperty(keyName);
//        if(value == null) {
//            throw new Error(String.format("Key %s not configured for environment %s", keyName, requiredEnvironmentName));
//        }
        return value;
    }
}
