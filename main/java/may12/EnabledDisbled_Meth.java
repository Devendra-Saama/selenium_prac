package may12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class EnabledDisbled_Meth
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        if(driver.findElement(By.xpath("//div[@id='Div1']")).getDomAttribute("style").contains("1"))
        {
            System.out.println("Enable");
            Assert.assertTrue(true);
        }
    }
}
