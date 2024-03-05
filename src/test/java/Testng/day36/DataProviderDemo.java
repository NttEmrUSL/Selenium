package Testng.day36;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

    WebDriver driver;

    @BeforeClass
    void setup()
    {
        driver = new ChromeDriver();
    }

    @Test(dataProvider = "dp")
    void testLogin(String email, String pwd)
    {
        driver.get("https://demo.nopcommerce.com/login?returnUrl=%2Fcart");
        driver.manage().window().maximize();
        driver.findElement(By.id("Email")).sendKeys(email);
        driver.findElement(By.id("Password")).sendKeys(pwd);
        driver.findElement(By.cssSelector("button[class='button-1 login-button']")).click();

        String exp_title = "nopCommerce demo store. Shopping Cart";
        String act_title = driver.getTitle();

        Assert.assertEquals(exp_title, act_title);

    }

    @AfterClass
    void tearDown()
    {
        driver.close();

    }

    @DataProvider(name = "dp", indices = {0,3})
    String[][] loginData()
    {
        String data[][] = {
                {"testdata@gmail.com", "1234test"}, // true
                {"testdata@gmail.com", "12345test"},
                {"somemail@gmail.com", "12345test"},
                {"testdata2@gmail.com", "123test"}, // true
                {"testdata2@gmail.com", "12345test"},
        };

        return data;
    }
}
