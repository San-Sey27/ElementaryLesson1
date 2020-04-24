package com.matiusha.homeworks.homework_04;

public class Username {
    public static void main(String[] args) {
        String str = "rr98u_";
        //System.out.println(str.matches("^[a-z0-9_]{4,16}$"));

        String str2 = "02189023917034";
        System.out.println(str2);

        System.out.println(replace(str2, 0));
        System.out.println(replace(str2, 1));
    }

    private static String replace(String str2, int number) {

        String[] parts = str2.split(String.valueOf(number));
        String result = "";
        int check = Integer.parseInt(str2.substring(0, 1));
        if (check != number) {
            result = parts[0];
        }

        for (int i = 1; i < parts.length; i++) {
            if (number == 0) {
                result += number + parts[i].replaceAll("[1-4]", "*");
            } else if (number == 1) {
                result += number + parts[i].replaceAll("[5-9]", "#");
            } else
                System.out.println("Invalid number!");
        }
        return result;
    }
}
