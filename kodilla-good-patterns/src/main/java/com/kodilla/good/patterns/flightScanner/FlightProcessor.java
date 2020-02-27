package com.kodilla.good.patterns.flightScanner;

public class FlightProcessor {

    SearchingService searchingService;

    public FlightProcessor(SearchingService searchingService) {
        this.searchingService = searchingService;
    }

    public void process(SearchingOptions serviceName, String[] data, TimeTable timeTable) {

        switch (serviceName) {
            case ALL_FROM:
                searchingService.allFlightsFrom(data[0], timeTable);
                break;
            case ALL_TO:
                searchingService.allFlightsTo(data[1], timeTable);
                break;
            case DIRECT_FLIGHTS:
                searchingService.directSearch(data[0], data[1], timeTable);
                break;
            case ONE_TRANSFER:
                searchingService.oneTransferFlight(data[0], data[1], timeTable);
                break;
        }
    }
}
