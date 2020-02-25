package com.kodilla.good.patterns.challenges;

public class Application {

    public static void main(String[] args) {

        OrderRequestRetriever orderRequestRetriever = new OrderRequestRetriever();
        OrderRequest orderRequest = orderRequestRetriever.retrieve("game");

        OrderProcessor orderProcessor = new OrderProcessor(
                new CheckInAmazonStockService(),
                new UpsShipmentService()
        );
        orderProcessor.process(orderRequest);

        orderProcessor = new OrderProcessor(
                new CheckInAllegroStockService(),
                new UpsShipmentService()
        );
        orderProcessor.process(orderRequest);
    }
}
