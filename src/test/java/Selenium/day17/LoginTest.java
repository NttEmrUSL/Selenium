package Selenium.day17;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    public static void main (String[] args) throws InterruptedException {

        //WebDriverManager.chromedriver().setup();
        //Make sure you use latest Selenium Version, and you may not use webDriverManager

        //1) Launch Browser
        //ChromeDriver driver=new ChromeDriver();
        WebDriver driver = new ChromeDriver();

        //2) open url on the browser
        // "https://opensource-demo.orangehrmlive.com/"
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize(); //Maximize the page
        Thread.sleep(5000);

        //3) Provide username - Admin
        //WebElement txtUserName = driver.findElement(By.name("username"));
        //txtUserName.sendKeys("Admin");
        driver.findElement(By.name("username")).sendKeys("Admin");

        //4) Provide password - admin123
        driver.findElement(By.name("password")).sendKeys("admin123");

        //5) Click on the Submit Button
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

        //6) Verify the title of dashboard title
        String act_title = driver.getTitle();
        String exp_title = "OrangeHRM";

        if (act_title.equals(exp_title))
        {
            System.out.println("Test Passed");
        }
        else
        {
            System.out.println("Test Failed");
        }

        // Label validation after succesfull login

        String act_label = "";
        try
        {
            act_label = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
        }
        catch (NoSuchElementException ignored) { }

        String exp_label = "Dashboard";

        if (act_title.equals(exp_title))
        {
            System.out.println("Test Passed");
        }
        else
        {
            System.out.println("Test Failed");
        }

        //7)) Close Browser
        //driver.close();
        //driver.quit();

    }
}
