package Selenium.day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class NavigationalCommands {

    public static void main(String[] args)  {

        WebDriver driver = new ChromeDriver();

        driver.navigate().to("https://www.amazon.com.tr/");
        System.out.println(driver.getCurrentUrl());

        driver.navigate().to("https://www.flipkart.com/");
        System.out.println(driver.getCurrentUrl());

        driver.navigate().back();
        System.out.println(driver.getCurrentUrl());

        driver.navigate().forward();
        System.out.println(driver.getCurrentUrl());

    }
}
