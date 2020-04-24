package com.matiusha.sadebox;
//Implement String#digit? (in Java StringUtils.isDigit(String)),
// which should return true if given object is a digit (0-9), false otherwise.

public class StringUtils {
    public static void main(String[] args) {
        String s = "560";
        System.out.println(isDigit(s));
    }
    public static boolean isDigit(String s) {
        return s.matches("[0-9]+");
    }
}
