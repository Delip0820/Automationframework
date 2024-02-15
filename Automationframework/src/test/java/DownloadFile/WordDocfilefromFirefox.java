package DownloadFile;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.HashMap;

public class WordDocfilefromFirefox {
    public static void main(String[] args) {
        String location=System.getProperty("user.dir")+"\\Downloads";
        HashMap preferences=new HashMap<>();
        preferences.put("download.default_directory",location);

        FirefoxOptions options=new FirefoxOptions();
        options.setCapability("prefs",preferences);

        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver(options);
        driver.manage().window().maximize();

        driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
        driver.findElement(By.xpath("//tbody//tr[2]//td[@class='text-right file-link']//a")).click();

    }
}
