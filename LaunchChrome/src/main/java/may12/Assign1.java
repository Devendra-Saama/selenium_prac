package may12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assign1
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.xpath("//*[@id='checkbox-example']//input[@value='option1']")).click();
       Assert.assertTrue( driver.findElement(By.xpath("//*[@id='checkbox-example']//input[@value='option1']")).isSelected());

        driver.findElement(By.xpath("//*[@id='checkbox-example']//input[@value='option1']")).click();
        Assert.assertFalse( driver.findElement(By.xpath("//*[@id='checkbox-example']//input[@value='option1']")).isSelected());

        System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());
    }
}
