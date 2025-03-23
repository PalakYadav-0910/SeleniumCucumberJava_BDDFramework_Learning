package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    By txt_username = By.id("Email");
    By txt_passwprd = By.id("Password");
    By btn_login = By.xpath("//button[text()=\"Log in\"]");

    public void enterUsername(String username){
        driver.findElement(txt_username).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(txt_passwprd).sendKeys(password);
    }

    public void clickLogin(){
        driver.findElement(btn_login).click();
    }

    public void loginValidUser(String username, String password){
        driver.findElement(txt_username).sendKeys(username);
        driver.findElement(txt_passwprd).sendKeys(password);
        driver.findElement(btn_login).click();
    }
}
