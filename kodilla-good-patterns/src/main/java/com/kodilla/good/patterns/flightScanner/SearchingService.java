package com.kodilla.good.patterns.flightScanner;

public interface SearchingService {

    void allFlightsFrom(String from);

    void allFlightsTo(String to);

    void directSearch(String from, String to);

    void oneTransferFlight(String from, String to);

}
