package com.matiusha.homeworks.homework_09;


import com.matiusha.homeworks.homework_09.classes.OilChange;
import com.matiusha.homeworks.homework_09.classes.OilCheck;
import com.matiusha.homeworks.homework_09.classes.Service;
import com.matiusha.homeworks.homework_09.classes.TyresChange;


public class Manager {
    public static void main(String[] args) {
        Worker w1 = new Worker("Nik");
        Worker w2 = new Worker("Stiven");

        Customer c1 = new Customer("Igor");
        Customer c2 = new Customer("Jura");

        Product oil = new Product("Масло", 400.5);
        Product tiresAndDisks  = new Product("Шины и Диски",2200.7);
        Product disks = new Product("Диски",1550.6);




        Service serviceOilCheck = new OilCheck("проверка масла", 50.5);
        Service serviceOilChange = new OilChange("Замена масла", 120.5, oil);
        Service serviceTyresChange = new TyresChange("Замена масла", 120.5, tiresAndDisks);



        ServiceAct serAct1 = new ServiceAct(1, serviceOilCheck, w1, c1);
        System.out.println(serAct1);

        serAct1.printAct();
        ServiceAct serAct2 = new ServiceAct(2, serviceOilChange, w2, c2);
        System.out.println(serAct2);

        UpravlenieAktamu serList1 =new UpravlenieAktamu();
        serList1.addServiceAct(serAct1);







    }
}
