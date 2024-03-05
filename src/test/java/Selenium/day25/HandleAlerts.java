package Selenium.day25;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HandleAlerts {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        WebDriverWait mywait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("button[onclick='jsConfirm()']")).click();

      //  driver.switchTo().alert().accept();

        //Alert alertwindow = driver.switchTo().alert();
        Alert alertwindow = mywait.until(ExpectedConditions.alertIsPresent());
        System.out.println(alertwindow.getText());

        alertwindow.accept(); // this will close alert window using OK button
        //alertwindow.dismiss(); // close alert window by using cancel button


    }
}
