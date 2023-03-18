package com.curso.spring.spring.Ioc;

import org.springframework.stereotype.Component;

@Component
public class Motor implements ParteCarro {

    @Override
    public void on() {
        System.out.println("se inicio motor"); 
    }

    @Override
    public String toString() {
        return "Motor desde toString []";
    }

}
