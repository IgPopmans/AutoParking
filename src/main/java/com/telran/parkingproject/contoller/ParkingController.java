package com.telran.parkingproject.contoller;


import com.telran.parkingproject.model.Car;
import com.telran.parkingproject.service.ParkingService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/parking")
public class ParkingController {

    final private ParkingService parkingService;

    public ParkingController(ParkingService parkingService) {
        this.parkingService = parkingService;
    }

    @GetMapping("/total")
    public List<Car> parkedCarsList() {
        return parkingService.getAllParkedCars();
    }

    @PostMapping()
    public void parkCar(@RequestBody Car id) {
        parkingService.parkCar(id);
    }

    @DeleteMapping("/{id}")
    public void removeCarFromParking(@PathVariable(name = "id") Car id) {
        parkingService.removeCarFromParking(id);
    }
}
