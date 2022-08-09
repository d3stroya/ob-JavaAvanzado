package com.d3stroya.carcontroller.entities.pieces;


import org.springframework.stereotype.Service;

import javax.persistence.*;

/**
 * Clase que implementa el patrón fachada para facilitar algunos métodos que necesitan de otras clases.
 * Desde esta clase se definen métodos configurando todas las piezas del coche.
 * Después, desde el controlador, solo habrá que referenciar el método, sin repetir código ni ir ajustando cada una de las piezas.
 */
@Entity
public class PiecesFacade {
    // ATTRIBUTES
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    boolean starterMotor;
    boolean rearCamera;

    // CONSTRUCTOR
    public PiecesFacade() {
    }

    public boolean isStarterMotor() {
        return starterMotor;
    }

    public void setStarterMotor(boolean starterMotor) {
        this.starterMotor = starterMotor;
    }

    public boolean isRearCamera() {
        return rearCamera;
    }

    public void setRearCamera(boolean rearCamera) {
        this.rearCamera = rearCamera;
    }

    // METHODS

    /**
     * Método para determinar el modo del coche (mode).
     * @param mode arrancado, parado, marcha atrás o frenando
     */
    public void carMode(String mode) {
        Motor motor = new Motor();
        AirConditioning airConditioning = new AirConditioning();
        Batery batery = new Batery();
        Lights lights = new Lights();

        switch (mode) {
            case "start" -> {
                starterMotor = true;
                motor.startMotor();
                airConditioning.startAC();
                batery.startBatery(80, 12);
                lights.startLights();
            }
            case "stop" -> {
                starterMotor = false;
                motor.stopMotor();
                airConditioning.stopAC();
                batery.stopBatery();
                lights.stopLights();
            }
            case "reverse" -> {
                motor.reverseMotor();
                lights.reverseLight();
                rearCamera = true;
            }
            case "slow down" -> {
                motor.slowDownMotor();
                lights.slowDownLights();
            }
        }
        System.out.println(airConditioning.toString() + "\n" + batery + "\n" + motor + "\n" + lights);
    }

    @Override
    public String toString() {
        return "PiecesFacade{" +
                "id=" + id +
                ", starterMotor=" + starterMotor +
                ", rearCamera=" + rearCamera +
                '}';
    }
}
