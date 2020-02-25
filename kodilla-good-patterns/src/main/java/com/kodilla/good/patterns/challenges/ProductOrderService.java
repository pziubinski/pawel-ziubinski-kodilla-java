package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
    OrderRequest orderGameRequest = orderRequestRetriever.retrieve("Game");



}
