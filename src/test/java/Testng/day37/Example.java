package Testng.day37;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class Example {
    WebDriver driver;

    @BeforeClass

    void setup() throws InterruptedException {


        driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);
    }

    @Test(priority=1)
    void testLogo()
    {
        try
        {
            boolean status=driver.findElement(By.cssSelector("div[class='orangehrm-login-logo-mobile'] img[alt='orangehrm-logo']")).isDisplayed();
            //boolean status=driver.findElement(By.tagName("img")).isDisplayed();
            Assert.assertEquals(status,true);
            //maximize div[class='orangehrm-login-logo'] img[alt='orangehrm-logo']
            //mobile div[class='orangehrm-login-logo-mobile'] img[alt='orangehrm-logo']
            //tagname img
        }
        catch(Exception e)
        {
            Assert.fail();
        }
    }

    @Test(priority=2)
    void testHomePageTitle()
    {
        Assert.assertEquals(driver.getTitle(),"OrangeHRM","Titles are bot matched..");

    }

    @AfterClass
    void closeApp()
    {
        driver.quit();
    }
}
