package may14;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
        Actions a=new Actions(driver);
        //move To element
//        WebElement element= driver.findElement(By.xpath("//div[@id='nav-link-accountList']"));
//        a.moveToElement(element).build().perform();

        //Type in Capital Letters and select it
        a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();

        //right click
       a.moveToElement(driver.findElement(By.xpath("//div[@id='nav-link-accountList']"))).contextClick().build().perform();
    }
}
