package may14;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.Function;

public class FluentWait
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        //Explicit Wait
        WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(2));
        w.until(ExpectedConditions.visibilityOfElementLocated(By.id("div[id='start'] button")));
        driver.findElement(By.cssSelector("div[id='start'] button")).click();
        //Fluent Wait
        Wait<WebDriver> wait=new org.openqa.selenium.support.ui.FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
                .pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);

        WebElement test=wait.until(new Function<WebDriver, WebElement>()
        {
            public WebElement apply(WebDriver driver)
            {
                if(driver.findElement(By.cssSelector("div[id='finish'] h4")).isDisplayed()) {
                    return driver.findElement(By.cssSelector("div[id='finish'] h4"));
                }
                else
                    return null;
            }
        });

        System.out.println(driver.findElement(By.cssSelector("div[id='finish'] h4")).getText());
    }
}
