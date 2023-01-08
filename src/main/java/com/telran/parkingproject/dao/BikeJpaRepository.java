package com.telran.parkingproject.dao;

import com.telran.parkingproject.model.Bike;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BikeJpaRepository extends JpaRepository<Bike,Integer> {

}
