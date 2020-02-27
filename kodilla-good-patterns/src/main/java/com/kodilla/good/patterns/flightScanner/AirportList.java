package com.kodilla.good.patterns.flightScanner;

import java.util.HashMap;
import java.util.Map;

public class AirportList {

    public Map<String, String> cityList;

    public AirportList() {
        cityList = new HashMap<>();
        cityList.put("WAW", "Warszawa");
        cityList.put("KRK", "Kraków");
        cityList.put("WRO", "Wrocław");
        cityList.put("RZE", "Rzeszów");
        cityList.put("LUZ", "Lublin");
        cityList.put("GDN", "Gdańsk");
        cityList.put("POZ", "Poznań");
    }
}
