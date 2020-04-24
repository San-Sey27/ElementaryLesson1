package com.matiusha.sadebox;
//Simple, remove the spaces from the string, then return the resultant string.
public class Kata {
    public static void main(String[] args) {

        String str = "wque kok er tmr 34 4k5km ktm34";
        //str.replaceAll(" ", "");

        String[] array = str.split("\\s+");
        String result ="";
        for (String arr:array) {
            result +=arr;
        }
        System.out.println(result);
    }
}
