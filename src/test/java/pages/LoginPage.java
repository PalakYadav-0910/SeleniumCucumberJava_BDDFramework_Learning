package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;

        //To Verify if we are on Login Page
        if(!driver.getTitle().equals("nopCommerce demo store. Login")){
            throw new IllegalStateException("This is not Login Page. The Current page is : "
            + driver.getCurrentUrl());
        }
    }

    By txt_username = By.id("Email");
    By txt_password = By.id("Password");
    By btn_login = By.xpath("//button[text()=\"Log in\"]");

    public void enterUsername(String username){
        driver.findElement(txt_username).clear();
        driver.findElement(txt_username).sendKeys(username);
    }

    public void enterPassword(String password){
        driver.findElement(txt_password).clear();
        driver.findElement(txt_password).sendKeys(password);
    }

    public void clickLogin(){
        driver.findElement(btn_login).click();
    }

    public void loginValidUser(String username, String password){
        driver.findElement(txt_username).clear();
        driver.findElement(txt_username).sendKeys(username);

        driver.findElement(txt_username).clear();
        driver.findElement(txt_password).sendKeys(password);
        driver.findElement(btn_login).click();
    }
}
