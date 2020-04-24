package com.matiusha.lectures.lecture_09.simple;

import com.matiusha.lectures.lecture_09.simple.specs.Player;
import com.matiusha.lectures.lecture_09.simple.specs.VideoCamera;

public class SmartPhone extends SellPhone implements VideoCamera, Player {



    @Override
    public void playMusic() {
        System.out.println("SmartPhone playing music");
    }

    @Override
    public void recordVideo() {
        System.out.println("SmartPhone recording photos");
    }

    @Override
    public void makePhoto() {
        System.out.println("SmartPhone making photos");
    }
}
