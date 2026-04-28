package in.co.automation.test;

import in.co.automation.basepage.DriverFactory;
import in.co.automation.pages.LoginPage;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

public class TestRunner extends BaseTest {
    @Test
    public void testLogin() throws InterruptedException {

        LoginPage loginPage = new LoginPage();
        loginPage.loginMethod();





    }


}
