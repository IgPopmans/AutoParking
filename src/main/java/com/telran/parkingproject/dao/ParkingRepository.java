package com.telran.parkingproject.dao;

import com.telran.parkingproject.model.Car;

import java.util.List;

public interface ParkingRepository {

    List<Car> getAllParkedCars();

    void parkCar(Car id);

    void removeCarFromParking(Car id);
}
