package Selenium.day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

    public static void main(String[] args) throws InterruptedException {

        //  WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        Thread.sleep(3000);
        driver.findElement(By.linkText("OrangeHRM, Inc")).click();

       // driver.close(); // close single browser window
        driver.quit(); // close all browser windows
    }
}
