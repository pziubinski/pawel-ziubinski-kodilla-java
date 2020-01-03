package com.kodilla.exception;

import com.kodilla.exception.test.Flight;
import com.kodilla.exception.test.FlightFinder;
import com.kodilla.exception.test.RouteNotFoundException;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class FlightFinderTestSuite {
    public class TestData {
        public Map<String, Boolean> airportMap() {
            Map<String, Boolean> airportMap = new HashMap<>();
            airportMap.put("Berlin", true);
            airportMap.put("Warsaw", true);
            airportMap.put("London", true);
            airportMap.put("Radom", false);
            airportMap.put("Santander", false);

            return new HashMap<>(airportMap);
        }
    }

    @Test (expected = RouteNotFoundException.class)
    public void testExceptionThrown() throws RouteNotFoundException {
        //Given
        Flight warsawLondon = new Flight("Warsaw", "London");
        Flight londonRadom = new Flight("London", "Radom");
        Flight berlinOtwock = new Flight("Berlin", "Otwock");

        TestData td = new TestData();
        Map<String, Boolean> airportMap = td.airportMap();

        //When
        FlightFinder flightFinder = new FlightFinder(airportMap);

        //Then
        flightFinder.findFlight(berlinOtwock);
    }
}
