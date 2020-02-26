package com.kodilla.good.patterns.food2Door;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CheckInExtraFoodShop implements CheckInStockService {

    List<ExtraFoodShopProduct> extraFoodStock = new ArrayList<>();

    public CheckInExtraFoodShop() {
        extraFoodStock.add(new ExtraFoodShopProduct("Bananas", 20, 4.0));
        extraFoodStock.add(new ExtraFoodShopProduct("Apples", 5, 2.5));
        extraFoodStock.add(new ExtraFoodShopProduct("Oranges", 10, 5));
    }

    @Override
    public boolean isItemAvaiable(String item) {
        for(ExtraFoodShopProduct product : extraFoodStock) {
            if (product.getProductName().equals(item)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public double priceOfProduct(String item) {
        Iterator<ExtraFoodShopProduct> iterator = extraFoodStock.iterator();
        while (iterator.hasNext()) {
            ExtraFoodShopProduct product = iterator.next();
            if(product.getProductName().equals(item)) {
                return product.getPrice();
            }
        }
        return 0;
    }

    @Override
    public Integer quantityOfProducts(String item) {
        Iterator<ExtraFoodShopProduct> iterator = extraFoodStock.iterator();
        while (iterator.hasNext()) {
            ExtraFoodShopProduct product = iterator.next();
            if(product.getProductName().equals(item)) {
                return product.getQuantity();
            }
        }
        return 0;
    }
}