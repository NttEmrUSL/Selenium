package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    
    public WebDriver driver;

    //Constructor
    LoginPage(WebDriver driver)
    {
        this.driver = driver;
    }

    // Locators
    By img_logo_loc = By.tagName("img");
    By txtbox_username_loc = By.cssSelector("input[placeholder='Username']");
    By txtbox_password_loc = By.cssSelector("input[placeholder='Password']");
    By btn_submit_loc = By.cssSelector("button[type='submit']");


    // Action Methods
    public void setUserName(String userName)
    {
        driver.findElement(txtbox_username_loc).sendKeys(userName);
    }
    public void setPassword(String password)
    {
        driver.findElement(txtbox_password_loc).sendKeys(password);
    }
    public void clickSubmit()
    {
        driver.findElement(btn_submit_loc).click();
    }
    public boolean checkLogoPresence()
    {
        boolean status = driver.findElement(img_logo_loc).isDisplayed();
        return status;
    }
}
