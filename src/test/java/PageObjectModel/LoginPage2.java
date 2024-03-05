package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class LoginPage2 {

    public WebDriver driver;

    //Constructor
    LoginPage2(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    // WebElements Locators+identification
    @FindBy(css = ".oxd-icon.bi-person.oxd-input-group__label-icon")
    // @FindBy(how = How.CSS, using = ".oxd-icon.bi-person.oxd-input-group__label-icon")
    WebElement img_logo;
    @FindBy(css = "input[placeholder='Username']")
    WebElement txt_username;

    @FindBy(css = "input[placeholder='Password']")
    WebElement txt_password;

    @FindBy(css = "button[type='submit']")
    WebElement btn_submit;

    //@FindBy(tagName = "a")
    //List<WebElement> links;

    // Action Methods
    public void setUserName(String userName)
    {
        txt_username.sendKeys(userName);
    }
    public void setPassword(String password)
    {
        txt_password.sendKeys(password);
    }
    public void clickSubmit()
    {
        btn_submit.click();
    }
    public boolean checkLogoPresence()
    {
        boolean status = img_logo.isDisplayed();
        return status;
    }
}
