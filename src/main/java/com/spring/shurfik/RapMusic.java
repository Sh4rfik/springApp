package com.spring.shurfik;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("someRapMusic")
@Scope("prototype")
public class RapMusic implements Music{
    @Override
    public String getSong() {
        return "Lose Yourself";
    }


}
