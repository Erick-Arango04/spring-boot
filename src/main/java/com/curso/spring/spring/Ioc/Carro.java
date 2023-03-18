package com.curso.spring.spring.Ioc;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 Esta clase sirve para representar como
  trabaja el contenedor de Spring implementando
  inversion de control
 */
@Component
public class Carro {

    // dependencias

    private  Motor motor;

    @Autowired
    public Carro(Motor motor){
        this.motor = motor;
    }

    // Estereo estereo;
    // SistemaSeguros seguros;

    public void correr() throws Exception {
        motor.on();
        // estereo.on();
        // seguros.on();
        System.out.println("se inicio el carro de forma correcta");
    }


    /**
     * metodo toString sirve para mostrar el estado de un obj
     *
     * @return String (valor de las propiedades del obj)
     */
    @Override
    public String toString() {
        return "Carro [motor=" + motor + "]";
    }


    public void setMotor(Motor motor) {
        this.motor = motor;
    }

}
