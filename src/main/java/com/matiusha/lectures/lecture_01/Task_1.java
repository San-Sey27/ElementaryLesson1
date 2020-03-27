package com.matiusha.lectures.lecture_01;

public class Task_1 {
    public static void main(String[] args) {

        int a = 2;
        int b = 3;

        int tmp = a;
        a = b;
        b = tmp;
        System.out.println(a);
        System.out.println(b);

        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a);
        System.out.println(b);
    }
}
