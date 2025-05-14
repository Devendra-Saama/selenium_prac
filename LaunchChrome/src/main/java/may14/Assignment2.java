package may14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Assignment2
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://the-internet.herokuapp.com");
        driver.findElement(By.linkText("Nested Frames")).click();
        //switch to nested frame
        //First switch outer frame by name
        driver.switchTo().frame("frame-top");
        //Switch to inner frame by WebElement
        driver.switchTo().frame("frame-middle");
        System.out.println(driver.findElement(By.cssSelector("div#content")).getText());
    }
}
