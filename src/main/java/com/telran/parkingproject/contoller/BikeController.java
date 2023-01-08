package com.telran.parkingproject.contoller;


import com.telran.parkingproject.model.Bike;
import com.telran.parkingproject.service.BikeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bikes")
public class BikeController {

    private BikeService bikeService;

    public BikeController(BikeService bikeService) {
        this.bikeService = bikeService;
    }


    @GetMapping
    public List<Bike> list() {
        return bikeService.list();
    }

    @PostMapping
    public Bike create(@RequestBody Bike bike) {
        return bikeService.create(bike);
    }

    @DeleteMapping("/{id}")
    public void remove(@PathVariable(name = "id") int id) {
        bikeService.remove(id);
    }
    @GetMapping("/{id}")
    public void getById(@PathVariable(name = "id") int id) {
        bikeService.getById(id);
    }


}
