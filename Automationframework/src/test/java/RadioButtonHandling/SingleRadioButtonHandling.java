package RadioButtonHandling;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.util.List;

public class SingleRadioButtonHandling {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
        List<WebElement> radiobtnlist=driver.findElements(By.xpath("(//div[@class='panel-body'])[2]//label[contains(.,'ale')]"));

        System.out.println(radiobtnlist.size());

         for (WebElement radiobtn:radiobtnlist){
             radiobtn.click();
             driver.findElement(By.id("buttoncheck")).click();
             String validationmsg="Radio button '"+radiobtn.getText()+"' is checked";
             System.out.println("The radio button selected is:"+radiobtn.getText());
             String xpathvalidationtxt=driver.findElement(By.xpath("//p[@class='radiobutton']")).getText();
             System.out.println("The validation message is:"+xpathvalidationtxt);
             Assert.assertEquals(validationmsg,xpathvalidationtxt);
         }


    }
}
