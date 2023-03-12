package com.curso.spring.spring.Ioc;


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
