package com.kodilla.good.patterns.flightScanner;

import java.util.ArrayList;
import java.util.List;

public class WebSearchingService implements SearchingService {

    @Override
    public void allFlightsFrom(String from, TimeTable timeTable) {

        System.out.println("Flights from: " + from);

        for (Flight flight : timeTable.timeTable) {
            if(flight.from.equals(from)) {
                flight.printFlight();
            }
        }
    }

    @Override
    public void allFlightsTo(String to, TimeTable timeTable) {

        System.out.println("Flights to: " + to);

        for (Flight flight : timeTable.timeTable) {
            if(flight.to.equals(to)) {
                flight.printFlight();
            }
        }
    }

    @Override
    public void directSearch(String from, String to, TimeTable timeTable) {

        System.out.println("Flights from: " + from + " and directly to: " + to);

        for (Flight flight : timeTable.timeTable) {
            if(flight.from.equals(from) && flight.to.equals(to)) {
                flight.printFlight();
            }
        }
    }

    @Override
    public void oneTransferFlight(String from, String to, TimeTable timeTable) {

        System.out.println("Flights from: " + from);
        List<Flight> airportsFrom = new ArrayList<>();

        for (Flight flight : timeTable.timeTable) {
            if(flight.from.equals(from)) {
                airportsFrom.add(new Flight(flight.getFrom(), flight.getTo(), flight.getDepartureDate()));
                flight.printFlight();
            }
        }

        System.out.println("Flights to: " + to);
        List<Flight> airportsTo = new ArrayList<>();

        for (Flight flight : timeTable.timeTable) {
            if(flight.to.equals(to)) {
                airportsTo.add(new Flight(flight.getFrom(), flight.getTo(), flight.getDepartureDate()));
                flight.printFlight();
            }
        }

        System.out.println("Hub connection");

        for(Flight flightFrom : airportsFrom) {
            for(Flight flightTo : airportsTo) {

                if(flightFrom.getTo().equals(flightTo.getFrom()) && flightFrom.getDepartureDate().isBefore(flightTo.getDepartureDate())) {
                    System.out.println("Your first connecting flight: ");
                    flightFrom.printFlight();
                    System.out.println("Your second connecting flight: ");
                    flightTo.printFlight();
                }
            }
        }
    }
}
