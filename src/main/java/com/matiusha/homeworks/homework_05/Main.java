package com.matiusha.homeworks.homework_05;

public class Main {
    public static void main(String[] args) {
        FractionNumber num1 = new FractionNumber(1,2);
        FractionNumber num2 = new FractionNumber(3,5);
        FractionNumber num3 = new FractionNumber(4,3);

        System.out.println(num3);
        System.out.println(num1.plus(num2).multiply(num2));
        System.out.println(num1.minus(num2));
        System.out.println(num1.multiply(num3));
        System.out.println(num1.divede(num3));
    }
}
