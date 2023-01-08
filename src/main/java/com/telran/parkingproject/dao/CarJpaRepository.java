package com.telran.parkingproject.dao;

import com.telran.parkingproject.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CarJpaRepository extends JpaRepository<Car,Integer> {


}
