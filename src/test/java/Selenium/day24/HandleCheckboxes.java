package Selenium.day24;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandleCheckboxes {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.ironspider.ca/forms/checkradio.htm");
        driver.manage().window().maximize();

        //select specific checkbox
        //driver.findElement(By.cssSelector("input[value='red']")).click();

        //total number of checkboxes
        List<WebElement> checkboxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
        System.out.println("Total number of checkbox : " + checkboxes.size()); //6

        //select all the checkboxes
        /*for(int i=0; i<checkboxes.size(); i++)
        {
            checkboxes.get(i).click();
        } */

        /* for(WebElement chkbox: checkboxes)
        {
            chkbox.click();
        } */


        //select last 2 checkboxes
        // total number of checkboxes - how many checkboxes to be selected = starting index
        // 7
        // 6-2 = 5 (starting index)

        /*for (int i=4 ; i<checkboxes.size(); i++)
        {
           checkboxes.get(i).click();
        } */

        //clear - Uncheck checkboxes

        for(int i=0; i<checkboxes.size(); i++)
        {
            checkboxes.get(i).click();
        }

        Thread.sleep(4000);

       /* for(int i=0; i<checkboxes.size(); i++)
        {
            if(checkboxes.get(i).isSelected())
            {
                checkboxes.get(i).click();
            }
        }*/

        for (WebElement chkbox: checkboxes)
        {
            if(chkbox.isSelected())
            {
                chkbox.click();
            }
        }
    }
}
