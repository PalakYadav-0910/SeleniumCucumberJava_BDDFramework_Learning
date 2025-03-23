package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SauceDemoLoginSteps {

    WebDriver driver = null;

    @Given("browser is open")
    public void browser_is_open() {

        // Write code here that turns the phrase above into concrete actions

        System.out.println("browser is open");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();

    }

    @Given("user is on Login Page") //Regex
    public void user_is_on_login_page() {

        // Write code here that turns the phrase above into concrete actions

        System.out.println("user is on Login Page");
        driver.navigate().to("https://www.saucedemo.com/");

    }

    @When("^user enters (.*) and (.*)$")  //Regex
    public void user_enters_username_and_password(String username, String password) {

        // Write code here that turns the phrase above into concrete actions

        System.out.println("user enters username and password");
        driver.findElement(By.name("user-name")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);

    }

    @And("user clicks on Login Button")
    public void user_clicks_on_login_button() {

        // Write code here that turns the phrase above into concrete actions

        System.out.println("user clicks on login button");
        driver.findElement(By.name("login-button")).click();

    }

    @Then("user is navigated to Home Page")
    public void user_is_navigated_to_home_page() {

        // Write code here that turns the phrase above into concrete actions

        System.out.println("user is navigated to Home Page");
        driver.getPageSource().contains("Products");
        driver.close();
        driver.quit();

    }

}