package Selenium.day28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DropDownHiddenOptions {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.cssSelector("button[type='submit']")).click();

        driver.findElement(By.cssSelector("aside[class='oxd-sidepanel'] li:nth-child(2)")).click();

        driver.findElement(By.cssSelector("div:nth-child(6) div:nth-child(1) div:nth-child(2) div:nth-child(1) div:nth-child(1) div:nth-child(2) i:nth-child(1)")).click(); //open the dropdown

        List<WebElement> options = driver.findElements(By.xpath("//div[@role='listbox']//span"));

        for(WebElement option:options)
        {
            if(option.getText().equals("Sales Representative"))
            {
                option.click();
                break;
            }
        }
    }
}
