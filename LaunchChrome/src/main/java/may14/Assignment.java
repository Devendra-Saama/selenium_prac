package may14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Assignment
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.linkText("Multiple Windows")).click();
        driver.findElement(By.linkText("Click Here")).click();
        Set<String>set=driver.getWindowHandles();
        Iterator<String> itr=set.iterator();
        String parent=itr.next();
        String child=itr.next();
        driver.switchTo().window(child);
        System.out.println(driver.findElement(By.xpath("//h3[text()='New Window']")).getText());
        driver.switchTo().window(parent);
        System.out.println(driver.findElement(By.xpath("//div/h3[contains(text(),'Opening')]")).getText());




    }
}
