package com.matiusha.lectures.lecture_09;

import com.matiusha.lectures.lecture_09.proj.sources.CarManager;
import com.matiusha.lectures.lecture_09.proj.sources.LocalCarManager;
import com.matiusha.lectures.lecture_09.proj.sources.RemoteCarManager;

public class AppProj {
    public static void main(String[] args) {

        CarManager manager = getManager("local");
        manager.findByBrand("Audi");
    }

    public static CarManager getManager(String param){
        return param.equals("local") ? new LocalCarManager(): new RemoteCarManager();

    }
}
