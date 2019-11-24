package com.api.cucumber.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = {"src/main/java/com/api/cucumber/featureFiles"},
        glue = {"com.api.cucumber.stepDefinitionFiles",
                "com.api.cucumber.hooks"}
)
public class TestNGRunner extends AbstractTestNGCucumberTests {

}
