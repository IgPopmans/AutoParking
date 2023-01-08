package com.telran.parkingproject.service;

import com.telran.parkingproject.dao.BikeJpaRepository;
import com.telran.parkingproject.model.Bike;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class BikeServiceImpl implements BikeService{


   final private BikeJpaRepository bikeJpaRepository;

    public BikeServiceImpl(BikeJpaRepository bikeJpaRepository) {
        this.bikeJpaRepository = bikeJpaRepository;
    }

    @Override
    public List<Bike> list() {
      return bikeJpaRepository.findAll();
    }

    @Override
    public Bike create(Bike bike) {
        return bikeJpaRepository.save(bike);
    }

    @Override
    public void remove(int id) {
        Bike bike= getById(id);
         bikeJpaRepository.delete(bike);
    }

    @Override
    public Bike getById(int id) {
        Optional <Bike> optionalBike = bikeJpaRepository.findById(id);
        return optionalBike.orElse(null);
    }
}
