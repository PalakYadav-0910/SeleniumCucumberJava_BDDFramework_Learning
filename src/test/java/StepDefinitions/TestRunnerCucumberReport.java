package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features",
        glue= {"StepDefinitions"},
        monochrome = true,
        plugin = {"json:target/cucumber.json"}
)

public class TestRunnerCucumberReport {
}
