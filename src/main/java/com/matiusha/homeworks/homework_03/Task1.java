package com.matiusha.homeworks.homework_03;

import java.util.Arrays;
import java.util.Random;

/*Write a program which ﬁnds minimal number in int array*/

public class Task1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(20);
        }
        System.out.println(Arrays.toString(array));

        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.print("Min number in array: " + min);
    }
}
