package com.matiusha.sadebox;

//SuperSize(103456)==>654310
import java.util.Arrays;

public class SuperSize {
    public static void main(String[] args) {

        int numbers = 103456;
        System.out.println(SuperSize(numbers));
    }

    private static String SuperSize(int numbers) {
        String result = "";
        String str = String.valueOf(numbers);
        int[] array = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            int num = Integer.parseInt(str.substring(i, i + 1));
            array[i] = num;
        }
        Arrays.sort(array);

        for (int i = array.length - 1; i >= 0; i--) {
            result += String.valueOf(array[i]);
        }
        return result;
    }
}
