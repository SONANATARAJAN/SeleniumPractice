package in.co.automation.pages;

import in.co.automation.components.WebDriverManagerBasePage;
import in.co.automation.locators.LoginLocators;
import in.co.automation.reports.ExtentTestManager;
import org.openqa.selenium.By;

public class LoginPage {


public void loginMethod() throws InterruptedException {
    WebDriverManagerBasePage webDriverManager= new WebDriverManagerBasePage();
    webDriverManager.safeClick(By.xpath(LoginLocators.clickTestCase));
    webDriverManager.safeClick(By.xpath("//a[@href='/test-cases/login']"));
    webDriverManager.safeClick(By.xpath("(//a[@href='/login'])[1]")) ;
    webDriverManager.setWaitElement(By.id("username") , "practice");
    webDriverManager.setWaitElement(By.id("password") , "SuperSecretPassword!");
    webDriverManager.safeClick(By.id("submit-login"));

    String getMsg = webDriverManager.getMessage(By.id("flash"));
    String desMsg = "You logged into a secure area!";
    if(getMsg.equals(desMsg)){
        System.out.println("Login Succesfullyyyyy");
        ExtentTestManager.getTest().pass("Login Sucessfullyyyyyyyyyy");

    }

}
}
