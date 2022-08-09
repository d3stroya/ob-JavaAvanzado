package com.d3stroya.carcontroller.repositories;

import com.d3stroya.carcontroller.entities.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
}
