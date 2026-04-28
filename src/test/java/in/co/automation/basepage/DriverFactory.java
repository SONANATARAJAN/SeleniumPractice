package in.co.automation.basepage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;


public class DriverFactory {
    public static final Logger log = LogManager.getLogger(DriverFactory.class);
    public static final ThreadLocal<WebDriver> getThreadLocal = new ThreadLocal<>();

    public DriverFactory(){
        throw new IllegalStateException("Driver Initialization ");
    }
    public static WebDriver getDriver(){
        WebDriver driver = getThreadLocal.get();
        if(driver==null){
            throw new RuntimeException("Driver is Null , Driver  not initialization");
        }
        return driver;
    }
    public static void intiChromeBrowser(){
        log.info("Initialization Chrome Browser");
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver(BrowserOption.getChromeOption());
        getThreadLocal.set(driver);
        driver.get("https://practice.expandtesting.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        log.info("Browser Connect Succesfully");
    }
}
