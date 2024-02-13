package HandlingScreenshot;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.awt.desktop.OpenURIEvent;
import java.io.File;
import java.io.IOException;

public class WebElementscreenshot {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.nopcommerce.com/");

        WebElement element=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
        File src=element.getScreenshotAs(OutputType.FILE);
        File trg=new File(".\\Screenshots\\webelement.png");
        FileUtils.copyFile(src,trg);
        driver.close();

    }
}
