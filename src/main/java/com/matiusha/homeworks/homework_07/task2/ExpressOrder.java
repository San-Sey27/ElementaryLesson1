package com.matiusha.homeworks.homework_07.task2;

public class ExpressOrder extends Order {
    private String courier;
    private int daysToDeliver;

    public ExpressOrder(String date, String time, int id, String courier, int daysToDeliver) {
        super(date, time, id);
        this.courier = courier;
        this.daysToDeliver = daysToDeliver;
    }

    @Override
    public String toString() {
        return "ExpressOrder{" +
                "courier='" + courier + '\'' +
                ", daysToDeliver=" + daysToDeliver +
                '}';
    }
}
