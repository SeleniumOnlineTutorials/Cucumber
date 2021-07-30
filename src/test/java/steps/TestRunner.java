package steps;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;


@CucumberOptions(
		features = {"src/test/java/Features/DemoQA.feature"} , 
		plugin = {"json:target/cucumber.json", "pretty"},
        glue = "steps"
        )

public class TestRunner {

}
