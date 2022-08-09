package com.d3stroya.carcontroller;

import com.d3stroya.carcontroller.controller.CarController;
import com.d3stroya.carcontroller.entities.Car;
import com.d3stroya.carcontroller.entities.CarCombustion;
import com.d3stroya.carcontroller.entities.CarElectric;
import com.d3stroya.carcontroller.entities.CarHibrid;
import com.d3stroya.carcontroller.repositories.CarRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class CarControllerApplication {

	public static void main(String[] args) {

		/**
		 * Crea el contexto de la API REST e incorpora los beans
		 */
		ApplicationContext context = SpringApplication.run(CarControllerApplication.class, args);
		CarRepository carRepository = context.getBean(CarRepository.class);

		/**
		 * Instancia el repositorio de coches
		 */
		CarController carController = new CarController(carRepository);

		/**
		 * Crea 3 coches, uno de cada tipo (combustión, eléctrico e híbrido).
		 */
		Car ferrari = new CarCombustion(null, "combustion", "red", 3, "ferrari");
		carRepository.save(ferrari);

		Car tesla = new CarElectric(null,"electric", "white", 5, "tesla");
		carRepository.save(tesla);

		Car i30 = new CarHibrid(null, "hibrid", "black", 5, "hyunday");
		carRepository.save(i30);


	}

}
