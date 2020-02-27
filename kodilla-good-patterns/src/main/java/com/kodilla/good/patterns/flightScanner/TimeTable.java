package com.kodilla.good.patterns.flightScanner;

import java.time.LocalDate;
import java.util.*;

public class TimeTable {

    List<Flight> timeTable = new ArrayList<>();
    AirportList airportList = new AirportList();

    public TimeTable() {
        final String[] temp = {"RZE"};
        final int[] month = {1, 10};
        final int[] day = {10, 15};

        airportList.cityList.forEach((k,v)-> {
            timeTable.add(new Flight(k, temp[0], LocalDate.of(2020, month[0], day[0])));
            temp[0] = k;
            month[0]++;
            day[0]++;
        });

        airportList.cityList.forEach((k,v)-> {
            timeTable.add(new Flight(k, temp[0], LocalDate.of(2020, month[1], day[1])));
            temp[0] = k;
            month[1]--;
            day[1]++;
        });
    }
}