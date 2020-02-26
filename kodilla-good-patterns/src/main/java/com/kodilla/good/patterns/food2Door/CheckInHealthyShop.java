package com.kodilla.good.patterns.food2Door;

import java.util.*;

public class CheckInHealthyShop implements CheckInStockService {

    Map<String, Integer> idQuantityMap = new HashMap<>();
    Map<String, Double> idPriceMap = new HashMap<>();

    public CheckInHealthyShop() {
        idQuantityMap.put("Oranges", 13);
        idPriceMap.put("Oranges", 5.5);

        idQuantityMap.put("Bananas", 3);
        idPriceMap.put("Bananas", 5.0);

        idQuantityMap.put("Carrots", 15);
        idPriceMap.put("Carrots", 1.5);
    }

    @Override
    public boolean isItemAvaiable(String item) {
        if(idQuantityMap.containsKey(item)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public double priceOfProduct(String item) {
        if(isItemAvaiable(item)) {
            return idPriceMap.get(item);
        } else {
            return 0.0;
        }
    }

    @Override
    public Integer quantityOfProducts(String item) {
        if(isItemAvaiable(item)) {
            return idQuantityMap.get(item);
        } else {
            return 0;
        }
    }

}
