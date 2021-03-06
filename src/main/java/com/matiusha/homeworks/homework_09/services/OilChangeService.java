package com.matiusha.homeworks.homework_09.classes;

import com.matiusha.homeworks.homework_09.Product;

import java.util.List;

public class OilChangeService implements Service {
    private String serviceName;
    private double servicePrice;
    private Product product;


    public OilChangeService(String serviceName, double servicePrice, Product product) {
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
        System.out.printf("Oil Changed");
    }

    @Override
    public String toString() {
        return "OilChange{" +
                "serviceName='" + serviceName + '\'' +
                ", servicePrice=" + servicePrice +
                ", product=" + product +
                '}';
    }
}
