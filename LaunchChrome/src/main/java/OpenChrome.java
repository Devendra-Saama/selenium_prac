import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class OpenChrome
{
    public static void main(String args[]) throws InterruptedException {

        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       driver.get("https://rahulshettyacademy.com/locatorspractice");
       driver.findElement(By.id("inputUsername")).sendKeys("Deva");
       driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacadem");
       driver.findElement(By.className("signInBtn")).click();
       System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
       driver.findElement(By.xpath("//a[text()='Forgot your password?']")).click();
        Thread.sleep(2000);
        driver.findElement((By.xpath("//input[@placeholder='Name']"))).sendKeys("deva");
       driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("dev@gmail.com");
       driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
       driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("ram@gmail.com");
       driver.findElement(By.xpath("//form/input[@placeholder='Phone Number']")).sendKeys("12345678");
       driver.findElement(By.xpath("//button[text()='Reset Login']")).click();
       System.out.println(driver.findElement(By.xpath("//p[contains(text(),'Please use temporary password')]")).getText());
//        driver.close();
    }
}
