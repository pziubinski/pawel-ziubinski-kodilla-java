package com.kodilla.good.patterns.food2Door;

public class ProductOrder {
    private String productName;
    private String supplier;
    private Integer quantity;
    private Double price;
    private Double totalProductPrice;

    public ProductOrder(final String productName, final String supplier, final Integer quantity, final Double price, final Double totalProductPrice) {
        this.productName = productName;
        this.supplier = supplier;
        this.quantity = quantity;
        this.price = price;
        this.totalProductPrice = totalProductPrice;
    }

}
