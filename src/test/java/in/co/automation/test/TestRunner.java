package in.co.automation.test;

import in.co.automation.basepage.DriverFactory;
import in.co.automation.pages.LoginPage;
import in.co.automation.reports.ExtentTestManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(in.co.automation.reports.ExtentTestManager.class)
public class TestRunner extends BaseTest {
    @Test
    public void testLogin() throws InterruptedException {

        LoginPage loginPage = new LoginPage();
        loginPage.loginMethod();

        ExtentTestManager.getTest().pass("Login Pass");
    }


}
