package com.api.cucumber.hooks;

import com.genericMethods.GM;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * Hooks are the methods which are automatically invoked by cucumber framework.
 * Two types of Hooks which executes before and after the scenario.
 * 1. Before
 * 2. After
 * To use hooks, add class path to the Runner.class (same as step definition).
 */
public class GeneralHooks {
    /**
     * Steps:
     * 1. Create the public method.
     * 2. Use the @Before and @After annotations.
     * 3. Specify the package in the runner.
     * 4. [Optional] To get the run time info about the scenario, inject the Scenario Object in the hook method.
     */

    @Before
    public void setup(Scenario name) {
        GM.print("**** Before Hook **** ");
        GM.print("Scenario Name: " + name.getName() + "\n");
    }

    @After
    public void tearDown(Scenario name) {
        GM.print("**** After Hook **** ");
        GM.print("Test execution status: " + name.getStatus());
    }
}
