# Selenium Cucumber Java BDD Framework
 
* ## Selenium Cucumber Java BDD Framework 1 - Setup

      Step 1 : Create a new Maven Project

      Step 2 : Add Maven Dependencies

               Cucumber Java | Cucumber JUnit | JUnit | Selenium Java

      Step 3 : Create a Folder - Features under src/test/resources

      Step 4 : Under Features folder create a new Feature File - login.feature

      Step 5 : Install Cucumber for Java Plugin from File--> Settings--> Plugins--> Cucumber for Java--> Install--> Apply and Ok

      Step 6 : Create feature file and add Contents
               Contents in feature file :
               - Feature
               - Scenario
               - Steps
               - Scenario Outline
               - Example
               - Tags
               - Comments

      Step 7 : Try to run the feature file
     
      Step 8 : Add Step Definitions/Glue Code under src/test/java package

      Step 9 : Create a Runner Class
  
      Step 10 : Create Add Cucumber Options for generating reports
 
                HTML | JSON | JUNIT / XML

      Step 11 : Run and Verify Results


* ## Selenium Cucumber Java BDD Framework 2 - First Selenium Test

      Step 1 : Add Selenium Java Maven dependency

      Step 2 : Create a feature file and add Scenario and Steps

      Step 3 : Create Step Definition/Glue Code for the steps

      Step 4 : Download browser driver files

      Step 5 : Add Selenium WebDriver code

      Step 6 : Run Feature file and check the execution


* ## Selenium Cucumber Java BDD Framework 3 - Sample Login Test

      Step 1 : Check the scenario/navigation

      Step 2 : Create a feature file and add Scenario and Steps

      Step 3 : Create Step Definition/Glue Code for the steps
 
      Step 4 : Add Selenium WebDriver code

      Step 5 : Run Feature file and check the execution


* ## Selenium Cucumber Java BDD Framework 4 - Parameterization & Data Driven Testing

      Step 1 : In the feature file select the values that needs to be parameterized

      Step 2 : Put the values within conical brackets or double quotes (Parameterization)

      Step 3 : Change Scenario to Scenario Outline

      Step 4 : Add Examples section

      Step 5 : Add data for the parameters in the Examples section

      Step 6 : Update step definition to get values from feature file Examples section

      Step 7 : Run Feature file and check the execution


* ## Selenium Cucumber Java BDD Framework 5 - Page Object Model

   ![img.png](img.png)

   ![img_1.png](img_1.png)

### Steps to Implement POM :

      Step 1 : Create a Class for each page

      Step 2 : Create locators of all objects to be used in that page using By Class
      
      Step 3 : Create methods or actions to be performed on the objects

      Step 4 : Refer in the test scripts

      Step 5 : Run and Validate


* ## Selenium Cucumber Java BDD Framework 6 - Page Factory

![img_2.png](img_2.png)

### Steps to Implement Page Factory Model :

      Step 1 : Create a Class for each page

      Step 2 : Create locators of all objects to be used in that page using @FindBy annotation
      
      Step 3 : Create methods or actions to be performed on the objects

      Step 4 : Create constructor to get driver instance and initialize elements using method initElements

![img_3.png](img_3.png)

      Step 5 : Update Test Scripts to refer methods from PageFactory class
      
      Step 6 : Run and Validate

![img_4.png](img_4.png)

![img_5.png](img_5.png)

![img_6.png](img_6.png)

![img_7.png](img_7.png)


* ## Selenium Cucumber Java BDD Framework 7 - Tags

![img_8.png](img_8.png)

![img_9.png](img_9.png)

      Step 1 : Create a new or use an existing Feature file

      Step 2 : Mark the feature and scenarios with Tags : @TagName

      Step 3 : Create new or use an existing TestRunner Class

      Step 4 : Add the tags in CucumberOptions section
      
      @RunWith(Cucumber.class)
      @CucumberOptions(features = "src/test/resources/Features", 
      glue= {"StepDefinitions"},
      monochrome = true,
      tags = {"@RegressionTest"}
      )
      public class TestRunner_RunWithSingleTag {
      }

      Step 5 : Run test runner class with different combination of tags
      
      - Single Tag -> tags={"@smoke"}

      - Multiple Tags -> Tags with AND/OR conditions
      tags={"@smoke or @regression"}
      tags={"@smoke and @regression"}
      tags={"@smoke or @regression and @important"}
      tags={"(@smoke or @regression) and @important"}

      - Skip or Ignore Tests -> Using not
      tags={"@smoke and not @regression"}

![img_10.png](img_10.png)

![img_12.png](img_12.png)

![img_11.png](img_11.png)

![img_13.png](img_13.png)

### mvn test -Dcucumber.filter.tags="@smoke and @fast"

![img_14.png](img_14.png)


* ## Selenium Cucumber Java BDD Framework 8 - Hooks

![img_15.png](img_15.png)

![img_16.png](img_16.png)

![img_17.png](img_17.png)

## Why to use HOOKS ??

 ### - To manage the setup and tear down
 ### - To avoid re-writing the common setup or teardown actions
 ### - Allow better management of code workflow

## When to use HOOKS ??

 ### Whenever you have some common setup and teardown actions to be executed 
 ### before each scenario then we use hooks.

## How to use HOOKS ??

      Step 1 : Create a new or use an existing Feature file

      Step 2 : Create the steps for the scenario in the feature file

      Step 3 : Create setup and teardown methods and mark with annotation
               @Before       @BeforeSteps
               @After        @AfterSteps

**import io.cucumber.java.After;**

**import io.cucumber.java.AfterStep;**

**import io.cucumber.java.Before;**

**import io.cucumber.java.BeforeStep;**

### So, these functions have become hooks and will be executed before and after every scenario in the feature

![img_19.png](img_19.png)

### Using @BeforeStep and @AfterStep, these hooks will be executed before and after each step

![img_20.png](img_20.png)

       Step 4 : Create new or use an existing TestRunner Class
      
       Step 5 : Run the TestRunner class and check execution

### Ordering of HOOKS : Manage Execution Order of Hooks

**By Default, they will be executed in alphabetical order of method names but we can assign order to them**

![img_21.png](img_21.png)

![img_22.png](img_22.png)

### Tags with HOOKS - Conditional HOOKS

![img_25.png](img_25.png)

**@Before("@smoke")**

**@Before(value = "@smoke", order = 1)**

![img_24.png](img_24.png)

![img_26.png](img_26.png)

![img_27.png](img_27.png)

![img_28.png](img_28.png)


* ## Selenium Cucumber Java BDD Framework 9 - Background

