package AlertHandling;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptAlert {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();//To click OK on javascript alert

        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
        driver.switchTo().alert().dismiss(); //To click Cancel on Javascript alert

        //To get the text and enter the text on javascript alert
        driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
        Alert prompt=driver.switchTo().alert();
        System.out.println("The text on the javascript alert is:"+prompt.getText());
        prompt.sendKeys("Welcome alert");
        prompt.accept();

    }
}
