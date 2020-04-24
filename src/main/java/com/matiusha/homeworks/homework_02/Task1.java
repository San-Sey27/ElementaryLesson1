package com.matiusha.homeworks.homework_02;

/*Practice 2
Write function bmi that calculates body mass index (bmi = weight / height ^ 2).
if bmi <= 18.5 return "Underweight"
if bmi <= 25.0 return "Normal"
if bmi <= 30.0 return "Overweight"
if bmi > 30 return "Obese"
*/

public class Task1 {
    public static void main(String[] args) {

        int weight = 75;
        double height = 1.75;
        double bmi = weight / (height * height);
        System.out.println(bmi);

        if (bmi <= 18.5) {
            System.out.println("Underweight");
        }
        if (bmi > 18.5 && bmi <= 25) {
            System.out.println("Norma");
        }
        if (bmi > 25 && bmi <= 30) {
            System.out.println("Overweight");
        }
        if (bmi > 30) {
            System.out.println("Obese");
        }
    }
}
