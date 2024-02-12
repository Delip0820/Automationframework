package CheckboxHandling;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class selectspeccificcheckbox {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://demo.seleniumeasy.com/basic-checkbox-demo.html");
        List<WebElement> checkboxlist=driver.findElements(By.xpath("//label[contains(.,'Option')]"));
        System.out.println(checkboxlist.size());
        for (WebElement checkbox:checkboxlist){
            if(checkbox.getText().equals("Option 2")||checkbox.getText().equals("Option 4")){
                checkbox.click();
                System.out.println(checkbox.getText());
            }
        }


    }
}
