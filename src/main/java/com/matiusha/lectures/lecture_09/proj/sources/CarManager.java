package com.matiusha.lectures.lecture_09.proj.sources;

import com.matiusha.lectures.lecture_09.proj.models.Car;

public interface CarManager {

    void add(Car car);

    void sell(Car car);

    void findByBrand(String brand);

    void findByModel(String model);

    void findByType(String type);

}
