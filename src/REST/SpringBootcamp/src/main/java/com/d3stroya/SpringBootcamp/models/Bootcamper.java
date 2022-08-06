package com.d3stroya.SpringBootcamp.models;

public class Bootcamper {
    // ATRIBUTOS
    private String nombre;

    // CONSTRUCTORES
    public Bootcamper() {}
    public Bootcamper(String nombre) {
        this.nombre = nombre;
    }

    // GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
