package Selenium.day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class HandleDropDownSelectTag {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
        driver.manage().window().maximize();

        WebElement dropElement = driver.findElement(By.cssSelector("div[class='single_tab_div resp-tab-content resp-tab-content-active'] p select"));
        Select dropCountry = new Select(dropElement);

        // 1) Selecting an option from the dropdown
        //drpCountry.selectByVisibleText("Bahamas");
        //drpCountry.selectByValue("2"); // use this only if value attribute is present for option tag
        //drpCountry.selectByIndex(3); // Algeria

        // 2) Find total options in dropdown
        List<WebElement> options = dropCountry.getOptions();
        System.out.println("Total number of options : " + options.size());

        // 3) print options in console window
        /*for (int i=0 ; i<options.size(); i++)
        {
            System.out.println(options.get(i).getText());
        } */

        //using enhanced loop
        for (WebElement op:options)
        {
            System.out.println(op.getText());
        }
    }
}
