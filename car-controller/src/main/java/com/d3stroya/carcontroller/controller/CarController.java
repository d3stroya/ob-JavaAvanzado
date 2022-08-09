package com.d3stroya.carcontroller.controller;

import com.d3stroya.carcontroller.entities.Car;
import com.d3stroya.carcontroller.entities.pieces.PiecesFacade;
import com.d3stroya.carcontroller.factory.CarFactory;
import com.d3stroya.carcontroller.repositories.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Controlador para hacer peticiones http
 * Implementa los métodos del patrón fachada y el patrón factory
 */
@RestController
public class CarController {
    // ATTRIBUTES
    /**
     * Importa el repositorio y la clase coche, que contiene los métodos de la fachada (arrancar, parar, etc.).
     */
    private CarRepository carRepository;
    private Car car;

    // CONSTRUCTOR
    public CarController(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    // CRUD

    /**
     * Buscar todos los coches en el repositorio
     * Arranca todos los coches
     * @return lista de coches
     */
    @GetMapping("/api/cars")
    public List<Car> findAllCars() {
        for(Car car : carRepository.findAll()) {
            car.mode("start");
        }
        return carRepository.findAll();
    }

    /**
     * Buscar los coches el por color indicado en la url
     * @param color de tipo String
     * @return lista de coches del color especificado
     */
    @GetMapping("/api/cars/color/{color}")
    public List<Car> findAllByColor(@PathVariable String color) {
        return findAllCars().stream()
                .filter(car -> car.getColor().equalsIgnoreCase(color))
                .collect(Collectors.toList());
    }

    /**
     * Busca todos los coches que tengan el número de puertas indicado en la url
     * @param doors de tipo Integer
     * @return lista de coches con el número de puertas indicado en la url
     */
    @GetMapping("/api/cars/doors/{doors}")
    public List<Car> findAllByDoors(@PathVariable Integer doors) {
        return findAllCars().stream()
                .filter(car -> car.getDoors().equals(doors))
                .collect(Collectors.toList());
    }

    /**
     * Busca todos los coches que tienen un determinado nombre
     * @param name de tipo String
     * @return lista de coches con el nombre indicado en la url
     */
    @GetMapping("/api/cars/name/{name}")
    public List<Car> findAllByName(@PathVariable String name) {
        return findAllCars().stream()
                .filter(car -> car.getName().equalsIgnoreCase(name))
                .collect(Collectors.toList());
    }

    /**
     * Busca todos los coches del tipo indicado en la url
     * @param type de tipo String
     * @return lista de coches del tipo indicado en url
     */
    @GetMapping("/api/cars/type/{type}")
    public List<Car> findAllByType(@PathVariable String type) {
        CarFactory carFactory = new CarFactory(type);
        System.out.println(carFactory.getCar());
        return findAllCars().stream()
                .filter(car -> car.getType().equalsIgnoreCase(type))
                .collect(Collectors.toList());
    }

    /**
     * Actualiza un coche ya existente
     * @param car objeto json
     * @return Response entity dependiendo del resultado de la petición
     */
    @PutMapping("/api/cars")
    public ResponseEntity<Car> update(@RequestBody Car car) {
        if(car.getId() == null) {
            return ResponseEntity.badRequest().build();
        } else if(!carRepository.existsById(car.getId())) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(carRepository.save(car));
    }

    /**
     * Crea un nuevo coche
     * @param car objeto json sin id, ya que se genera automáticamente
     * @return response entity dependiendo del resultado de la petición
     */
    @PostMapping("/api/cars")
    public ResponseEntity<Car> create(@RequestBody Car car) {
        if(car.getId() != null) {
            return ResponseEntity.badRequest().build();
        }
        return ResponseEntity.ok(carRepository.save(car));
    }

    /**
     * Elimina todos los coches del repositorio
     * @return response entity dependiendo del resultado de la petición
     */
    @DeleteMapping("/api/cars")
    public ResponseEntity<Car> deleteAll() {
        carRepository.deleteAll();
        return ResponseEntity.noContent().build();
    }

    /**
     * Elimina el coche con el id pasado por url
     * @param id de tipo Long
     * @return response entity dependiendo del resultado de la petición
     */
    @DeleteMapping("/api/cars/{id}")
    public ResponseEntity<Car> deleteById(@PathVariable Long id) {
        if(!carRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        carRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
