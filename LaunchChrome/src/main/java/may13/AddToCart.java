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
        String[] names={"Cauliflower","Beetroot","Tomato"};
        List<String>item_name= Arrays.asList(names);
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
       List<WebElement>items= driver.findElements(By.cssSelector("h4.product-name"));

       for(int i=0;i<items.size();i++)
       {
           String test_name=items.get(i).getText();
           //Tomato - 1 Kg
           String[] newName=test_name.split("-");
          String final_name= newName[0].trim();
          if(item_name.contains(final_name))
          {
             driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
          }
       }
       driver.close();
    }
}
