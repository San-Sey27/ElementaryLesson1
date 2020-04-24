package com.matiusha.homeworks.homework_02;

/* Practice 4
You are given a function describeAge that takes a parameter age (which will always be a positive integer) and does the following:
If the age is 12 or lower, it return "You're a(n) kid"
If the age is anything between 13 and 17 (inclusive), it return "You're a(n) teenager"
If the age is anything between 18 and 64 (inclusive), it return "You're a(n) adult"
If the age is 65 or above, it return "You're a(n) elderly"
Your task is to shorten the code as much as possible */

public class Task3 {
    public static void main(String[] args) {

        int age = 45;
        String rez = age <= 12 ? "You're a(n) kid"
                : (age >= 13 && age <= 17) ? "You're a(n) teenager"
                : (age >= 18 && age <= 64) ? "You're a(n) adult"
                : "You're a(n) elderly";

        System.out.println(rez);
    }
}
