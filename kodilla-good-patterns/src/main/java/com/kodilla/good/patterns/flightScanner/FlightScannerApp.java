package com.kodilla.good.patterns.flightScanner;

public class FlightScannerApp {
    public static SearchingOptions service;

    public static void main(String[] args) {

        FlightProcessor flightProcessor = new FlightProcessor(new WebSearchingService());

        String[] data1 = {"WRO", "LUZ"};
        flightProcessor.process(service.ALL_FROM, data1);

        flightProcessor.process(service.ALL_TO, data1);
        flightProcessor.process(service.DIRECT_FLIGHTS, data1);
        flightProcessor.process(service.ONE_TRANSFER, data1);

        String[] data2 = {"POZ", "WAW"};
        flightProcessor.process(service.ALL_FROM, data2);
        flightProcessor.process(service.ALL_TO, data2);
        flightProcessor.process(service.DIRECT_FLIGHTS, data2);
        flightProcessor.process(service.ONE_TRANSFER, data2);
    }
}
