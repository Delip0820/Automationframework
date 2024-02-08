package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BrowserCommands {

    @Test
    public void browsercommands(){
        //System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Driver/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        //Navigation of url in two ways -- driver.get() & driver.navigateTo()
        //driver.get("https://admin-demo.nopcommerce.com/");
        driver.navigate().to("https://admin-demo.nopcommerce.com/");

        WebElement username=driver.findElement(By.id("Email"));
        username.clear();
        username.sendKeys("admin@yourstore.com");

        WebElement password=driver.findElement(By.id("Password"));
        password.clear();
        password.sendKeys("admin");

        driver.findElement(By.xpath("//button[@type='submit']")).click();

        //capture the title of the page
        System.out.println("The tile of the page is :"+driver.getTitle());
        //capture the url of the current webpage
        System.out.println("The url of the webpage is :"+driver.getCurrentUrl());
        //capture the pagesource of the webpage
        System.out.println("The pagesource of the webpage is:"+driver.getPageSource());



        //close the browser
        driver.close();
    }
}
