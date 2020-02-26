package com.kodilla.good.patterns.food2Door;

import java.util.Iterator;
import java.util.List;

public class OrderProcessor {

    private List<CheckInStockService> checkInStockService;

    public OrderProcessor(List<CheckInStockService> checkInStockService) {
        this.checkInStockService = checkInStockService;
    }

    public void process(OrderRequest orderRequest) {
        List<ProductOrder> listOfProducts = orderRequest.getOrderList();

        for (ProductOrder product : listOfProducts) {
            String productToFind = product.getProductName();

            Iterator<CheckInStockService> stockService = checkInStockService.iterator();
            while (stockService.hasNext()) {
                CheckInStockService stock = stockService.next();

                if(stock.isItemAvaiable(productToFind)) {
                    System.out.println("Product name: " + productToFind + ", shop: " + stock.getClass().getSimpleName() +", quantity: " + stock.quantityOfProducts(productToFind) + ", price: "  + stock.priceOfProduct(productToFind) );
                }
            }
        }
    }
}