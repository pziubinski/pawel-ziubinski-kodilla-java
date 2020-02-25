package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.rental.User;

import java.time.LocalDateTime;

public class OrderRequest {

    private User user;
    private LocalDateTime orderDate;
    private String item;

    public OrderRequest(final User user, final LocalDateTime orderDate, final String item) {
        this.user = user;
        this.orderDate = orderDate;
        this.item = item;
    }

    public User getUser() {
        return user;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public String getItem() {
        return item;
    }
}
