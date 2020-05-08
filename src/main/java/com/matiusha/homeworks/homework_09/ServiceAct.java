package com.matiusha.homeworks.homework_09;


import com.matiusha.homeworks.homework_09.people.Customer;
import com.matiusha.homeworks.homework_09.people.Worker;
import com.matiusha.homeworks.homework_09.products.Product;
import com.matiusha.homeworks.homework_09.services.Service;

import java.util.*;

public class ServiceAct2 {
    private String id = UUID.randomUUID().toString();
    private String date =new Date().toString();
    private Boolean paid = false;
    private String  statusAct = "opened";
    private double sum = 0;
    private List<Worker> workers = new ArrayList<>();
    private List<Service> services = new ArrayList<>();
    private List<Product> products = new ArrayList<>();
    private Customer customer;

    public void addService(Service service){
        this.services.add(service);
        this.workers.add(service.getWorker());
    }

    public void addProduct(Product product){
        this.products.add(product);
    }

    public void addCustomer(Customer customer) {
        this.customer = customer;
    }

    public void addPaid() {
        this.paid = true;
        setStatusAct();
    }

    private void setStatusAct() {
        this.statusAct = "closed";
    }

    public List<Worker> getWorkers() {
        return workers;
    }

    public Customer getCustomer() {
        return customer;
    }



    public String printAct(){
        StringBuilder act = new StringBuilder();
        act.append("Act # "+id+"\n");
        act.append("Status: "+statusAct+"\n\n");
        act.append("Services: \n");
        if (services.size() > 0) {
            for (int i = 0; i < services.size(); i++) {
                act.append(i+1 +". "+services.get(i).getName()+" - "+ services.get(i).getPrice()+"\n");
                sum+=services.get(i).getPrice();
            }
        }
        act.append("Product: \n");
        if (products.size() > 0) {
            for (int i = 0; i < products.size(); i++) {
                act.append(i+1 +". "+products.get(i).getName()+" - "+ products.get(i).getPrice()+"\n");
                sum+=products.get(i).getPrice();
            }
        }
        act.append("Workers: \n");
        if (workers.size() > 0) {
            for (int i = 0; i < workers.size(); i++) {
                act.append(i+1 +". "+workers.get(i).getLastName()+" "+ workers.get(i).getFirstName().toCharArray()[0]+". \n");
            }
        }
        act.append("Customer: \n");
        act.append(customer.getLastName()+" "+customer.getFirstName()+", Phone number: "+customer.getPhoneNumber());
        act.append("\n\n");
        act.append("Total: "+sum);
        return act.toString();
        }


    @Override
    public String toString() {
        return "ServiceAct2{" +
                "id='" + id + '\'' +
                ", date='" + date + '\'' +
                ", paid=" + paid +
                ", sum=" + sum +
                ", workers=" + workers +
                ", services=" + services +
                ", products=" + products +
                ", customer=" + customer +
                '}';
    }


}
