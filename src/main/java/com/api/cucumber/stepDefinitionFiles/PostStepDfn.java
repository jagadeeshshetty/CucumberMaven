package com.api.cucumber.stepDefinitionFiles;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class PostStepDfn {
    @Given("I login")
    public void i_login() {
        System.out.println("Executing 'I login' step.");
    }

    @When("I logout")
    public void i_logout() {
        System.out.println("Executing 'I logout' step.");
    }
}
