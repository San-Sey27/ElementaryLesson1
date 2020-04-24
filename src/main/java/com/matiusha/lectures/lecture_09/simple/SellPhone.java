package com.matiusha.lectures.lecture_09.simple;

import com.matiusha.lectures.lecture_09.simple.specs.Phone;

public abstract class SellPhone implements Phone {
    @Override
    public void calc() {
        System.out.println("SmartPhone calling");
    }
}
