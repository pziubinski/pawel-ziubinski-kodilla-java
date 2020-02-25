package com.kodilla.good.patterns.challenges;

import com.kodilla.good.patterns.rental.User;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve(String itemName) {
        User user = new User("John", "Smith");
        LocalDateTime orderDate = LocalDateTime.of(2020, 1, 1, 0, 0);

        return new OrderRequest(user, orderDate, itemName);
    }

}
