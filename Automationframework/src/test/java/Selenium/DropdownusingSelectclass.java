package Selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownusingSelectclass {

    @Test
    public void dropdownselection(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://chercher.tech/practice/practice-dropdowns-selenium-webdriver");
        WebElement productname=driver.findElement(By.xpath("//select[@class='col-lg-3' and @id='first']"));
        Select prdoptions=new Select(productname);
        System.out.println(prdoptions.getOptions());
       // prdoptions.selectByValue("Iphone");
        prdoptions.selectByVisibleText("Iphone");

        driver.close();

    }
}
