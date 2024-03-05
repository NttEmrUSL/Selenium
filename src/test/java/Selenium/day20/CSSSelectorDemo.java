package Selenium.day20;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelectorDemo {

    public static void main (String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        //css with tag & id
        //driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("Macbook");
        //driver.findElement(By.cssSelector("#small-searchterms")).sendKeys("Macbook");

        //tag class
        // driver.findElement(By.cssSelector(".search-box-text")).sendKeys("Macbook");

        //tag & attribute
        // driver.findElement(By.cssSelector("input[name='q']")).sendKeys("Macbook");
         driver.findElement(By.cssSelector("[name='q']")).sendKeys("Macbook");

        //tag & class & attribute
       //driver.findElement(By.cssSelector("input.search-box-text[name=’q’]")).sendKeys("Macbook");
    }
}
