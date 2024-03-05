package Selenium.day26;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HandleBrowserWindows {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();

		driver.findElement(By.cssSelector("a[href='http://www.orangehrm.com']")).click();

		//capture id's for browser windows

		Set<String> windowsIDs = driver.getWindowHandles(); // store 2 window id's

		List <String>windowidList = new ArrayList(windowsIDs); // converted Set --> List

		String parentWindowID = windowidList.get(0);
		String childWindowID = windowidList.get(1);

		// Switch to child window
		driver.switchTo().window(childWindowID);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div[class='d-flex web-menu-btn'] li:nth-child(1) a:nth-child(1)")).click();

		// Switch to parent window
		driver.switchTo().window(parentWindowID);
		driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys("admin");
	}
}
