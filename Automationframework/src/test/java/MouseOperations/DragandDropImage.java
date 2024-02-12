package MouseOperations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropImage {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));

        WebElement firstimage=driver.findElement(By.xpath("//li//img[@src='images/high_tatras_min.jpg']"));
        WebElement secondimage=driver.findElement(By.xpath("//li//img[@src='images/high_tatras2_min.jpg']"));

        WebElement trash=driver.findElement(By.xpath("//div[@id='trash']"));

        Actions actions=new Actions(driver);
        actions.dragAndDrop(firstimage,trash).perform();
        actions.dragAndDrop(secondimage,trash).perform();
    }
}
