package cucumberRunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features = "src/test/java/featureFiles",
        glue = { "stepDefinitions" },
        strict = false,
        plugin = {"pretty", "html:target/cucumber"}   )

public class TestRunner extends AbstractTestNGCucumberTests {


}
