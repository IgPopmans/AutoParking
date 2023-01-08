package com.telran.parkingproject.contoller;


import com.telran.parkingproject.model.Car;
import com.telran.parkingproject.service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars") //localhost:8080/cars
public class CarController {


    private CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public List<Car> list() {
        return carService.list();
    }


    //localhost:8080/cars/5
    @GetMapping("/{id}")
    public Car getCar(@PathVariable(name = "id") int id) {
        return carService.getCar(id);

    }
    //localhost:8080/cars
    @PostMapping
    public Car create(@RequestBody Car car) {
        return carService.save(car);
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable(name = "id") int id){
        carService.remove(id);
    }
}
