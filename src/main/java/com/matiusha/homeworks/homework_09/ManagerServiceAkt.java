package com.matiusha.homeworks.homework_09;

import java.util.ArrayList;
import java.util.List;

public class UpravlenieAktamu {
    private String status;
    private List<ServiceAct> numbersAkt;

    public UpravlenieAktamu() {
        numbersAkt =  new ArrayList<>();
    }

    public void addServiceAct(ServiceAct serAck){
        numbersAkt.add(serAck);
    }

    public void searchByWorker(){

    }

    public void searchByCustomer(){

    }





}
