package may13;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class Assign3_LoginPage
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("input#password")).sendKeys("learning");
        driver.findElement(By.xpath("//span[text()=' User']/following-sibling::span")).click();
        //explicit Wait
        WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(10));
        w.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
        driver.findElement(By.id("okayBtn")).click();
       WebElement element= driver.findElement(By.xpath("//select[@class='form-control']"));
        Select select=new Select(element);
        select.selectByValue("consult");
        driver.findElement(By.cssSelector("input[id='terms']")).click();
        driver.findElement(By.id("signInBtn")).click();
//        driver.switchTo().alert().accept();

        //explicit Wait
        w.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));


        List<WebElement> list=driver.findElements(By.xpath("//button[contains(text(),'Add')]"));
        for(int i=0;i<list.size();i++)
        {
            list.get(i).click();
        }
       driver.findElement(By.partialLinkText("Checkout")).click();
    }
}
