package com.telran.parkingproject.service;

import com.telran.parkingproject.dao.ParkingRepository;
import com.telran.parkingproject.model.Car;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ParkingServiceImpl implements ParkingService {

    final private ParkingRepository parkingRepository;

    public ParkingServiceImpl(ParkingRepository parkingRepository) {
        this.parkingRepository = parkingRepository;
    }

    @Override
    public List<Car> getAllParkedCars() {
        return parkingRepository.getAllParkedCars();
    }

    @Override
    public void parkCar(Car id) {
        parkingRepository.parkCar(id);
    }

    @Override
    public void removeCarFromParking(Car id) {
        parkingRepository.removeCarFromParking(id);

    }
}
