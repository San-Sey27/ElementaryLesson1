package com.matiusha.homeworks.homework_08;

import java.util.ArrayList;
import java.util.List;

public class CarSold {
    private List<Car> list;

    public CarSold(){
        list = new ArrayList<Car>();
    }

    public void show() {
        for (int i = 0; i < this.list.size(); i++) {
            System.out.println(this.list.get(i)+"\n");
        }
    }

    public void addCar(Car number){
        list.add(number);
    }
}
