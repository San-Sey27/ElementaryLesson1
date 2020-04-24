package com.matiusha.homeworks.homework_07.task1;

public class ConfigurationManager {
    private  String url = System.getenv("url");
    private  String numberOfThreads = System.getenv("numberOfThreads");
    private  String runTime = System.getenv("runTime");

    private static final ConfigurationManager INSTANCE = new ConfigurationManager();

    private ConfigurationManager() {
    }

    public static ConfigurationManager getInstance() {
        return INSTANCE;
    }

    public String getUrl() {
        if (url != null){
            return url;
        }else
        return "http://localhost:8080";
    }

    public String getNumberOfThreads(){
        if (numberOfThreads != null){
            return numberOfThreads;
        }else
        return "200";
    }
    public String getRunTime(){
        if (runTime != null){
            return runTime;
        }else
            return "15000";
    }
}

