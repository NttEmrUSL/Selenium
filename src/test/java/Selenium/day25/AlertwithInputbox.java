package Selenium.day25;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AlertwithInputbox {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("button[onclick='jsPrompt()']")).click();

        Alert alertwindow = driver.switchTo().alert();
        System.out.println(alertwindow.getText());

        alertwindow.sendKeys("welcome");

        alertwindow.accept();

        //validation
        String act_text = driver.findElement(By.cssSelector("#result")).getText();
        String exp_text = "You entered: welcome";

        if(act_text.equals(exp_text))
        {
            System.out.println("Test passed");
        }
        else
        {
            System.out.println("Test failed");
        }



    }
}
