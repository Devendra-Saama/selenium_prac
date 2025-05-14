package may14;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice1
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        // Scope limited to footer section
        WebElement footerSection = driver.findElement(By.id("gf-BIG"));

        // Locate the first column within the footer
        WebElement column = footerSection.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));

        int linkCount = column.findElements(By.tagName("a")).size();
        System.out.println("Column link count: " + linkCount);

        // Open all links in new tabs, starting from 1 to skip the first if needed
        for (int i = 1; i < linkCount; i++) {
            // Re-locate column and links each time to avoid stale element error
            WebElement updatedColumn = driver.findElement(By.id("gf-BIG"))
                    .findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
            WebElement link = updatedColumn.findElements(By.tagName("a")).get(i);
            String openInNewTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
            link.sendKeys(openInNewTab);
            Thread.sleep(3000); // wait for the tab to open
        }

    }
}
