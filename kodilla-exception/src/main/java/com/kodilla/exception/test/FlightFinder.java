package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinder {
    Map<String, Boolean> map;

    public FlightFinder(Map<String, Boolean> map) {
        this.map = map;
    }

    public void findFlight(Flight flight) throws RouteNotFoundException {

        if(map.containsKey(flight.getArrivalAirport()) && map.get(flight.getArrivalAirport())) {
            System.out.println("Flight from " + flight.getDepartureAirport() + " to " + flight.getArrivalAirport() + " is possible!");
        } else {
            throw new RouteNotFoundException("It is impossible to find this airport!");
        }
    }
}
