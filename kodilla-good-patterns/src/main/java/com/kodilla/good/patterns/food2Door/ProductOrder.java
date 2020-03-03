package com.kodilla.good.patterns.food2Door;

public class ProductOrder {

    private String productName;
    private Integer quantity;

    public ProductOrder(final String productName, final Integer quantity) {
        this.productName = productName;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public Integer getQuantity() {
        return quantity;
    }

}
