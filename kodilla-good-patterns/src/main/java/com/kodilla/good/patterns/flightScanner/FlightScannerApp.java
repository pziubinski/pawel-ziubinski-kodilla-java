package com.kodilla.good.patterns.flightScanner;

import java.sql.Time;

public class FlightScannerApp {
    public static SearchingOptions service;

    public static void main(String[] args) {

        //create and print all flights
        TimeTable timeTable = new TimeTable();

        System.out.println("Time Table:");
        for (Flight flight : timeTable.timeTable) {
            flight.printFlight();
        }

        FlightProcessor flightProcessor = new FlightProcessor(new WebSearchingService());

        String[] data1 = {"WAW", "KRK"};
        flightProcessor.process(service.ALL_FROM, data1, timeTable);
        flightProcessor.process(service.ALL_TO, data1, timeTable);
        flightProcessor.process(service.DIRECT_FLIGHTS, data1, timeTable);
        flightProcessor.process(service.ONE_TRANSFER, data1, timeTable);

        String[] data2 = {"LUZ", "WAW"};
        flightProcessor.process(service.ALL_FROM, data2, timeTable);
        flightProcessor.process(service.ALL_TO, data2, timeTable);
        flightProcessor.process(service.DIRECT_FLIGHTS, data2, timeTable);
        flightProcessor.process(service.ONE_TRANSFER, data2, timeTable);
    }
}
