package may14;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class Practice
{
    public static void main(String[] args) throws InterruptedException
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        //1.size of all link present in webpage
        System.out.println(driver.findElements(By.tagName("a")).size());

        //2.count of link present only in footer section
        //Limiting webdriver scope
        WebElement mini_driver= driver.findElement(By.id("gf-BIG"));
        System.out.println(mini_driver.findElements(By.tagName("a")).size());
        System.out.println("My Way="+ driver.findElements(By.xpath("//div[@id='gf-BIG']//a")).size());

        //3.All links present in fisrt column of footer
        WebElement columndriver=mini_driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println("column links="+columndriver.findElements(By.tagName("a")).size());

        //4 click on all links present in footer column from footer section only
//        for(int i=1;i<column_driver.findElements(By.tagName("a")).size();i++)
//        {
//          //  String clickOnLinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
//             String clickonlinkTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
//           // column_driver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
//            column_driver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
//            Thread.sleep(5000L);
//        }
        for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
        {

            String clickonlinkTab=Keys.chord(Keys.COMMAND,Keys.ENTER);

            columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinkTab);
            Thread.sleep(5000L);


        }



}
}