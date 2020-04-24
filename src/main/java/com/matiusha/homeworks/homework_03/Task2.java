package com.matiusha.homeworks.homework_03;

/*Write a program which checks if a string (array of chars) is a palindrome*/

public class Task2 {
    public static void main(String[] args) {

        String str = "a s d f g f d s a";
        String reverseStr = "";
        char[] chars = str.toCharArray();

        for( int i = chars.length - 1 ; i >= 0 ; i-- ) {
            reverseStr = reverseStr + chars[i];
        }

        if (str.equals(reverseStr)) {
            System.out.println("String is a palindrome");
        } else {
            System.out.println("String is not a palindrome");
        }
    }
}
