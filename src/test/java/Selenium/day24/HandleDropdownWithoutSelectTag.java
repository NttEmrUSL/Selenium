package Selenium.day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class HandleDropdownWithoutSelectTag {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://jquery-az.com/boots/demo.php?ex=63.0_2");
        driver.manage().window().maximize();
        //clicking on the dropdown
        driver.findElement(By.cssSelector("button[title='HTML, CSS']")).click();

        List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,multiselect)]//label"));

        //find total number of options
        System.out.println("Total number of options : " + options.size());

        //print all the options from dropdown

        //using normal for loop
        /*for (int i=0; i<options.size(); i++)
        {
            System.out.println(options.get(i).getText());
        } */

        //select options from dropdown
        /* for (int i=0; i<options.size(); i++)
        {
            if(options.get(i).getText().equals("Java"))
            {
                options.get(i).click();
            }

        } */







    }
}
