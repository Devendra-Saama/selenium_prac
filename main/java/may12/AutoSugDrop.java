package may12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AutoSugDrop
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("autosuggest")).sendKeys("ind");
        Thread.sleep(3000);
        List<WebElement> options=driver.findElements(By.xpath("//*[@class='ui-menu-item']/a"));

        for(WebElement option:options)
        {
           if(option.getText().equalsIgnoreCase("India"))
           {
               option.click();
               System.out.println("Hii");
               break;
           }
        }


//        WebDriver driver =new ChromeDriver();
//
//        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
//
//        driver.findElement(By.id("autosuggest")).sendKeys("ind");
//
//        Thread.sleep(3000);
//
//        List<WebElement> options =driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
//
//
//        for(WebElement option :options)
//
//        {
//
//            if(option.getText().equalsIgnoreCase("India"))
//
//            {
//
//                option.click();
//
//                break;
//
//
//            }
//
//        }
    }
}
