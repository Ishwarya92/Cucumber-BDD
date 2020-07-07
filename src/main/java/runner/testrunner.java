package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
	format = {"pretty","html:target/cucumber-reports/cucumber-pretty"},
features = "src/main/java/feature",
					glue={"stepDefinitions"},
	tags={"@Scenario2"}
)
public class testrunner extends AbstractTestNGCucumberTests {

}
