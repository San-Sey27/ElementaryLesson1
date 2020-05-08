package com.matiusha.homeworks.homework_09;


import com.matiusha.homeworks.homework_09.people.Customer;
import com.matiusha.homeworks.homework_09.people.Worker;
import com.matiusha.homeworks.homework_09.products.Oil;
import com.matiusha.homeworks.homework_09.products.Product;
import com.matiusha.homeworks.homework_09.products.Tyres;
import com.matiusha.homeworks.homework_09.services.OilChangeService;
import com.matiusha.homeworks.homework_09.services.OilCheckService;
import com.matiusha.homeworks.homework_09.services.Service;
import com.matiusha.homeworks.homework_09.services.TyresChangeService;


public class AutoServiceApp2 {
    public static void main(String[] args) {
        Worker w1 = new Worker("Nik","Ryrr","oil check");
        Worker w2 = new Worker("Jak","Ttrt","oil change");
        Worker w3 = new Worker("Stiven", "Ggfh","tires");

        Customer c1 = new Customer("Igor","Qwee","097566222");
        Customer c2 = new Customer("Jura","Eryty","098942323");

        Product oil = new Oil("Oil", "Motul",170.5,1);
        Product tyres = new Tyres("Tyres","Michlen",2200.1,"185x65");

        Service srv1 = new OilCheckService(w1);
        Service srv2 = new OilChangeService(w2);
        Service srv3 = new TyresChangeService(w3);

        ServiceAct2 act1= new ServiceAct2();
        act1.addService(srv1);
        act1.addCustomer(c2);
        act1.addPaid();
//        System.out.println(act1.printAct());

//        System.out.println("=====================");

        ServiceAct2 act2= new ServiceAct2();
        act2.addService(srv1);
        act2.addService(srv2);
        act2.addProduct(oil);
        act2.addCustomer(c1);
        act2.addPaid();
//        System.out.println(act2.printAct());

//        System.out.println("=====================");

        ServiceAct2 act3= new ServiceAct2();
        act3.addService(srv1);
        act3.addService(srv2);
        act3.addService(srv3);

        act3.addProduct(oil);
        act3.addProduct(tyres);
        act3.addCustomer(c1);
//        System.out.println(act3.printAct());

        System.out.println("==========================\n=============================");

        ManagerServiceAkt listMsAkt = new ManagerServiceAkt();
        listMsAkt.addServiceAct(act1);
        listMsAkt.addServiceAct(act2);
        listMsAkt.addServiceAct(act3);

        ManagerServiceAkt chekListWorker = listMsAkt.findByWorker(w1);
        System.out.println(chekListWorker.printServiceActs());

//        ManagerServiceAkt chekListCustomer = listMsAkt.findByCustomer(c1);
//        System.out.println(chekListCustomer.printServiceActs());



    }
}
