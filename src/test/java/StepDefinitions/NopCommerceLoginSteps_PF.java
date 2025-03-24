package StepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageFactory.LoginPage_PF;
import pages.DashboardPage;

import java.util.concurrent.TimeUnit;

public class NopCommerceLoginSteps_PF {

    WebDriver driver = null;
    LoginPage_PF loginPage;

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
        driver.navigate().to("https://admin-demo.nopcommerce.com/login");

    }

    @When("user enters username and password")  //Regex
    public void user_enters_username_and_password() {

        // Write code here that turns the phrase above into concrete actions

        System.out.println("user enters username and password");
        loginPage = new LoginPage_PF(driver);
        loginPage.enterUsername("admin@yourstore.com");
        loginPage.enterPassword("admin");

    }

    @And("user clicks on Login Button")
    public void user_clicks_on_login_button() {

        // Write code here that turns the phrase above into concrete actions

        System.out.println("user clicks on login button");
        loginPage.clickLoginBtn();

    }

    @Then("user is navigated to Dashboard Page")
    public void user_is_navigated_to_dashboard_page() {

        // Write code here that turns the phrase above into concrete actions

        System.out.println("user is navigated to Dashboard Page");
        DashboardPage dashboardPage = new DashboardPage(driver);
        dashboardPage.clickLogout();

        driver.close();
        driver.quit();

    }
}
