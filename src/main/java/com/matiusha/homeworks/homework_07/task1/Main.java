package com.matiusha.homeworks.homework_07.task1;

public class Main {
    public static void main(String[] args) {

        System.out.println(ConfigurationManager.getInstance().getNumberOfThreads());
        System.out.println(ConfigurationManager.getInstance().getUrl());
        System.out.println(ConfigurationManager.getInstance().getRunTime());
    }
}
