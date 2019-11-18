package com.api.cucumber.transform;

import cucumber.api.Transformer;

/**
 * Transformer<String> Use of String class returns string data.
 */
public class TransformDataString extends Transformer<String> {

    /**
     * @param endpointValue
     * @return String data.
     */
    @Override
    public String transform(String endpointValue) {
        return endpointValue + "/endpointFromUserDefinedString";
    }
}
