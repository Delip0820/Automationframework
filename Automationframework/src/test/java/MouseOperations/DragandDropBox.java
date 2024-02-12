package MouseOperations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropBox {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
        WebElement sourceele=driver.findElement(By.xpath("//div[@class='dragableBox' and @id='box7']"));
        WebElement targetele=driver.findElement(By.xpath("//div[@class='dragableBoxRight' and @id='box107']"));

        Actions actions=new Actions(driver);
        actions.dragAndDrop(sourceele,targetele).perform();
    }
}
