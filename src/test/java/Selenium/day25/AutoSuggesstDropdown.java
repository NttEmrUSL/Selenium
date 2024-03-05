package Selenium.day25;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class AutoSuggesstDropdown {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("#APjFqb")).sendKeys("selenium");
        Thread.sleep(3000);

        List<WebElement> list = driver.findElements(By.xpath("//div[@class='wM6W7d']//span"));

        System.out.println("Number of Suggestions : " + list.size());

        //select an option from list
        for(int i=0; i<list.size(); i++)
        {
            String text=list.get(i).getText();

            if(text.equals("selenium tutorial"))
            {
                list.get(i).click();
                break;
            }
        }


    }
}
