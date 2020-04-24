package com.matiusha.homeworks.homework_08;

public class Manager {
    public static void main(String[] args) {

        CarSold list = new CarSold();
        Car car1 = new SportsCar("Audi", 2019, 25040.56, "LS", "Germany", "15.04.2019", "Ken", 290, 3.5, 540);
        Car car2 = new UsedCar("Mercedes", 2020, 25040.56, "LS", "Germany", "15.04.2019", "Bob", 220008, "Peter");
        Car car3 = new SpecialMachinery("Peugeot", 2020, 25040.56, "LS", "Germany", "15.04.2019", "Bob", "RTD", 2100);

        list.addCar(car1);
        list.addCar(car2);
        list.addCar(car3);
        list.show();
    }
}