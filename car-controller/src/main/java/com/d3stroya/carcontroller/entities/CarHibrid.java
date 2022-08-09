package com.d3stroya.carcontroller.entities;


import com.d3stroya.carcontroller.entities.pieces.*;

import javax.persistence.Entity;

/**
 * Clase entidad que hereda de Car y permite crear coches híbridos
 */
@Entity
public class CarHibrid extends Car {
    // ATTRIBUTES
    private String type = "hibrid";

    // CONSTRUCTOR
    public CarHibrid() {
    }

    public CarHibrid(Long id, String type, String color, Integer doors, String name) {
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
        return "Hybr" +
                "id car";
    }
}
