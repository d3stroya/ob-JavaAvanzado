package com.d3stroya.carcontroller.factory;

import com.d3stroya.carcontroller.entities.Car;
import com.d3stroya.carcontroller.entities.CarCombustion;
import com.d3stroya.carcontroller.entities.CarElectric;
import com.d3stroya.carcontroller.entities.CarHibrid;
import com.d3stroya.carcontroller.repositories.CarRepository;

/**
 * Clase que implementa el patrón factory. Dependiendo del tipo de coche que se pase por parámetro, devolverá su correspondiente clase.
 */
public class CarFactory {
    Car car;
    CarRepository carRepository;


    private CarFactory() {}

    public CarFactory(String type) {
        if(type.equalsIgnoreCase("electric")) {
            car = new CarElectric();
        } else if(type.equalsIgnoreCase("hibrid")) {
            car = new CarHibrid();
        } else if(type.equalsIgnoreCase("combustion")) {
            car = new CarCombustion();
        } else {
            System.out.println("The type of car indicated does not exist.");
        }
    }

    public String getCar() {
        return car.getCar();
    }



}
