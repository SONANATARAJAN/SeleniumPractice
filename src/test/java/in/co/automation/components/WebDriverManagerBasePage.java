package in.co.automation.components;

import in.co.automation.basepage.DriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class WebDriverManagerBasePage {
    private final  WebDriver driver =   DriverFactory.getDriver();



    public   List<WebElement> getFindElements(By locator) {
        List<WebElement> elements = driver.findElements(locator);
        return elements;
    }

    public   WebElement getFindElement(By locator) {
        WebElement element = driver.findElement(locator);
        return element;
    }
    public WebElement getClickableElement(By locator) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }



    public void safeClick(By locator) {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        WebElement element = wait.until(
                ExpectedConditions.presenceOfElementLocated(locator));

        // Scroll to element
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView({block:'center'});", element);
      //  js.executeScript("arguments[0].scrollIntoView({block:'center'});",element);

        // Wait until clickable
        wait.until(ExpectedConditions.elementToBeClickable(element));

        try {
            element.click(); // normal click
        } catch (Exception e) {
            // fallback JS click
            ((JavascriptExecutor) driver)
                    .executeScript("arguments[0].click();", element);
        }
    }













public void safeClickable(By locator){
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        JavascriptExecutor js =(JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(center)",element);
        wait.until(ExpectedConditions.elementToBeClickable(element));

        try{
            element.click();
        }catch (Exception e){
            js.executeScript("arguments[0].click()");
        }
}



}

































