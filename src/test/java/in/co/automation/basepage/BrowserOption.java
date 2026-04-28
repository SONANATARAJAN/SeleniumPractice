package in.co.automation.basepage;

import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserOption {

    public static ChromeOptions getChromeOption(){
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notification");
        options.addArguments("--incognito");
       // options.addArguments("--headless=new");

        return options;
    }
}
