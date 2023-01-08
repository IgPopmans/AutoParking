package com.telran.parkingproject.dao;

import com.telran.parkingproject.model.Car;
import com.telran.parkingproject.service.CarService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component
public class ParkingRepositoryImpl implements ParkingRepository {

    private List<Car> parkedCars = new ArrayList<>(5);

    final private CarService carService;

    public ParkingRepositoryImpl(CarService carService) {
        this.carService = carService;
    }

    @Override
    public List<Car> getAllParkedCars() {
        return parkedCars;
    }

    @Override
    public void parkCar(Car id) {
        parkedCars.add(id);

    }

    @Override
    public void removeCarFromParking(Car id) {
        parkedCars.remove(id);

    }

//    @Override
//    public void parkCar(int id) {
//        parkedCars.add(carService.getCar(id));
//
//    }
//
//    @Override
//    public void removeCarFromParking(int id) {
//        parkedCars.remove(carService.getCar(id));
//    }
}
