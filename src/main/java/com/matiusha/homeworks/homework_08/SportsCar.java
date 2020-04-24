package com.matiusha.homeworks.homework_08;

public class SportsCar extends Car {
   private int maxSpeed;
   private double engineVolume;
   private int power;


    public SportsCar(String brand, int gearRelease, Double price, String equipment, String manufacturerCountry, String dateOfSale, String nameOfTheBuyer, int maxSpeed, double engineVolume, int power) {
        super(brand, gearRelease, price, equipment, manufacturerCountry, dateOfSale, nameOfTheBuyer);
        this.maxSpeed = maxSpeed;
        this.engineVolume = engineVolume;
        this.power = power;
    }

    @Override
    public String toString() {
        return "SportsCar{" +
                "maxSpeed=" + maxSpeed +
                ", engineVolume=" + engineVolume +
                ", power=" + power +
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
