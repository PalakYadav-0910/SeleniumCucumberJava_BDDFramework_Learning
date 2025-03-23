package StepDefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class GoogleSearchSteps {

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

    @And("user is on google search page")
    public void user_is_on_google_search_page() {

        // Write code here that turns the phrase above into concrete actions

        System.out.println("user is on google search page");
        driver.navigate().to("https://www.google.com/");

    }

    @When("user enters a text in search box")
    public void user_enters_a_text_in_search_box() {

        // Write code here that turns the phrase above into concrete actions
        System.out.println("user enters a text in search box");
        driver.findElement(By.name("q")).sendKeys("Automation Step by Step");

    }

    @And("hits enter")
    public void hits_enter() {

        // Write code here that turns the phrase above into concrete actions
        System.out.println("hits enter");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

    }

    @Then("user is navigated to search results")
    public void user_is_navigated_to_search_results() {

        // Write code here that turns the phrase above into concrete actions
        System.out.println("user is navigated to search results");
        driver.getPageSource().contains("Online Courses");

        //Close the driver
        driver.close();
        driver.quit();

    }
}
