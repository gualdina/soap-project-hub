package com.example.cars.service;

import com.example.cars.model.Car;
import com.example.cars.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Service
public class CarService {
    @Autowired
    private CarRepository carRepository;

    public static final Map<Integer, Car> cars = new HashMap<>();

//    @PostConstruct
//    public void initialize() {
//        Car opel = new Car();
//        opel.setCarId(1);
//        opel.setBrand("Opel");
//        opel.setPrice(200);
//
//        Car toyota = new Car();
//        toyota.setCarId(2);
//        toyota.setBrand("Toyota");
//        toyota.setPrice(300);
//
//        Car honda = new Car();
//        honda.setCarId(3);
//        honda.setBrand("Honda");
//        honda.setPrice(400);
//
//        cars.put(opel.getCarId(), opel);
//        cars.put(toyota.getCarId(), toyota);
//        cars.put(honda.getCarId(), honda);
//    }

//    public Car getCars(int carId) {
//        System.out.println(carId);
//        return cars.get(carId);
//    }
    public Car findCarByCarId(int carId){
        return carRepository.findByCarId(carId);
    }
}
