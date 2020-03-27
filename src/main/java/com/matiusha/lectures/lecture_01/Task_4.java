package com.matiusha.lectures.lecture_01;

public class Task_4 {
    public static void main(String[] args) {

        String str = "This is just an example string for test";
        String[] array = str.split("\\s+");
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : array) {
            stringBuilder.append(word.substring(0, 1).toUpperCase()).append(word.substring(1)).append(" ");
        }
        System.out.println(stringBuilder);
    }
}
