package com.kodilla.good.patterns.flightScanner;

import java.time.LocalDate;

public class Flight {

    String from;
    String to;
    LocalDate departureDate;

    public Flight(String from, String to, LocalDate departureDate) {
        this.from = from;
        this.to = to;
        this.departureDate = departureDate;
    }

    public void printFlight() {
        System.out.println(from + " " + to + " " + departureDate);
    }

    public String getFrom() {
        return from;
    }

    public String getTo() {
        return to;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }
}
