package com.api.cucumber.stepDefinitionFiles;

import com.api.cucumber.transform.TransformDataString;
import cucumber.api.DataTable;
import cucumber.api.Transform;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.List;

public class StepDefinition {
    @Given("A precondition")
    public void a_precondition() {
        log("Still need to figure out a precondition!");
    }

    @When("Perform an action")
    public void perform_an_action() {
        log("Will perform an action.");
    }

    @Then("Validate the action")
    public void validate_the_action() {
        log("Will validate the result from a previous action.");
    }

    @Then("Validate other action")
    public void validate_other_action() {
        log("Additional validation with previous step.");
    }

    @Then("Validate negative action")
    public void validate_negative_action() {
        log("A negative validation step.");
    }

    @When("I login with valid username and password")
    public void i_login_with_valid_username_and_password(DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        List<List<String>> data = dataTable.raw();
        for (List<String> row : data) {
            for (String column : row) {
                log(column);
            }
        }
    }

    private void log(String string) {
        System.out.println("  LOG: " + string);
    }

    @When("^I navigate to \"([^\"]*)\" url with a stringTransform endpoint$")
    public void i_navigate_to_with_an_endpoint(@Transform(TransformDataString.class) String endpointValue) {
        log(endpointValue);
    }
}
