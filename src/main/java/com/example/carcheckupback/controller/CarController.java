package com.example.carcheckupback.controller;

import com.example.carcheckupback.model.Car;
import com.example.carcheckupback.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {
    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/car/{id}")
    @ResponseBody
    public Car getCar(@PathVariable Long id) {
        System.out.println(id);
        System.out.println(carService.getCarById(id));
        return carService.getCarById(id);
    }
}
