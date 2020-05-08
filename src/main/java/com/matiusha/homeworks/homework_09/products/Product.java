package com.matiusha.homeworks.homework_09;

import java.util.List;

public class Product {
    private String name;
    private double price;
    private List listProduct;


    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public List getListProduct() {
        return listProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
