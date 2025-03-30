package StepDefinitions;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/FeatureWithTags/",
        glue= {"StepDefinitions"},
        tags = "@smoke or @regression"
 )
public class TestRunner_RunWithSingleTag {
}