package in.co.automation.test;

import in.co.automation.basepage.DriverFactory;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {
    @BeforeAll
    public static void initbrowser(){
        DriverFactory.intiChromeBrowser();

    }
}
