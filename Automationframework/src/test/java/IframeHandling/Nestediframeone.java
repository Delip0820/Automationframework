package IframeHandling;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Nestediframeone {
    @Test
    public void nestedIframe() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_iframe_height_width");

        driver.switchTo().frame("iframeResult");
        WebElement innerframe=driver.findElement(By.xpath("//iframe[@title='Iframe Example']"));
        driver.switchTo().frame(innerframe);
        WebElement iframetext=driver.findElement(By.xpath("//body/h1"));
        System.out.println(iframetext.getText());
        driver.close();
    }
}
