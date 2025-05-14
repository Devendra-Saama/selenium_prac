package may14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class Parent_Child_Window
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://rahulshettyacademy.com/loginpagePractise/");
        driver.findElement(By.cssSelector("a.blinkingText")).click();
        Set<String> set=driver.getWindowHandles();
        Iterator<String> itr=set.iterator();
        String parentId=itr.next();
        String childId=itr.next();
        driver.switchTo().window(childId);
        //Please email us at mentor@rahulshettyacademy.com with below template to receive response
        //0.Please email us
        //1. mentor@rahulshettyacademy.com with below template to receive response
        String email=driver.findElement(By.cssSelector("p.im-para.red")).getText().split("at")[1].trim().split(" ")[0];
        driver.switchTo().window(parentId);
        driver.findElement(By.id("username")).sendKeys(email);
    }
}
