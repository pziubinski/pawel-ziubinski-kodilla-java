package com.kodilla.good.patterns.flightScanner;

import java.time.LocalDate;
import java.util.*;

public final class TimeTable {

    public static List<Flight> getTimeTable() {
        final List<Flight> list = new ArrayList<>();
        list.add(new Flight("WRO", "WAW", LocalDate.of(2020, 1,1)));
        list.add(new Flight("WAW", "LUZ", LocalDate.of(2020, 2,2)));
        list.add(new Flight("WRO", "LUZ", LocalDate.of(2020, 1,3)));
        list.add(new Flight("WAW", "WRO", LocalDate.of(2020, 2,4)));
        list.add(new Flight("WRO", "POZ", LocalDate.of(2020, 3,5)));
        list.add(new Flight("POZ", "WAW", LocalDate.of(2020, 2,6)));
        list.add(new Flight("POZ", "WAW", LocalDate.of(2020, 3,7)));
        list.add(new Flight("POZ", "GDN", LocalDate.of(2020, 4,8)));
        list.add(new Flight("GDN", "WRO", LocalDate.of(2020, 3,9)));
        list.add(new Flight("GDN", "KRK", LocalDate.of(2020, 4,10)));

        return new ArrayList<Flight>(list);
    }
}
