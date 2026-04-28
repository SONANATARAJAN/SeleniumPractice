package in.co.automation.pages;

import in.co.automation.components.WebDriverManagerBasePage;
import in.co.automation.locators.LoginLocators;
import org.openqa.selenium.By;

public class LoginPage {


public void loginMethod() throws InterruptedException {
    WebDriverManagerBasePage webDriverManager= new WebDriverManagerBasePage();
    webDriverManager.safeClick(By.xpath(LoginLocators.clickTestCase));
    webDriverManager.safeClick(By.partialLinkText("Read"));
}
}
