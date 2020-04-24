package com.matiusha.homeworks.homework_09.classes;

import java.util.List;

public class OilCheck implements Service {
    private String serviceName;
    private double servicePrice;

    public OilCheck(String serviceName, double servicePrice) {
        this.serviceName = serviceName;
        this.servicePrice = servicePrice;
    }

    public String getServiceName() {
        return serviceName;
    }

    public double getServicePrice() {
        return servicePrice;
    }

    @Override
    public void perform() {
        System.out.print("Проверка масла");
    }

    @Override
    public String toString() {
        return "OilCheck{" +
                "serviceName='" + serviceName + '\'' +
                ", servicePrice=" + servicePrice +
                '}';
    }
}
