package com.matiusha.homeworks.homework_07.task2;

/*Задание 2:
Система управления доставкой товара. Создать родительский класс «Заказ»
(дата, время, идентификатор) и дочерние классы:
    «Обычный заказ»;
    «Срочный заказ» (курьер, дата доставки);
    «Застрахованный заказ» (компания страхования, сумма).
Реализовать класс для хранения списка заказов с методом добавления
заказа и методом печати списка заказов.
В материалах диаграмма отношения классов*/

public class Main {
    public static void main(String[] args) {

        Order ordinaryOrder1 =new OrdinaryOrder("17.04.2020","12:00",1);
        Order ordinaryOrder2 =new OrdinaryOrder("18.04.2020","10:00",2);
        Order ordinaryOrder3 =new OrdinaryOrder("19.04.2020","09:00",3);
        Order ordinaryOrder4 =new OrdinaryOrder("19.04.2020","11:00",4);
        Order ordinaryOrder5 =new OrdinaryOrder("20.04.2020","15:00",5);

        Order insuredOrder1 =new InsuredOrder("21.04.2020","15:00",7, "Company1", 15.5);
        Order insuredOrder2 =new InsuredOrder("21.04.2020","15:00",7, "Company1", 22.5);
        Order insuredOrder3 =new InsuredOrder("21.04.2020","15:00",7, "Company3", 35);
        Order insuredOrder4 =new InsuredOrder("21.04.2020","15:00",7, "Company5", 45.5);
        Order insuredOrder5 =new InsuredOrder("21.04.2020","15:00",7, "Company1", 10.5);

        Order expressOrder1 =new ExpressOrder("22.04.2020","15:00",8, "Courier1", 2);
        Order expressOrder2 =new ExpressOrder("22.04.2020","15:00",8, "Courier3", 4);
        Order expressOrder3 =new ExpressOrder("22.04.2020","15:00",8, "Courier5", 7);
        Order expressOrder4 =new ExpressOrder("22.04.2020","15:00",8, "Courier2", 1);

        Orders listOrdinaryOrder = new Orders();
        listOrdinaryOrder.addOrder(ordinaryOrder1);
        listOrdinaryOrder.addOrder(ordinaryOrder2);
        listOrdinaryOrder.addOrder(ordinaryOrder3);
        listOrdinaryOrder.addOrder(ordinaryOrder4);
        listOrdinaryOrder.addOrder(ordinaryOrder5);
        listOrdinaryOrder.show();

        Orders listInsuredOrder = new Orders();
        listInsuredOrder.addOrder(insuredOrder1);
        listInsuredOrder.addOrder(insuredOrder2);
        listInsuredOrder.addOrder(insuredOrder3);
        listInsuredOrder.addOrder(insuredOrder4);
        listInsuredOrder.addOrder(insuredOrder5);
        listInsuredOrder.show();

        Orders listExspressOrder = new Orders();
        listExspressOrder.addOrder(expressOrder1);
        listExspressOrder.addOrder(expressOrder2);
        listExspressOrder.addOrder(expressOrder3);
        listExspressOrder.addOrder(expressOrder4);
        listExspressOrder.show();
    }

}
