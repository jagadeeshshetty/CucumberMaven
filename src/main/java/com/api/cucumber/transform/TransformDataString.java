package com.api.cucumber.transform;

import cucumber.api.Transformer;

/**
 * Transformer<String> Use of String class returns string data.
 */
public class TransformDataString extends Transformer<String> {

    /**
     * @param s
     * @return String data.
     * @throws Throwable
     */
    @Override
    public String transform(String s) throws Throwable {
        return s + "/endpoint";
    }
}
