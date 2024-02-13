package HandlingScreenshot;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class ParticularsectionScreenshot {
    public static void main(String[] args) throws InterruptedException, IOException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(5000);

        WebElement feature=driver.findElement(By.xpath("//div[@class='product-item' and @data-productid='4']"));
        File src =feature.getScreenshotAs(OutputType.FILE);
        File trg=new File(".\\Screenshots\\feature.jpg");
        FileUtils.copyFile(src,trg);
    }
}
