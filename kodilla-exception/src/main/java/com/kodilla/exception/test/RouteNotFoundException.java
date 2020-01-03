package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class RouteNotFoundException extends Exception {

    public RouteNotFoundException(final String message) {
        super(message);
    }
}
