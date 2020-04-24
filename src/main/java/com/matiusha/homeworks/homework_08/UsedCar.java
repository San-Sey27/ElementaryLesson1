package com.matiusha.homeworks.homework_08;

public class UsedCar extends Car {
    private int mileage;
    private String nameOfOwner;

    public UsedCar(String brand, int gearRelease, Double price, String equipment, String manufacturerCountry, String dateOfSale, String nameOfTheBuyer, int mileage, String nameOfOwner) {
        super(brand, gearRelease, price, equipment, manufacturerCountry, dateOfSale, nameOfTheBuyer);
        this.mileage = mileage;
        this.nameOfOwner = nameOfOwner;
    }

    @Override
    public String toString() {
        return "UsedCar{" +
                "mileage=" + mileage +
                ", nameOfOwner='" + nameOfOwner + '\'' +
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
