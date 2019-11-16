package com.api.cucumber.runner;

import org.junit.runner.RunWith;
import  io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "pretty",
        features = {"src/main/java/com/api/cucumber/featureFiles"},
        glue = {"com.api.cucumber.stepDefinitionFiles"})
public class PostRunner {

}
