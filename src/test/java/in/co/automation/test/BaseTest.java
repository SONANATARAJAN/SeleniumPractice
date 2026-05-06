package in.co.automation.test;

import in.co.automation.basepage.DriverFactory;
import org.junit.jupiter.api.BeforeAll;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
    @BeforeSuite
    public static void initbrowser(){
        DriverFactory.intiChromeBrowser();

    }
}
