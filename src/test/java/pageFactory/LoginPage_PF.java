package pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class LoginPage_PF {

    WebDriver driver;

    @FindBy(id= "Email")
    @CacheLookup
    WebElement txt_username;

    @FindBy(id= "Password")
    @CacheLookup
    WebElement txt_password;

    @FindBy(className= "button-1 login-button")
    @CacheLookup
    WebElement btn_login;

    public LoginPage_PF(WebDriver driver) {
        this.driver = driver;
        //PageFactory.initElements(driver, LoginPage_PF.class);
        AjaxElementLocatorFactory factory = new AjaxElementLocatorFactory(driver, 30);
        PageFactory.initElements(factory, LoginPage_PF.class);
    }

    public void enterUsername(String username){
        txt_username.clear();
        txt_username.sendKeys(username);
    }

    public void enterPassword(String password){
        txt_username.clear();
        txt_username.sendKeys(password);
    }

    public void clickLoginBtn(){
        btn_login.click();
    }
}
