package Selenium.day18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class Locators2 {

    public static void main (String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.avansas.com/");
        driver.manage().window().maximize();

        //Finding number of image home page
        List<WebElement> sliders=driver.findElements(By.className("image-banner"));
        System.out.println("Total Number of Images:" + sliders.size());

        //Find total number of links
        List<WebElement> links = driver.findElements(By.tagName("a"));

        System.out.println("Total Number of Links: " + links.size());

        driver.quit();
    }
}
