package automation.config;

import java.io.*;
import java.util.Enumeration;
import java.util.Properties;

public class TestConfiguration {

        private static TestConfiguration testconfig;
        private static Properties properties;

        public static String valueFor(final String keyName) throws Throwable{
            return getInstance().getProperty(keyName);
        }

        private static TestConfiguration getInstance() throws Throwable{
            if (testconfig == null) {
                properties = new Properties();
                populateCommonProperties();
                testconfig = new TestConfiguration();
                }
                        return testconfig;
        }

        private static void populateCommonProperties() throws Throwable{
            readInPropertiesFile("common");
        }

        private static void readInPropertiesFile (String FilePath) throws Throwable {

            String propertiesFilePath = String.format("/Users/kartikeyaj/Desktop/SeleniumMavenPageObjectTest/src/test/resource/config/common.properties");
            File propertiesFile = new File(propertiesFilePath);
            if(!propertiesFile.exists()) {
                throw new FileNotFoundException(String.format("No property file found"));
            }
            InputStream input = new FileInputStream(propertiesFilePath);
            properties.load(input);
            input.close();
        }

        private String getProperty(final String keyName){
            String value = properties.getProperty(keyName);
            if(value == null) {
                throw new Error(String.format("Key %s is not found in" , keyName));
            }

            return value;
        }


        public static void main(String[] args) throws Throwable {
            String s = testconfig.valueFor("WebDriverChromeDriverPath");
            System.out.println(s);
        }

}