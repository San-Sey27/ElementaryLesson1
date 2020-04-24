package com.matiusha.homeworks.homework_08;

public abstract class Car {
    protected String brand;
    protected int gearRelease;
    protected Double price;
    protected String equipment;
    protected String manufacturerCountry;
    protected String dateOfSale;
    protected String nameOfTheBuyer;

    public Car(String brand, int gearRelease, Double price, String equipment, String manufacturerCountry, String dateOfSale, String nameOfTheBuyer) {
        this.brand = brand;
        this.gearRelease = gearRelease;
        this.price = price;
        this.equipment = equipment;
        this.manufacturerCountry = manufacturerCountry;
        this.dateOfSale = dateOfSale;
        this.nameOfTheBuyer = nameOfTheBuyer;
    }

}
