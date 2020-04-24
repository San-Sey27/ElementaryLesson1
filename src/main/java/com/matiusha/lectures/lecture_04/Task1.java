package com.matiusha.lectures.lecture_04;

public class Task1 {
    public static void main(String[] args) {

        String str = "Hello";

        StringBuilder strb = new StringBuilder(str);
        StringBuilder s = strb.reverse();
        System.out.println(s);
    }
}
