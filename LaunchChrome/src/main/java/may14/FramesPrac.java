package may14;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesPrac
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
        //iframe based on index
        //driver.switchTo().frame(0);

        //How many iframe tag present
        System.out.println(driver.findElements(By.tagName("iframe")).size());
        WebElement source= driver.findElement(By.id("draggable"));
        WebElement destination=driver.findElement((By.xpath("//div[@id='droppable']")));
        //Action -Drag and Drop
        Actions a=new Actions(driver);
        a.dragAndDrop(source,destination).build().perform();
        //swicth to normal window
        driver.switchTo().defaultContent();

    }
}
