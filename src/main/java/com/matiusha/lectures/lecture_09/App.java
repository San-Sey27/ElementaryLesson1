package com.matiusha.lectures.lecture_09;

import com.matiusha.lectures.lecture_09.simple.Ipod;
import com.matiusha.lectures.lecture_09.simple.SmartPhone;
import com.matiusha.lectures.lecture_09.simple.specs.Player;

public class App {
    public static void main(String[] args) {

//        Player applePlayer = new SmartPhone();
//        applePlayer.playMusic();
       playMusic(new SmartPhone());



    }


   public static void playMusic(Player player){
        player.playMusic();
    }
}
