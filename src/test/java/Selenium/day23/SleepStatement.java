package Selenium.day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SleepStatement {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

       // Thread.sleep(5000);

        driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("Admin");
    }
}
