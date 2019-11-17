package com.api.cucumber.transform;

import cucumber.api.Transformer;

/**
 * Transformer<String> Use of String class returns string data.
 */
public class TransformDataString extends Transformer<String> {

    /**
     * @param s
     * @return String data.
     */
    @Override
    public String transform(String s) {
        return s + "/endpoint";
    }
}
