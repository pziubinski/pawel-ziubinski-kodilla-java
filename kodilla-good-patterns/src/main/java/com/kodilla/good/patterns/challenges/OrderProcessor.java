package com.kodilla.good.patterns.challenges;

public class OrderProcessor {

    private CheckInStockService checkInStockService;
    private ShipmentService shipmentService;

    public OrderProcessor(final CheckInStockService checkInStockService, final ShipmentService shipmentService) {
        this.checkInStockService = checkInStockService;
        this.shipmentService = shipmentService;
    }

    public void process(OrderRequest orderRequest) {

        if(checkInStockService.isItemAvaiable(orderRequest.getItem())) {
            shipmentService.ship(orderRequest.getItem());

        }
    }
}
