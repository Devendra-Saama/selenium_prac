package may13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class ImplicitWait
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
         //implicit wait
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String []arr={"Brocolli","Cucumber","Carrot"};
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        addCart(driver,arr);
        driver.findElement(By.xpath("//img[@alt='Cart']")).click();
        driver.findElement(By.xpath("//div[@class='action-block']//button[text()='PROCEED TO CHECKOUT']")).click();

        //Explicit Wait
        WebDriverWait w=new WebDriverWait(driver, Duration.ofSeconds(5));
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.className("promoBtn")).click();
        //Explicit Wait
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
    }
    public static void addCart(WebDriver driver,String []arr)
    {
        List<WebElement> list=driver.findElements(By.cssSelector("h4.product-name"));
        int j=0;
        List<String>item_name= Arrays.asList(arr);
        for(int i=0;i<list.size();i++)
        {
            String name=list.get(i).getText();
            //Brocolli - 1 Kg
            String []f_name =name.split("-");
            String final_name=f_name[0].trim();
            if(item_name.contains(final_name))
            {
                j++;
                driver.findElements(By.xpath("//div[@class='product-action']//button")).get(i).click();
                if(j==arr.length)
                    break;
            }
        }

    }
}
