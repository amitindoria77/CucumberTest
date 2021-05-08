package cucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

// Backgrounds and Hooks in feature file
// Backgrounds are the part of feature file , these are the common steps that we need perform in each execution
// Hooks are not the part of feature file
// Hooks are setup file and tear down methods
// Hooks can be written in the step definition file or in separate config class
// Two pre condtions as a hook but cant be written in feature file
// @Before 
// m1(order =1)
// @Before
// m2(order=2)

@RunWith(Cucumber.class)
@CucumberOptions(
		        features={"src/test/java/Features"},
		        glue={"StepDefinitions","Hooks"},
		        // we can also add "not Regression" tag it wont run regression also we can use or,and and all annotaions
		        tags="@Regression",
		        plugin={"pretty","json:/target/JsonReports/report.json"})

public class TestRunner {

}

