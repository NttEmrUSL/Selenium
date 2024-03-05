package Selenium.day28;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DatePickerDemo {

    public static void main(String[] args){

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://jqueryui.com/datepicker/");
        driver.manage().window().maximize();

        driver.switchTo().frame(0); //switch to frame //iframe e geçiş yapmayı sağlar.

        //Approach 1
        driver.findElement(By.cssSelector("#datepicker")).sendKeys("10/15/2022"); // mm/dd/YYYY

        //Approach 2
        String year = "2023";
        String month = "September";
        String date = "25";

        driver.findElement(By.cssSelector("#datepicker")).click(); //will open the date picker

        //select month & year
        while(true)
        {
            String mon = driver.findElement(By.cssSelector(".ui-datepicker-month")).getText();
            String yr = driver.findElement(By.cssSelector(".ui-datepicker-year")).getText();

            if(mon.equals(month) && yr.equals(year))
            {
                break;
            }

            driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-e")).click();  //Future Date
            driver.findElement(By.cssSelector(".ui-icon.ui-icon-circle-triangle-w")).click();  //Past Date
        }

        //select date
        List<WebElement> allDates = driver.findElements(By.cssSelector(".ui-datepicker-calendar tbody tr td"));

         for(WebElement dt:allDates)
        {
            if(dt.getText().equals(date))
            {
                dt.click();
                break;
            }
        }

        /*for (int i=0; i<allDates.size(); i++)
        {
            if(allDates.get(i).getText().equals(date))
            {
                allDates.get(i).click();
                break;
            }
        } */
    }
}
