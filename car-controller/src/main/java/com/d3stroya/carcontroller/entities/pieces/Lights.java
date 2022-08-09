package com.d3stroya.carcontroller.entities.pieces;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Clase Lights con sus propios componentes.
 * Se definen métodos para arrancar, parar, apagar las luces, frenar e ir marcha atrás.
 * Dichos métodos configuran los componentes de las luces.
 * Desde PiecesFacade llamaremos solamente a los métodos, simplificando y desacoplando así el código.
 */
@Entity
public class Lights {
    // ATTRIBUTES
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private boolean rightIndicator;
    private boolean leftIndicator;
    private String headlight;   // low/high beam
    private boolean rear;
    private boolean reverse;
    private boolean daylight;
    private String sensor;

    // CONSTRUCTOR
    public Lights() {
    }

    public Lights(boolean rightIndicator, boolean leftIndicator, String headlight, boolean rear, boolean reverse, boolean daylight, String sensor) {
        this.rightIndicator = rightIndicator;
        this.leftIndicator = leftIndicator;
        this.headlight = headlight;
        this.rear = rear;
        this.reverse = reverse;
        this.daylight = daylight;
        this.sensor = sensor;
    }

    // GETTER AND SETTER
    public boolean isRightIndicator() {
        return rightIndicator;
    }

    public void setRightIndicator(boolean rightIndicator) {
        this.rightIndicator = rightIndicator;
    }

    public boolean isLeftIndicator() {
        return leftIndicator;
    }

    public void setLeftIndicator(boolean leftIndicator) {
        this.leftIndicator = leftIndicator;
    }

    public String getFront() {
        return headlight;
    }

    public void setFront(String headlight) {
        this.headlight = headlight;
    }

    public boolean isRear() {
        return rear;
    }

    public void setRear(boolean rear) {
        this.rear = rear;
    }

    public boolean isReverse() {
        return reverse;
    }

    public void setReverse(boolean reverse) {
        this.reverse = reverse;
    }

    public boolean isDaylight() {
        return daylight;
    }

    public void setDaylight(boolean daylight) {
        this.daylight = daylight;
    }

    public String getSensor() {
        return sensor;
    }

    public void setSensor(String sensor) {
        this.sensor = sensor;
    }

    // METHODS
    public void startLights() {
        daylight = true;
        if(sensor == "night") {
            headlight = "low beam";
        }
    }

    public void stopLights() {
        daylight = false;
        headlight = "off";
    }

    public void slowDownLights() {
        rear = true;
    }

    public void turnLights(String side) {
        if(side == "left") {
            this.leftIndicator = true;
        }
        this.rightIndicator = true;
    }

    public void reverseLight() {
        reverse = true;
    }

    @Override
    public String toString() {
        return "Lights{" +
                "id=" + id +
                ", rightIndicator=" + rightIndicator +
                ", leftIndicator=" + leftIndicator +
                ", headlight='" + headlight + '\'' +
                ", rear=" + rear +
                ", reverse=" + reverse +
                ", daylight=" + daylight +
                ", sensor='" + sensor + '\'' +
                '}';
    }
}
