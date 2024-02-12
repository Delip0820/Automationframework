package IframeHandling;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeHandle {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/iframe");

        driver.switchTo().frame("mce_0_ifr");
        WebElement iframetextbar=driver.findElement(By.xpath("//body[@id='tinymce']//*"));
        System.out.println("The text inside the iframe bar is:"+iframetextbar.getText());
        iframetextbar.clear();
        iframetextbar.sendKeys("Clearing the text and add new text inside iframe");
    }
}
