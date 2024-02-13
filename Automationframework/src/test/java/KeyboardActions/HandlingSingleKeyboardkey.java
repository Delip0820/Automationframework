package KeyboardActions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingSingleKeyboardkey {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://the-internet.herokuapp.com/key_presses");
        Actions act=new Actions(driver);
        act.sendKeys(Keys.ENTER).perform();
        Thread.sleep(2000);

        act.sendKeys(Keys.ESCAPE).perform();
        Thread.sleep(2000);

        act.sendKeys(Keys.TAB).perform();
        Thread.sleep(2000);

        act.sendKeys(Keys.INSERT).perform();
    }
}
