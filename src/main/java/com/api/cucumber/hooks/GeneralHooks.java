package com.api.cucumber.hooks;

import com.genericMethods.GM;
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
     */

    @Before
    public void setup() {
        GM.info(" **** Before Hook **** ");
    }

    @After
    public void tearDown() {
        GM.info(" **** After Hook **** ");
    }
}
