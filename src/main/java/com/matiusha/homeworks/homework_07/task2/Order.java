package com.matiusha.homeworks.homework_07.task2;

public class Order {
    private String date;
    private String time;
    private int id;

    public Order(String date, String time, int id) {
        this.date = date;
        this.time = time;
        this.id = id;
    }

    @Override
    public String toString() {
        return "Order{" +
                "date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", id=" + id +
                '}';
    }
}
