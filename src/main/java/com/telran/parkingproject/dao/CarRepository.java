package com.telran.parkingproject.dao;

import com.telran.parkingproject.model.Car;

import java.util.List;


public interface CarRepository {

    List<Car> list();

    Car getCar(int id);

    Car save(Car car);

    void remove (int id);
}
