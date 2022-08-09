package com.d3stroya.carcontroller.entities.pieces;

import org.hibernate.annotations.Type;

import javax.persistence.*;

/**
 * Clase AirConditioning con sus propios componentes.
 * Se definen métodos para encender, apagar y regular la temperatura.
 * Dichos métodos configuran los componentes del aire acondicionado.
 * Desde PiecesFacade llamaremos solamente a los métodos, simplificando y desacoplando así el código.
 */
@Entity
@Table(name = "air_conditioning")
public class AirConditioning {
    // ATTRIBUTES
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int sensor;
    private boolean compressor;
    private boolean condenser;
    private boolean evaporator;

    // CONSTRUCTOR
    public AirConditioning() {
    }

    public AirConditioning(int sensor, boolean compressor, boolean condenser, boolean evaporator) {
        this.sensor = sensor;
        this.compressor = compressor;
        this.condenser = condenser;
        this.evaporator = evaporator;
    }

    // GETTER AND SETTER
    public int getSensor() {
        return sensor;
    }

    public void setSensor(int sensor) {
        this.sensor = sensor;
    }

    public boolean isCompressor() {
        return compressor;
    }

    public void setCompressor(boolean compressor) {
        this.compressor = compressor;
    }

    public boolean isCondenser() {
        return condenser;
    }

    public void setCondenser(boolean condenser) {
        this.condenser = condenser;
    }

    public boolean isEvaporator() {
        return evaporator;
    }

    public void setEvaporator(boolean evaporator) {
        this.evaporator = evaporator;
    }

    // METHODS
    public void startAC() {
        compressor = true;
        condenser = true;
        evaporator = true;
    }

    public void stopAC() {
        compressor = false;
        condenser = false;
        evaporator = false;
    }

    public void regulatorAC(int temperature) {
        if(getSensor() > temperature) {
            condenser = true;
        }
        condenser = false;
    }

    @Override
    public String toString() {
        return "AirConditioning{" +
                "id=" + id +
                ", sensor=" + sensor +
                ", compressor=" + compressor +
                ", condenser=" + condenser +
                ", evaporator=" + evaporator +
                '}';
    }
}
