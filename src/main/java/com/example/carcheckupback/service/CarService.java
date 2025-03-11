package com.example.carcheckupback.service;

import com.example.carcheckupback.exception.ResourceNotFoundException;
import com.example.carcheckupback.mapper.CarMapper;
import com.example.carcheckupback.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {
    private final CarMapper carMapper;

    @Autowired
    public CarService(CarMapper carMapper) {
        this.carMapper = carMapper;
    }

    public Car getCarById(Long id) {
        Car car = carMapper.getCarById(id);
        if (car == null) {
            throw new ResourceNotFoundException("Car not found with id: " + id);
        }
        return car;
    }
}