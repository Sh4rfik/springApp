package com.spring.shurfik;

import org.springframework.stereotype.Component;

@Component("someRapMusic")
public class RapMusic implements Music{
    @Override
    public String getSong() {
        return "Lose Yourself";
    }


}
