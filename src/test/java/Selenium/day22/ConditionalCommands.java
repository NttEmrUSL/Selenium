package Selenium.day22;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalCommands {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        driver.manage().window().maximize();

        boolean status = driver.findElement(By.cssSelector("img[alt='nopCommerce demo store']")).isDisplayed();
        System.out.println(status);

        //isDisplayed(), isEnabled()
        WebElement searchbox = driver.findElement(By.xpath("//*[@id=\"small-searchterms\"]"));
        System.out.println("Display status: "+ searchbox.isDisplayed());
        System.out.println("Enable status: "+ searchbox.isEnabled());

        //isSelected()

        WebElement male_rd = driver.findElement(By.cssSelector("#gender-male"));
        WebElement female_rd = driver.findElement(By.cssSelector("#gender-female"));

        //Before selection
        System.out.println("Beforee selection.....");
        System.out.println(male_rd.isSelected());   //false
        System.out.println(female_rd.isSelected()); //false

        //After selection of male radio button
        System.out.println("After selection of male radio button .....");
        male_rd.click();
        System.out.println(male_rd.isSelected());   //true
        System.out.println(female_rd.isSelected()); //false

        //After selection of female radio button
        System.out.println("After selection of female radio button .....");
        female_rd.click();
        System.out.println(male_rd.isSelected());   //false
        System.out.println(female_rd.isSelected()); //true

    }
}
