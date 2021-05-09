package com.spring.shurfik;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
//@Scope("prototype")
public class ClassicMusic implements Music{

    private ClassicMusic(){}

    @Override
    public String getSong() {
        return "Rhapsody";
    }

    @PostConstruct
    public void myInitMethod(){
        System.out.println("Bean Initialization");
    }

    @PreDestroy
    public void destroyMethod(){
        System.out.println("Destroy bean");
    }

    public static ClassicMusic getClassicalMusic(){
        return new ClassicMusic();
    }

}
