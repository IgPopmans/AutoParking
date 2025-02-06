package com.telran.parkingproject.service;

import com.telran.parkingproject.dao.CarJpaRepository;
import com.telran.parkingproject.model.Car;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class CarServiceImpl implements CarService {

    final private CarJpaRepository carJpaRepository;

    public CarServiceImpl(CarJpaRepository carJpaRepository) {
        this.carJpaRepository = carJpaRepository;
    }

    @Override
    public List<Car> list() {
        return carJpaRepository.findAll();
    }

    @Override
    public Car getCar(int id) {
        Optional<Car> car = carJpaRepository.findById(id);
        return car.orElse(null);
    }

    @Override
    public Car save(Car car) {
        return carJpaRepository.save(car);
    }

    @Override
    public Car update(Car car) {
        return null;
    }

    @Override
    public void remove(int id) {
        Car byId = getCar(id);
        carJpaRepository.delete(byId);
    }
}
