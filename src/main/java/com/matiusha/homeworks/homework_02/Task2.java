package com.matiusha.homeworks.homework_02;

/*Practice 3
Introduction
The ﬁrst century spans from the year 1 up to and including the year 100,
The second - from the year 101 up to and including the year 200, etc.
Task :
Given a year, return the century it is in.
Input , Output Examples :
centuryFromYear(1705)  returns (18)
centuryFromYear(1900)  returns (19)
centuryFromYear(1601)  returns (17)
centuryFromYear(2000)  returns (20)*/

public class Task2 {
    public static void main(String[] args) {

        System.out.println(centuryFromYear(1705));
        System.out.println(centuryFromYear(1900));
        System.out.println(centuryFromYear(1601));
        System.out.println(centuryFromYear(2000));
    }

    private static int centuryFromYear(int year) {
        return ((year - 1) / 100) + 1;
    }
}