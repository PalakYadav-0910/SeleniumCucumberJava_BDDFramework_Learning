package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class DashboardPage {

    protected WebDriver driver;

    public DashboardPage(WebDriver driver) {
        this.driver = driver;

        //To Verify if we are on Dashboard Page
        if(!driver.getTitle().equals("")){
            throw new IllegalStateException("This is not Dashboard page. The Current page is : "
                    + driver.getCurrentUrl());
        }
    }

    private By lnk_Logout = By.xpath("//a[text()= 'Logout']");

    public void clickLogout(){

        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        driver.findElement(lnk_Logout).click();

    }
}
