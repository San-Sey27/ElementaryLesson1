package com.matiusha.homeworks.homework_09.classes;

import com.matiusha.homeworks.homework_09.Product;

public class TyresChangeService implements Service {
    private String serviceName;
    private double servicePrice;
    private Product product;

    public TyresChangeService(String serviceName, double servicePrice, Product product) {
        this.serviceName = serviceName;
        this.servicePrice = servicePrice;
        this.product = product;
    }

    public String getServiceName() {
        return serviceName;
    }

    public double getServicePrice() {
        return servicePrice;
    }

    public Product getProduct() {
        return product;
    }

    @Override
    public void perform() {
        System.out.print("Tyres Changed");
    }

    @Override
    public String toString() {
        return "TyresChange{" +
                "serviceName='" + serviceName + '\'' +
                ", servicePrice=" + servicePrice +
                ", product=" + product +
                '}';
    }
}
