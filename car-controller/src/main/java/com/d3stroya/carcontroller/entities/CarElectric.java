package com.d3stroya.carcontroller.entities;

import com.d3stroya.carcontroller.entities.pieces.*;

import javax.persistence.Entity;

/**
 * Clase de tipo entidad e hija de Car para crear coches eléctricos.
 */
@Entity
public class CarElectric extends Car {
    // ATTRIBUTES
    private String type = "electric";

    // CONSTRUCTOR
    public CarElectric() {
    }

    public CarElectric(Long id, String type, String color, Integer doors, String name) {
        super(id, type, color, doors, name);
    }

    // GETTER AND SETTER
    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    public String getCar() {
        return "Electric car";
    }
}
