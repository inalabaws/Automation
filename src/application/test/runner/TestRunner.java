package application.test.runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(format={ "pretty","html:target/cucumber", "json:target/cucumber.json"},
		features = "src/application/test/features/Sample.feature"
		,glue={"src.application.main.stepDef"}
		,dryRun = true
		)
 
public class TestRunner {
 
}

 
 
     