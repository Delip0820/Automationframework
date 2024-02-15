package IframeHandling;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Nestediframetwo {
    @Test
    public void nestedIframetwo() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://chercher.tech/practice/frames");
        WebElement webpagetext=driver.findElement(By.xpath("//div[@class='card mb-3']//label//span"));
        String outsideframetext=webpagetext.getText();
        Assert.assertEquals(outsideframetext,"Not a Friendly Topic");

        //Handling the first iframe which is nested
        //outer frame
        driver.switchTo().frame("frame1");
        String ofheadertext=driver.findElement(By.xpath("//body//b")).getText();
        Assert.assertEquals(ofheadertext,"Topic :");
        driver.findElement(By.xpath("//body//input[@type='text']")).sendKeys("Passing text inside iframe text bar");

        //inner frame
        driver.switchTo().frame("frame3");
        String ifheadertext=driver.findElement(By.xpath("//body//b")).getText();
        Assert.assertEquals(ifheadertext,"Inner Frame Check box :");
        driver.findElement(By.xpath("//body//input[@type='checkbox']")).click();

        //switching back to default page exiting all the frames
        driver.switchTo().defaultContent();

        //Handling the second frame
        driver.switchTo().frame("frame2");
        String sfheadertex=driver.findElement(By.xpath("//body/b")).getText();
        Assert.assertEquals(sfheadertex,"Animals :");

        WebElement dropdownclass=driver.findElement(By.id("animals"));
        Select drpdownlist=new Select(dropdownclass);
        List<WebElement> animallist=drpdownlist.getOptions();
        for (WebElement animal:animallist){
            System.out.println("The values inside the dropdown are:"+animal.getText());
        }
        drpdownlist.selectByVisibleText("Big Baby Cat");
        driver.close();

    }
}
