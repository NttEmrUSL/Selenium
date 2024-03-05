package Selenium.day27;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class StaticTableDemo {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        // 1) Find total number of rows

        //Approach 1
        List<WebElement> rows = driver.findElements(By.cssSelector("table[name='BookTable'] tbody tr"));
        System.out.println("Total number of rows : " + rows.size()); //7

        //Approach 2
        //int rows = driver.findElements(By.tagName("tr")).size();
        //System.out.println("Total number of rows : " + rows); //8  prefered only if you have one single table

        // 2) Find total number of columns
        List<WebElement> columns = driver.findElements(By.cssSelector("table[name='BookTable'] tbody tr th"));
        System.out.println("Total number of columns : " + columns.size()); //4

        // 3) Read specific row & column data
        WebElement data = driver.findElement(By.cssSelector("table[name='BookTable'] tr:nth-child(5) td:nth-child(1)"));
        System.out.println("Data is :" + data.getText());

        // 4) Read data from all the rows & columns

        for(int r = 2; r <= rows.size(); r++)
        {
            for (int c=1; c<=columns.size(); c++)
            {
                String value = driver.findElement(By.cssSelector("table[name='BookTable'] tr:nth-child("+r+") td:nth-child("+c+")")).getText();
                System.out.println(value+"         ");
            }
            System.out.println();
        }

        // 5) Print book names whose author is  Amit

        for(int r = 2; r <= rows.size(); r++)
        {
            String author =driver.findElement(By.cssSelector("table[name='BookTable'] tbody tr:nth-child("+r+") td:nth-child(2)")).getText();

            if (author.equals("Amit")) {
                String bookName = driver.findElement(By.cssSelector("table[name='BookTable'] tbody tr:nth-child("+r+") td:nth-child(1)")).getText();
                System.out.println(author + "  " +bookName);
            }

        }

        // 6) Find sum of prices for all the books

        int sum = 0;
        for(int r = 2; r <= rows.size(); r++)
        {
            String price = driver.findElement(By.cssSelector("table[name='BookTable'] tbody tr:nth-child("+r+") td:nth-child(4)")).getText();
            sum = sum + Integer.parseInt(price);
            

        }

        System.out.println("Total price of all the books : " + sum);

    }
}
