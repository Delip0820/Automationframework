package MouseOperations;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouseover {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.browserstack.com/");
        WebElement productele=driver.findElement(By.xpath("//button[@class='bstack-mm-btn bstack-mm-btn-products']"));
        WebElement apptestingele=driver.findElement(By.xpath("//div[@role='tablist']//button[@title='App Testing' and @id='products-dd-tab-2']"));

        WebElement appautomateele=driver.findElement(By.xpath("//div[@class='bstack-mm-sub-li bstack-mm-sub-li-tabs-content']//a[@title='App Automate']"));

        Actions actions=new Actions(driver);
        actions.moveToElement(productele).perform();
        Thread.sleep(2000);
        actions.moveToElement(apptestingele).perform();
        Thread.sleep(2000);
        actions.moveToElement(appautomateele).click().perform();
        Thread.sleep(2000);

    }
}
