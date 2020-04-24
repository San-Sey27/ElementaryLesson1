package com.matiusha.homeworks.homework_09;

import java.util.List;

public class Product {
    private String productName;
    private double productPrice;
    private List listProduct;


    public Product(String productName, double productPrice) {
        this.productName = productName;
        this.productPrice = productPrice;
    }


    public String getProductName() {
        return productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public List getListProduct() {
        return listProduct;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
