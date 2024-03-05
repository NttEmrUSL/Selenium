package Selenium.day18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Locators1 {

    public static void main (String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        //open app
        driver.get("https://www.avansas.com/");
        driver.manage().window().maximize();

        //search box
        driver.findElement(By.name("q")).sendKeys("Zımba");

        //search button
        driver.findElement(By.xpath("//*[@id=\"multiple-datasets\"]/button")).click();

        WebDriverWait wdwait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement consent = wdwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"responsive-image-16401899939790\"]/a")));
        driver.findElement(By.xpath("//*[@id=\"close-button-1454703513202\"]/span")).click();
        wdwait.until(ExpectedConditions.invisibilityOf(consent));

        //link text & partial text
        driver.findElement(By.xpath("//*[@id=\"main\"]/div[3]/div[2]/div/div/div/div[2]/div/div/div/div[3]/div[1]/div/div[1]/div[2]/a")).click();
        //driver.findElement(By.partialLinkText("Std HS-2000 Profesyonel")).click();

        
    }
}
