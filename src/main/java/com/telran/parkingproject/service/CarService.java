package com.telran.parkingproject.service;

//CRUD

//1.List all cars
//2 get one car
//3.Create new cars
//4.Update car
//5.Delete car

import com.telran.parkingproject.model.Car;

import java.util.List;


public interface CarService {

    List<Car> list();

    Car getCar(int id);

    Car save(Car car);

    Car update(Car car);

    void remove(int id);

}
