package GenericConfig;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericConfig {

    private final String operatingSystem = System.getProperty("os.name");
    private final WebDriver webDriver;

    public GenericConfig() {
        if(getOperatingSystem().equalsIgnoreCase("Windows 10")) {
            System.setProperty("webdriver.chrome.driver", "src\\WebDriver\\chromedriver.exe");
        } else {
            System.setProperty("webdriver.chrome.driver", "src/webDriver/chromedriver.exe");
        }

        this.webDriver = new ChromeDriver();
    }

    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    public WebDriver getWebDriver() {
        return webDriver;
    }
}
