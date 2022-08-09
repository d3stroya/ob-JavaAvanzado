package com.d3stroya.carcontroller.entities.pieces;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Clase Motor con sus propios componentes.
 * Se definen métodos para arrancar, parar, frenar e ir marcha atrás.
 * Dichos métodos configuran las piezas del motor.
 * Desde PiecesFacade llamaremos solamente al método, simplificando y desacoplando así el código.
 */
@Entity
public class Motor {
    // ATTRIBUTES
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private boolean sumpPlug;
    private boolean injection;
    private boolean intercooler;
    int gear;

    // CONSTRUCTOR
    public Motor() {}

    public Motor(String type, boolean sumpPlug, boolean injection, boolean intercooler, int gear) {
        this.type = type;
        this.sumpPlug = sumpPlug;
        this.injection = injection;
        this.intercooler = intercooler;
        this.gear = gear;
    }

    // GETTER AND SETTER
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isSumpPlug() {
        return sumpPlug;
    }

    public void setSumpPlug(boolean sumpPlug) {
        this.sumpPlug = sumpPlug;
    }

    public boolean isInjection() {
        return injection;
    }

    public void setInjection(boolean injection) {
        this.injection = injection;
    }

    public boolean isIntercooler() {
        return intercooler;
    }

    public void setIntercooler(boolean intercooler) {
        this.intercooler = intercooler;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    // METHODS
    public void startMotor() {
        sumpPlug = true;
        injection = true;
        intercooler = true;
    }

    public void stopMotor() {
        sumpPlug = false;
        injection = false;
        intercooler = false;
    }

    public void reverseMotor() {
        gear = 0;
    }

    public void slowDownMotor() {
        if(gear > 0) {
            gear--;
        }
    }

    @Override
    public String toString() {
        return "Motor{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", sumpPlug=" + sumpPlug +
                ", injection=" + injection +
                ", intercooler=" + intercooler +
                ", gear=" + gear +
                '}';
    }
}
