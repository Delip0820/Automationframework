package DownloadFile;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.util.HashMap;

public class WordDocDownloadfromEdge {

    public static void main(String[] args) {

        String location=System.getProperty("user.dir")+"\\Downloads";
        HashMap preferences=new HashMap<>();
        preferences.put("download.default_directory",location);

        EdgeOptions edgeOptions=new EdgeOptions();
        edgeOptions.setCapability("prefs",preferences);

        WebDriverManager.edgedriver().setup();
        WebDriver driver=new EdgeDriver(edgeOptions);
        driver.manage().window().maximize();

        driver.get("https://file-examples.com/index.php/sample-documents-download/sample-doc-download/");
        driver.findElement(By.xpath("//tbody//tr[2]//td[@class='text-right file-link']//a")).click();
    }
}
