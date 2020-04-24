package com.matiusha.homeworks.homework_03;

/*Write a program which calculates the sum of two columns.
Print table with results if columns have the same size
(col_1 | col_2 | sum). Otherwise print which column has bigger size*/

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {

        int[][] array = {{1, 2, 3, 4, 5, 6}, {2, 3, 4, 5, 6, 7}};

        if (array[0].length == array[1].length) {
            for (int i = 0; i < array[0].length; i++) {
                int j = 0;
                System.out.println(array[j][i] + " | " + array[j + 1][i] + " | " + (array[j][i] + array[j + 1][i]));
            }
        } else if (array[0].length > array[1].length) {
            System.out.println("Первый столбец имеет больший размер");
        } else {
            System.out.println("Второй столбец имеет больший размер");
        }

    }
}
