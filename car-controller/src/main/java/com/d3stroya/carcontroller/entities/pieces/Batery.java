package com.d3stroya.carcontroller.entities.pieces;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Clase Batery con sus propios componentes.
 * Se definen métodos para arrancar y apagar la batería
 * Dichos métodos configuran los componentes de la batería.
 * Desde PiecesFacade llamaremos solamente a los métodos, simplificando y desacoplando así el código.
 */
@Entity
public class Batery {
    // ATTRIBUTES
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String technology;
    private int capacity;
    private int voltage;
    private boolean startStop;

    // CONSTRUCTOR
    public Batery() {
    }

    public Batery(String technology, int capacity, int voltage, boolean startStop) {
        this.technology = technology;
        this.capacity = capacity;
        this.voltage = voltage;
        this.startStop = startStop;
    }

    // GETTER AND SETTER
    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int voltage) {
        this.voltage = voltage;
    }

    public boolean isStartStop() {
        return startStop;
    }

    public void setStartStop(boolean startStop) {
        this.startStop = startStop;
    }

    // METHODS
    public void startBatery(int capacity, int voltage) {
        this.capacity = capacity;
        this.voltage = voltage;
    }

    public void stopBatery() {
        capacity = 0;
        voltage = 0;
    }

    @Override
    public String toString() {
        return "Batery{" +
                "id=" + id +
                ", technology='" + technology + '\'' +
                ", capacity=" + capacity +
                ", voltage=" + voltage +
                ", startStop=" + startStop +
                '}';
    }
}
