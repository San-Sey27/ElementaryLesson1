package com.matiusha.lectures.lecture_09.simple;

import com.matiusha.lectures.lecture_09.simple.specs.Player;
import com.matiusha.lectures.lecture_09.simple.specs.VideoCamera;

public class Ipod implements Player, VideoCamera {
    @Override
    public void makePhoto() {
        System.out.println("iPod making photos");
    }

    @Override
    public void playMusic() {
        System.out.println("iPod playing music");
    }

    @Override
    public void recordVideo() {
        System.out.println("iPod recording video");
    }
}
