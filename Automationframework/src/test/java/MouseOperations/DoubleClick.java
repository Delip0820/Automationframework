package MouseOperations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class DoubleClick {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        WebElement doubleclickele=driver.findElement(By.xpath("//button[@ondblclick='myFunction()']"));

        Actions act=new Actions(driver);
        act.doubleClick(doubleclickele).perform();

        Alert alert=driver.switchTo().alert();
        Assert.assertEquals(alert.getText(),"You double clicked me.. Thank You..");
        alert.accept();
    }
}
