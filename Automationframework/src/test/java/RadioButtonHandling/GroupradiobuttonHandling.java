package RadioButtonHandling;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GroupradiobuttonHandling {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
        String gendertext=driver.findElement(By.xpath("(//div[@class='panel-body'])[3]//div[1]//h4")).getText();
        System.out.println(gendertext);
        List<WebElement> genderlist=driver.findElements(By.xpath("(//div[@class='panel-body'])[3]//label[contains(.,'ale')]"));

        for (WebElement gender:genderlist){
            if(gender.getText().equals("Female")){
                gender.click();
                System.out.println("The selected radio button is:"+gender.getText());
                break;
            }
        }

        String agegrouptext=driver.findElement(By.xpath("(//div[@class='panel-body'])[3]//div[2]//h4")).getText();
        System.out.println(agegrouptext);
        List<WebElement> agelist=driver.findElements(By.xpath("(//div[@class='panel-body'])[3]//label[contains(.,'to')]"));

        for (WebElement age:agelist){
            System.out.println("The age group is:"+age.getText());
            if(age.getText().equals("5 to 15")){
                age.click();
                break;
            }
        }


    }
}
