package KeyboardActions;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.security.Key;

public class HandlingMultipleKeyboardkeys {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://text-compare.com/");
        WebElement input1=driver.findElement(By.xpath("//textarea[@id='inputText1']"));
        WebElement input2=driver.findElement(By.xpath("//textarea[@id='inputText2']"));
        input1.sendKeys("Welcome to selenium");

        Actions act=new Actions(driver);

        //CTRL+A
        act.keyDown(Keys.CONTROL);
        act.sendKeys("a");
        act.keyUp(Keys.CONTROL);
        act.perform();

        //CTRL+C
        act.keyDown(Keys.CONTROL);
        act.sendKeys("c");
        act.keyUp(Keys.CONTROL);
        act.perform();

        //TAB
        act.sendKeys(Keys.TAB).perform();

        //CTRL+V
        act.keyDown(Keys.CONTROL);
        act.sendKeys("v");
        act.keyUp(Keys.CONTROL);
        act.perform();

        if(input1.getAttribute("value").equals(input2.getAttribute("value"))){
            System.out.println("Text copied");
        }else {
            System.out.println("Text not copied");
        }

        driver.close();
    }
}
