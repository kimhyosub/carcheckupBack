package com.example.carcheckupback.service;

import com.example.carcheckupback.exception.ResourceNotFoundException;
import com.example.carcheckupback.mapper.CarMapper;
import com.example.carcheckupback.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

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

    public List<Car> getCarsByManufacturer(Long manufacturerId) {
        List<Car> cars = carMapper.getCarsByManufacturer(manufacturerId);
        if (cars == null || cars.isEmpty()) {
            throw new ResourceNotFoundException("No cars found for manufacturer with id: " + manufacturerId);
        }
        return cars;
    }

    public List<String> getCategoriesByManufacturer(Long manufacturerId) {
        List<String> categories = carMapper.getCategoriesByManufacturer(manufacturerId);
        if (categories == null || categories.isEmpty()) {
            throw new ResourceNotFoundException("No categories found for manufacturer with id: " + manufacturerId);
        }
        return categories;
    }

    public List<Car> getCarsByManufacturerAndCategory(Long manufacturerId, String category) {
        List<Car> cars = carMapper.getCarsByManufacturerAndCategory(manufacturerId, category);
        if (cars == null || cars.isEmpty()) {
            throw new ResourceNotFoundException("No cars found for manufacturer with id: " + manufacturerId + " and category: " + category);
        }
        return cars;
    }
}