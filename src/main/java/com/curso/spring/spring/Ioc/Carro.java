package com.curso.spring.spring.Ioc;

public class Carro {

    // dependencias
    Motor motor;

    // Estereo estereo;
    // SistemaSeguros seguros;

    public void correr() throws Exception {
        motor.on();
        // estereo.on();
        // seguros.on();
        System.out.println("se inicio el carro de forma correcta");
    }

    @Override
    public String toString() {
        return "Carro [motor=" + motor + "]";
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }
}
