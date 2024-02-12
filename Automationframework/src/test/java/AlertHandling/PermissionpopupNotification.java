package AlertHandling;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PermissionpopupNotification {
    public static void main(String[] args) {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--disable-notifications");

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.get("https://www.ajio.com/");

    }
}
