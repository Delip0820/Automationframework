package CheckboxHandling;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class selectallthecheckboxes {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");

        List<WebElement> checkboxlist=driver.findElements(By.xpath("//input[@type='checkbox' and @class='cb1-element']"));
        System.out.println(checkboxlist.size());
        for (WebElement checkbox:checkboxlist){
            checkbox.click();
        }

    }
}
