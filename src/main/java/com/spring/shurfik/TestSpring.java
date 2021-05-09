package com.spring.shurfik;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.util.List;

public class TestSpring {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);
/*
        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic();*/

        context.close();
















        //TestBean testBean = context.getBean("testBean", TestBean.class);
        /*System.out.println("Bean name = " + testBean.getName());
        System.out.println("______________________");*/
        /*MusicPlayer firstMusicPlayer = context.getBean("someClassicMusic", ClassicMusic.class);
        firstMusicPlayer.playMusic();*/

        /*Music music = context.getBean("rockMusic", Music.class);
        Music music2 = context.getBean("someRapMusic", Music.class);

        MusicPlayer musicPlayer = new MusicPlayer(music);
        MusicPlayer musicPlayer2 = new MusicPlayer(music2);

        musicPlayer.playMusic();
        musicPlayer2.playMusic();
*/
        //Music music = context.getBean("musicBean", Music.class);
        //System.out.println(music.getSong());
        //MusicPlayer musicPlayer = new MusicPlayer(music);

        //MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        /*
        System.out.println("__________________________");
        System.out.println("MusicPlayer name = " + firstMusicPlayer.getName());
        System.out.println("MusicPlayer volume = " + firstMusicPlayer.getVolume());
        System.out.println("___________________________");
        System.out.println("MusicPlayer name = " + secondMusicPlayer.getName());
        System.out.println("MusicPlayer volume = " + secondMusicPlayer.getVolume());
        */

        //System.out.println(firstMusicPlayer == secondMusicPlayer);



    }
}
