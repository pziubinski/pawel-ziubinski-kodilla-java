package com.kodilla.good.patterns.challenges;

public class UpsShipmentService implements ShipmentService {

    @Override
    public void ship(String itemName) {
        System.out.println(itemName + " was shipped!");
    }
}
