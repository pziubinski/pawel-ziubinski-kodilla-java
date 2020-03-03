package com.kodilla.good.patterns.food2Door;

public interface CheckInStockService {

    boolean isItemAvaiable(String item);

    double priceOfProduct(String item);

    Integer quantityOfProducts(String item);

}