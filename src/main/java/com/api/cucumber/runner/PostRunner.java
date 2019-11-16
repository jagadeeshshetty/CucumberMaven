package com.api.cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "pretty",
        features = {"src/main/java/com/api/cucumber/featureFiles"},
        glue = {"com.api.cucumber.stepDefinitionFiles"}
//        dryRun = true
//        monochrome = true
)
public class PostRunner {

}
