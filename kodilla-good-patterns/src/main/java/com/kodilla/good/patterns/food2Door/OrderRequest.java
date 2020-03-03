package com.kodilla.good.patterns.food2Door;

import java.util.ArrayList;
import java.util.List;

public class OrderRequest {

    private List<ProductOrder> orderList;

    public OrderRequest() {
        orderList = new ArrayList<>();
    }

    public void addToCart(ProductOrder productOrder) {
        orderList.add(productOrder);
    }

    public List<ProductOrder> getOrderList() {
        return orderList;
    }

}
