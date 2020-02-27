package com.kodilla.good.patterns.food2Door;

import java.util.ArrayList;
import java.util.List;

public class Food2Door {
    public static void main(String[] args) {

        OrderRequest orderRequest = new OrderRequest();
        orderRequest.addToCart(new ProductOrder( "Carrots", 10));
        orderRequest.addToCart(new ProductOrder( "Apples", 3));
        orderRequest.addToCart(new ProductOrder( "Oranges", 5));

        List<CheckInStockService> listOfShops = new ArrayList<>();
        listOfShops.add(new CheckInExtraFoodShop());
        listOfShops.add(new CheckInHealthyShop());

        OrderProcessor orderProcessor = new OrderProcessor(listOfShops, new InformationMailService());
        orderProcessor.process(orderRequest);

    }
}
