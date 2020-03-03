package com.kodilla.good.patterns.food2Door;

import java.util.Iterator;
import java.util.List;

public class OrderProcessor {

    private List<CheckInStockService> checkInStockService;
    private InformationService informationService;

    public OrderProcessor(List<CheckInStockService> checkInStockService, InformationService informationService) {
        this.checkInStockService = checkInStockService;
        this.informationService = informationService;
    }

    public void process(OrderRequest orderRequest) {
        List<ProductOrder> listOfProducts = orderRequest.getOrderList();

        for (ProductOrder product : listOfProducts) {
            String productToFind = product.getProductName();

            for (CheckInStockService stock : checkInStockService) {
                if(stock.isItemAvaiable(productToFind)) {
                    informationService.messageToCustomer(productToFind, stock.getClass().getSimpleName(), stock.quantityOfProducts(productToFind), stock.priceOfProduct(productToFind) );
                }
            }
        }
    }

}