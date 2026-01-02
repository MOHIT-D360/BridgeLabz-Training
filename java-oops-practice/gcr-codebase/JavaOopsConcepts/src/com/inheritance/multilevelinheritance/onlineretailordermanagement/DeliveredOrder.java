package com.inheritance.multilevelinheritance.onlineretailordermanagement;

class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    DeliveredOrder(int orderId, String orderDate,
                   int trackingNumber, String deliveryDate) {

        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    @Override
    String getOrderStatus() {
        return "Order Delivered";
    }
}

