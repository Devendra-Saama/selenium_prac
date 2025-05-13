package may13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class AddToCart
{
    public static void main(String[] args)
    {
        WebDriver driver=new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        String[] items={"Brocolli","Beetroot","Tomato","Brinjal"};
        List<String>itemList=Arrays.asList(items);
        List<WebElement>list=driver.findElements(By.cssSelector("h4.product-name"));
        int j=0;
        for(int i=0;i<list.size();i++)
        {
            String name=list.get(i).getText();
            //Brocolli - 1 Kg
            String []f_name=name.split("-");
            String final_name=f_name[0].trim();
            if(itemList.contains(final_name))
            {
                j++;
                driver.findElements(By.xpath("//div[@class='product-action']//button")).get(i).click();
              if(j==items.length)
                  break;
            }
        }

    }
}
