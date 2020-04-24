package com.matiusha.lectures.lecture_09.proj.sources;

import com.matiusha.lectures.lecture_09.proj.models.Car;

public class RemoteCarManager implements CarManager {
    @Override
    public void add(Car car) {

    }

    @Override
    public void sell(Car car) {

    }

    @Override
    public void findByBrand(String brand) {
        System.out.println("Looking for" + brand + "remove");
    }

    @Override
    public void findByModel(String model) {

    }

    @Override
    public void findByType(String type) {

    }
}
