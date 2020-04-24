package com.matiusha.homeworks.homework_07.task2;

public class InsuredOrder extends Order {
    private String company;
    private double amount;

    public InsuredOrder(String date, String time, int id, String company, double amount) {
        super(date, time, id);
        this.company = company;
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "InsuredOrder{" +
                "company='" + company + '\'' +
                ", amount=" + amount +
                '}';
    }
}
