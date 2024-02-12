package WindowHandling;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class HandleWindow {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.swtestacademy.com/");

        //Capturing singlewindowid
        /*String windowid=driver.getWindowHandle();
        System.out.println("The Windowid for the single window is:"+windowid);*/

        List<WebElement> linkslist=driver.findElements(By.xpath("//div[@class='gb-button-wrapper gb-button-wrapper-d8f4eed5']//a[contains(@class,'gb-button')]"));
        for (WebElement links:linkslist){
            links.click();
            driver.switchTo().defaultContent();
            Thread.sleep(2000);
        }

        Set<String> windowsset=driver.getWindowHandles();
        List<String> windowslist=new ArrayList<>(windowsset);
        for(String window:windowslist){
            String pagetitle=driver.switchTo().window(window).getTitle();
            System.out.println("The title of the page is:"+pagetitle);
            if(pagetitle.equals("Software Test Academy | Facebook")||pagetitle.equals("Sign Up | LinkedIn")){
                driver.close();
            }

        }






    }
}
