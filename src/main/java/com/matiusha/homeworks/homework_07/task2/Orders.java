package com.matiusha.homeworks.homework_07.task2;

import java.util.ArrayList;
import java.util.List;

public class Orders {
    private List<Order> list;

    public Orders(){
        list = new ArrayList<>();
    }
    public void show() {
        for (int i = 0; i < this.list.size(); i++) {
            System.out.println(this.list.get(i));
        }
    }

    public void addOrder(Order o) {
        list.add(o);
    }

}
