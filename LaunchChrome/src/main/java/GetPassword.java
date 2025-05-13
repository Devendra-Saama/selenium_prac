import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class GetPassword
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.id("inputUsername")).sendKeys("Devendra");
        Thread.sleep(1000);
        String password=getPassword(driver);
        driver.findElement(By.xpath("//button[text()='Go to Login']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@type='password']")).sendKeys(password);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
    }

    public static String getPassword(WebDriver driver) throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(2000);
            driver.findElement(By.xpath("//*[text()='Reset Login']")).click();
            String text=driver.findElement(By.cssSelector("p.infoMsg")).getText();
            //Please use temporary password 'rahulshettyacademy' to Login.
            String [] array=text.split("'");
             String pass= array[1].split("'")[0];

             return pass;

        }
}
