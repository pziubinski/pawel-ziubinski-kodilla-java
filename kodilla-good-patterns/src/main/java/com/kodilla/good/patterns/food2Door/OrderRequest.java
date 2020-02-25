package com.kodilla.good.patterns.food2Door;

import java.util.List;

public class OrderRequest {

    private String customerName;
    private List<ProductOrder> orderList;
    private double totalCost;

    public OrderRequest(String customerName, List<ProductOrder> orderList) {
        this.customerName = customerName;
        this.orderList = orderList;
    }

    public void AddToList(ProductOrder product) {
        orderList.add(product);

    }




}
