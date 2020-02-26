package com.kodilla.good.patterns.food2Door;

public class InformationMailService implements InformationService {

    @Override
    public void inform(String information) {
        System.out.println("Your delivery is collected");
    }
}
