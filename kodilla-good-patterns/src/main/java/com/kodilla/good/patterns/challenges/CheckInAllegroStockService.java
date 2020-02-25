package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;

public class CheckInAllegroStockService implements CheckInStockService {

    List<String> allegroStock = new ArrayList<>();

    public CheckInAllegroStockService() {
        allegroStock.add("car");
        allegroStock.add("smartphone");
    }

    @Override
    public boolean isItemAvaiable(String item) {
        if(allegroStock.contains(item)) {
            System.out.println("Allegro has your: " + item + ".");
            return true;
        } else {
            System.out.println("Allegro doesn't have your: " + item + ".");
            return false;
        }
    }
}
