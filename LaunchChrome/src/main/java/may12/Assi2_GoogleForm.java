package may12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Assi2_GoogleForm
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.findElement(By.xpath("//div[@class='form-group']/input[@name='name']")).sendKeys("Devendra");
        driver.findElement(By.xpath("//div[@class='form-group']/input[@name='email']")).sendKeys("deva@gmail.com");
        driver.findElement(By.xpath("//div[@class='form-group']/input[@type='password']")).sendKeys("Deva@123");
        driver.findElement(By.xpath("//input[@id='exampleCheck1']")).click();
        WebElement element=driver.findElement(By.xpath("//select[@id='exampleFormControlSelect1']"));
        Select option=new Select(element);
        option.selectByVisibleText("Male");
        driver.findElement(By.xpath("//input[@id='inlineRadio1']")).click();
        driver.findElement(By.name("bday")).sendKeys("17052003");
        driver.findElement(By.xpath("//input[@value='Submit']")).click();
        System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
    }
}
