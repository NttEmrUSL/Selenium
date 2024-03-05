package Selenium.day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class GetMethods {

    public static void main(String[] args) throws InterruptedException {

      //  WebDriverManager.chromedriver().setup();
          WebDriver driver = new ChromeDriver();

          //  driver.get("https://www.avansas.com/registerb2c");
          driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
          driver.manage().window().maximize();

          System.out.println("Title of the page: " + driver.getTitle());

          System.out.println("Current URL: " + driver.getCurrentUrl());

          // System.out.println("Current Source: " + driver.getPageSource());
          String ps=driver.getPageSource();
          System.out.println(ps.contains("html"));

          //  System.out.println(driver.getWindowHandle());

          Thread.sleep(3000);
          driver.findElement(By.linkText("OrangeHRM, Inc")).click(); //opens new browser window

          Set<String> windowsids = driver.getWindowHandles();     //98C26784CB4D3CE4C50A35865076263D
                                                                  //B9214A94B95B5F9CD0B161B87A2069F0

          for(String winid: windowsids)
          {
              System.out.println(winid);
          }

    }
}
