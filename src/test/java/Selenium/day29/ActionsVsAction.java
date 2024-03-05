package Selenium.day29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class ActionsVsAction {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver =new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		Actions act=new Actions(driver);
		
		//act.contextClick(button).build().perform();

		Action myaction=act.contextClick(button).build();  // creating action and storing it in variable
		myaction.perform();  // completing action 
		
		//act.contextClick(button).perform(); //right click
	
		
	}

}
