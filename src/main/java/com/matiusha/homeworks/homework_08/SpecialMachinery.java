package com.matiusha.homeworks.homework_08;

public class SpecialMachinery extends Car {
  private String view;
  private int weight;

    public SpecialMachinery(String brand, int gearRelease, Double price, String equipment, String manufacturerCountry, String dateOfSale, String nameOfTheBuyer, String view, int weight) {
        super(brand, gearRelease, price, equipment, manufacturerCountry, dateOfSale, nameOfTheBuyer);
        this.view = view;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "SpecialMachinery{" +
                "view='" + view + '\'' +
                ", weight=" + weight +
                ", brand='" + brand + '\'' +
                ", gearRelease=" + gearRelease +
                ", price=" + price +
                ", equipment='" + equipment + '\'' +
                ", manufacturerCountry='" + manufacturerCountry + '\'' +
                ", dateOfSale='" + dateOfSale + '\'' +
                ", nameOfTheBuyer='" + nameOfTheBuyer + '\'' +
                '}';
    }
}
