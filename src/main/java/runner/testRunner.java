package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "C:\\Users\\Parul Gulati\\eclipse-workspace\\Swym\\src\\main\\java\\features\\productPage.feature",
glue = "definition",
format= {"pretty","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucmumber.xml"},
dryRun = false
		)



public class testRunner {

}
