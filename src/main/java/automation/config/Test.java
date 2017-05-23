package automation.config;


public class Test {

    public static void main(String[] args) throws Throwable{
        TestConfig testc = new TestConfig();
        System.out.println(testc.valueFor("WebDriverChromeDriverPath"));
    }
}
