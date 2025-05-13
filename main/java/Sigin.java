import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import java.time.Duration;

public class Sigin
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    driver.get("https://rahulshettyacademy.com/locatorspractice/");
//        driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Devendra");
//        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("Devendra");
//        driver.findElement(By.className("submit")).click();
//       System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
//       driver.findElement(By.linkText("Forgot your password?")).click();
//       Thread.sleep(2000);
//       driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Snehal");
//        driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("snehal@gmail.com");
//        driver.findElement(By.xpath("//form//input[3]")).sendKeys("12345");
//        driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
//        System.out.println(driver.findElement(By.xpath("//form/p[@class='infoMsg']")).getText());
//        driver.findElement(By.xpath("//*[@class='forgot-pwd-btn-conainer']//button[1]")).click();
//        Thread.sleep(1000);
        String name="Deva";
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys(name);
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.xpath("//*[@id='chkboxOne']")).click();
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
        Thread.sleep(2000);
        Assert.assertEquals(driver.findElement(By.xpath("//*[contains(text(),'successfully')]")).getText(),"You are successfully logged in.");
       Assert.assertEquals(driver.findElement(By.xpath("//*[@class='login-container']/h2")).getText(),"Hello "+name+",");
        driver.findElement(By.xpath("//*[text()='Log Out']")).click();




    }
}
