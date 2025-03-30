package StepsForHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HooksDemoSteps {

    WebDriver driver = null;

    @Before(order = 1) //To make it as Hook, we use this annotation
    public void browserSetUp(){
        System.out.println("-----------I am inside Browser Set Up Method----------");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    //@Before("@smoke")
    //@Before(value = "@smoke", order = 1)
    @Before(order = 0) //To make it as Hook, we use this annotation
    public void setUp2(){
        System.out.println("-----------I am inside Set Up 2 Method----------");
    }

    @After //To make it as Hook, we use this annotation
    public void tearDown(){
        System.out.println("-----------I am inside Tear Down Method----------");
        driver.close();
        driver.quit();
    }

    @BeforeStep
    public void beforeStep(){
        System.out.println("-----------I am inside Before Step Method----------");
    }

    @AfterStep
    public void afterStep(){
        System.out.println("-----------I am inside After Step Method----------");
    }

    @Given("user is on Login Page")
    public void user_is_on_login_page() {
        // Write code here that turns the phrase above into concrete actions

    }

    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() {
        // Write code here that turns the phrase above into concrete actions

    }

    @And("clicks on Login Button")
    public void clicks_on_login_button() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Then("user is navigated to Home Page")
    public void user_is_navigated_to_home_page() {
        // Write code here that turns the phrase above into concrete actions

    }
}
