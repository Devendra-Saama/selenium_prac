package may12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBox {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        Assert.assertFalse(driver.findElement(By.xpath("//*[contains(@id,'SeniorCitizenDiscount')]")).isSelected());
       System.out.println(driver.findElement(By.xpath("//*[contains(@id,'SeniorCitizenDiscount')]")).isSelected());

        driver.findElement(By.xpath("//*[contains(@id,'SeniorCitizenDiscount')]")).click();
        System.out.println(driver.findElement(By.xpath("//*[contains(@id,'SeniorCitizenDiscount')]")).isSelected());
        Assert.assertTrue(driver.findElement(By.xpath("//*[contains(@id,'SeniorCitizenDiscount')]")).isSelected());

        Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(),5);
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
    }
}
