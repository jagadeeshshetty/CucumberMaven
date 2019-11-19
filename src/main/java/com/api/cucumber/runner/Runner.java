package com.api.cucumber.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/main/java/com/api/cucumber/featureFiles"},
        glue = {"com.api.cucumber.stepDefinitionFiles",
                "com.api.cucumber.hooks"},
        tags = "not @arithmeticExceptionFail"
//        tags = "tag1 or tag2"
//        plugin = "pretty",
//        dryRun = true
//        monochrome = true
)
public class Runner {

}
