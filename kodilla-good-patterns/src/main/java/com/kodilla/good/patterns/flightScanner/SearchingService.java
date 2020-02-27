package com.kodilla.good.patterns.flightScanner;

public interface SearchingService {

    void allFlightsFrom(String from, TimeTable timeTable);

    void allFlightsTo(String to, TimeTable timeTable);

    void directSearch(String from, String to, TimeTable timeTable);

    void oneTransferFlight(String from, String to, TimeTable timeTable);

}
