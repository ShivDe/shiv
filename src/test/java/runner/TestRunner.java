package runner;

import io.cucumber.junit.CucumberOptions;
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"utility","StepDefinition"},
        plugin = { "pretty","html:target/cucumber-html-report","json:cucumber.json" }

)
public class TestRunner {

}
