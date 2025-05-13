package may12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.time.Duration;
import java.util.List;

public class FlightBookWeb
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.xpath("//span[@id='ctl00_mainContent_ddl_originStation1_CTXTaction']")).click();
        driver.findElement(By.xpath("//a[@value='CJB']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']//a[@value='PNQ']")).click();
        driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
        driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
        int i=1;
        Thread.sleep(2000);
        while(i<5)
        {
            driver.findElement(By.id("hrefIncAdt")).click();
            i++;
        }
        driver.findElement(By.xpath("//input[@value='Done']")).click();
       WebElement element= driver.findElement(By.xpath("//div[@class='currency-dropdown']/select[@id='ctl00_mainContent_DropDownListCurrency']"));
        Select option=new Select(element);
        option.selectByValue("AED");

        driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("ind");
        List<WebElement>list=driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
        for(WebElement option1:list)
        {
            if(option1.getText().equalsIgnoreCase("India"))
            {
                option1.click();
            }
        }

        driver.findElement(By.xpath("//input[@value='OneWay' and @id='ctl00_mainContent_rbtnl_Trip_0']")).click();
        if(driver.findElement(By.xpath("//div[@id='Div1']")).getDomAttribute("style").contains("0.5"))
        {
            Assert.assertTrue(true);
            System.out.println("Disable");
        }
     driver.findElement(By.xpath("//input[contains(@name,'friendsandfamily')]")).click();
        driver.findElement(By.xpath("//input[@type='submit' and @value='Search'] ")).click();


    }
}
