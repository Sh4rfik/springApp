package com.spring.shurfik;

import org.springframework.stereotype.Component;


public class ClassicMusic implements Music{

    private ClassicMusic(){}

    @Override
    public String getSong() {
        return "Rhapsody";
    }

    public void myInitMethod(){
        System.out.println("Bean Initialization");
    }

    public void destroyMethod(){
        System.out.println("Destroy bean");
    }

    public static ClassicMusic getClassicalMusic(){
        return new ClassicMusic();
    }

}
