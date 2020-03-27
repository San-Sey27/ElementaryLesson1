package com.matiusha.lectures.lecture_01;

public class Task_2 {
    public static void main(String[] args) {

        int humanYears = 8;
        int catYears = 0;
        int dogYears = 0;
        if (humanYears == 1) {
            catYears = 15;
            dogYears = 15;
        }
        if (humanYears == 2) {
            catYears = 15 + 9;
            dogYears = 15 + 9;
        }
        if (humanYears > 2) {
            catYears = 15 + 9 + ((humanYears - 2) * 4);
            dogYears = 15 + 9 + ((humanYears - 2) * 5);
        } else {
            System.out.println("Не верно задан возраст человека!");
        }
        System.out.println("CatYears: " + catYears);
        System.out.println("DogYears: " + dogYears);
    }
}
