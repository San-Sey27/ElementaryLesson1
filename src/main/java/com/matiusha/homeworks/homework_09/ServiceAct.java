package com.matiusha.homeworks.homework_09;


import com.matiusha.homeworks.homework_09.classes.OilChange;
import com.matiusha.homeworks.homework_09.classes.Service;

public class ServiceAct {
    private int id;
    private Worker nameWorker;
    private Customer nameCustomer;
    private Service service;

    public ServiceAct(int id, Service service, Worker nameWorker, Customer nameCustomer) {
        this.id = id;
        this.service = service;
        this.nameWorker = nameWorker;
        this.nameCustomer = nameCustomer;
    }

    public int getId() {
        return id;
    }



    public Worker getNameWorker() {
        return nameWorker;
    }

    public Customer getNameCustomer() {
        return nameCustomer;
    }

    public void printAct() {

        System.out.println("Act# "+ this.id+"\n\n");
        System.out.println("Services: \n" + this.service.);

        tmp.getListProduct();
        for (int i = 0; i < tmp.getListProduct().size(); i++) {

            System.out.println(tmp.getListProduct());

            System.out.println((i)+"\n");
        }


    @Override
    public String toString() {
        return "ServiceAct{" +
                "id=" + id +
                ", nameWorker=" + nameWorker +
                ", nameCustomer=" + nameCustomer +
                ", service=" + service +
                '}';
    }
}
