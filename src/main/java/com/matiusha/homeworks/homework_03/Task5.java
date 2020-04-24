package com.matiusha.homeworks.homework_03;

/*Написать программу перевода из десятичной системы в двоичную и обратно*/

public class Task5 {
    public static void main(String[] args) {
        int number = 16;
        System.out.println(DecOfBin(number));

        int number2 = 10010111;
        System.out.println(BinOfDec(number2));
    }

    private static int BinOfDec(int number2) {
        int num = 0;
        int pow = 0;
        while (number2 > 0) {
            int a = number2 % 10;
            number2 = number2 / 10;
            num = (int) (num + (a * Math.pow(2, pow)));
            pow++;
        }
        return num;
    }

    private static StringBuilder DecOfBin(int number) {
        StringBuilder str = new StringBuilder();
        while (number > 0) {
            int a = number % 2;
            str = str.append(a);
            number = number / 2;
        }
        return str.reverse();
    }
}
