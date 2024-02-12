package MouseOperations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        WebElement rightclickele=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));

        Actions act=new Actions(driver);
        act.contextClick(rightclickele).perform();

    }
}
