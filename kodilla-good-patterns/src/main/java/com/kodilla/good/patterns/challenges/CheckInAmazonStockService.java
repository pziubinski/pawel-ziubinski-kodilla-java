package com.kodilla.good.patterns.challenges;

import java.util.ArrayList;
import java.util.List;

public class CheckInAmazonStockService implements CheckInStockService {

    List<String> amazonStock = new ArrayList<>();

    public CheckInAmazonStockService() {
        amazonStock.add("game");
        amazonStock.add("tv");
        amazonStock.add("toothbrush");
        amazonStock.add("book");
    }

    @Override
    public boolean isItemAvaiable(String item) {
        if(amazonStock.contains(item)) {
            System.out.println("Amazon has your: " + item + ".");
            return true;
        } else {
            System.out.println("Amazon doesn't have your: " + item + ".");
            return false;
        }
    }
}
