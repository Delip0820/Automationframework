package DownloadFile;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;

public class WorddocDownloadonChrome {
    public static void main(String[] args) {

        String location=System.getProperty("user.dir")+"\\Downloads";
        HashMap preferences=new HashMap<>();
        preferences.put("download.default_directory",location);

        ChromeOptions options=new ChromeOptions();
        options.setExperimentalOption("prefs",preferences);

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver(options);
        driver.manage().window().maximize();

        driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
        driver.findElement(By.xpath("//tbody//tr[1]//td[@class='text-right file-link']//a")).click();
        driver.close();
    }
}
