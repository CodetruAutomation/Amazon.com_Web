package com.OpenMRS.utils;

import java.util.Arrays;
import java.util.List;

public class StatesLoader {

    private static final List<String> STATES = Arrays.asList(
        "CO", "AR", "NC", "PA", "WV", 
        "AL", "SC", "TX", "TN", "UT"
    );

    public static List<String> getStates() {
        return STATES;
    }
}

