package com.matiusha.homeworks.homework_09.classes;

import com.matiusha.homeworks.homework_09.Product;

public class TyresChange implements Service {
    private String serviceName;
    private double servicePrice;
    private Product product;

    public TyresChange(String serviceName, double servicePrice, Product product) {
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
        System.out.print("Замена масла + buy Product(шины + диски)");
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
