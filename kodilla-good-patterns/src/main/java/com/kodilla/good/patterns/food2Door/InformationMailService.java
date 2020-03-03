package com.kodilla.good.patterns.food2Door;

public class InformationMailService implements InformationService {

    @Override
    public void messageToCustomer(String productName, String shopName, Integer quantity, Double price) {
        System.out.println("Product name: " + productName + ", shop: " + shopName +", quantity: " + quantity + ", price: "  + price);
    }

}
