package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = ".\\Features Files\\Login.feature",
		glue = "stepDefinition",
		monochrome = true,
		dryRun = false,
		plugin = {"pretty", 
				"html:test-output"}
		
		)
		


public class Runner {

}
