package com.telran.parkingproject.dao;

import com.telran.parkingproject.model.Car;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;


public class CarRepositoryImpl implements  CarRepository{

    private List<Car> carList = new ArrayList<>();
    private AtomicInteger carId = new AtomicInteger(4);

    @PostConstruct
    public void init() {
        carList.add(new Car("Ford",1985,1,"black"));
        carList.add(new Car("BMW",1923,2,"white"));
        carList.add(new Car("VW",1983,3,"red"));
        carList.add(new Car("Lincoln",1945,4,"yellow"));
    }


    @Override
    public List<Car> list() {
        return carList;
    }

    @Override
    public Car getCar(int id) {
        return carList.stream().filter(car -> car.getId()==id).findFirst().get();
    }

    @Override
    public Car save(Car car) {
        car.setId(carId.incrementAndGet());
        carList.add(car);
        return car;
    }

    @Override
    public void remove(int id) {
        carList.stream().filter(car -> car.getId() != id).collect(Collectors.toList());
    }
}
