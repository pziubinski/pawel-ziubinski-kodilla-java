package com.kodilla.good.patterns.flightScanner;

import java.util.List;
import java.util.stream.Collectors;

public class WebSearchingService implements SearchingService {

    @Override
    public void allFlightsFrom(String from) {

        System.out.println("Flights from: " + from);

        TimeTable.getTimeTable().stream()
                .filter(f -> f.getFrom().equals(from))
                .map(f -> f.getFrom() + " " + f.getTo() + " " + f.getDepartureDate())
                .forEach(System.out::println);
    }

    @Override
    public void allFlightsTo(String to) {

        System.out.println("Flights to: " + to);

        TimeTable.getTimeTable().stream()
                .filter(f -> f.getTo().equals(to))
                .map(f -> f.getFrom() + " " + f.getTo() + " " + f.getDepartureDate())
                .forEach(System.out::println);
    }

    @Override
    public void directSearch(String from, String to) {

        System.out.println("Flights from: " + from + " and directly to: " + to);

        TimeTable.getTimeTable().stream()
                .filter(f -> f.getFrom().equals(from) && f.getTo().equals(to))
                .map(f -> f.getFrom() + " " + f.getTo() + " " + f.getDepartureDate())
                .forEach(System.out::println);
    }

    @Override
    public void oneTransferFlight(String from, String to) {

        List<Flight> airportsFrom = TimeTable.getTimeTable().stream()
                .filter(f -> f.getFrom().equals(from))
                .map(f -> new Flight(f.getFrom(), f.getTo(), f.getDepartureDate()))
                .collect(Collectors.toList());

        List<Flight> airportsTo = TimeTable.getTimeTable().stream()
                .filter(f -> f.getTo().equals(to))
                .map(f -> new Flight(f.getFrom(), f.getTo(), f.getDepartureDate()))
                .collect(Collectors.toList());

        System.out.println("Hub connection");
        List<Flight> airportHub = airportsFrom.stream()
                .filter(airportsTo::contains)
                .collect(Collectors.toList());

        airportHub.stream()
                .map(f -> f.getFrom() + " " + f.getTo() + " " + f.getDepartureDate())
                .forEach(System.out::println);
    }
}
