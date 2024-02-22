package com.kodilla.spring.basic.dependency_injection.homework;

public class ShippingCenter {

    private final DeliveryServices deliveryService;
    private final NotificationService notificationService;

    public ShippingCenter(DeliveryServices deliveryService, NotificationService notificationService) {
        this.deliveryService = deliveryService;
        this.notificationService = notificationService;
    }

    public void sendPackage(String address, double weight) {
        if (deliveryService.deliverPackage(address, weight)) {
            notificationService.success(address);
        } else {
            notificationService.fail(address);
        }
    }
}
