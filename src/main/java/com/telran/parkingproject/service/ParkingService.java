package com.telran.parkingproject.service;

import com.telran.parkingproject.model.Car;

import java.util.List;


public interface ParkingService {

    List<Car> getAllParkedCars();

    void parkCar(Car id);

    void removeCarFromParking(Car id);

}
