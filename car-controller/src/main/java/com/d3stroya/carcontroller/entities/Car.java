package com.d3stroya.carcontroller.entities;


import com.d3stroya.carcontroller.entities.pieces.*;
import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

/**
 * Clase de tipo entidad con las características básicas comunes a todos los coches.
 */
@Entity
public class Car {

    // ATTRIBUTES
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String type;
    private String color;
    private Integer doors;
    private String name;

    public Car() {
    }


    public Car(Long id, String type, String color, Integer doors, String name) {
        this.id = id;
        this.type = type;
        this.color = color;
        this.doors = doors;
        this.name = name;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
//

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getDoors() {
        return doors;
    }

    public void setDoors(Integer doors) {
        this.doors = doors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // METHODS
    public void mode(String mode) {
        PiecesFacade pieces = new PiecesFacade();
        switch (mode) {
            case "start":
                System.out.println("Starting car from Entity...");
                pieces.carMode("start");
                break;
            case "stop":
                System.out.println("Stoping car from Entity...");
                pieces.carMode("stop");
                break;
            case "reverse":
                System.out.println("Reverse...");
                pieces.carMode("reverse");
                break;
            case "slow down":
                System.out.println("Slowing down...");
                pieces.carMode("slow down");
        }
    }

    public String getCar() {
        return "Factory pattern";
    }

}
