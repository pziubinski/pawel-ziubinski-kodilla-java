package com.kodilla.good.patterns.food2Door;

public final class ExtraFoodShopProduct {

    private String productName;
    private Integer quantity;
    private double price;

    public ExtraFoodShopProduct(final String productName, final Integer quantity, final double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

}
