package com.example.carcheckupback.controller;

import com.example.carcheckupback.model.Car;
import com.example.carcheckupback.service.CarService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CarController {
    private static final Logger logger = LoggerFactory.getLogger(CarController.class);

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/car/{id}")
    public ResponseEntity<Car> getCar(@PathVariable Long id) {
        logger.debug("Fetching car with id: {}", id);
        Car car = carService.getCarById(id);
        return ResponseEntity.ok(car);
    }

    @GetMapping("/manufacturers/{manufacturerId}/cars")
    public ResponseEntity<List<Car>> getCarsByManufacturer(@PathVariable Long manufacturerId) {
        logger.debug("Fetching cars for manufacturer with id: {}", manufacturerId);
        List<Car> cars = carService.getCarsByManufacturer(manufacturerId);
        return ResponseEntity.ok(cars);
    }

    @GetMapping("/manufacturers/{manufacturerId}/categories")
    public ResponseEntity<List<String>> getCategoriesByManufacturer(@PathVariable Long manufacturerId) {
        logger.debug("Fetching categories for manufacturer with id: {}", manufacturerId);
        List<String> categories = carService.getCategoriesByManufacturer(manufacturerId);
        return ResponseEntity.ok(categories);
    }

    @GetMapping("/manufacturers/{manufacturerId}/categories/{category}/cars")
    public ResponseEntity<List<Car>> getCarsByManufacturerAndCategory(
            @PathVariable Long manufacturerId,
            @PathVariable String category) {
        logger.debug("Fetching cars for manufacturer with id: {} and category: {}", manufacturerId, category);
        List<Car> cars = carService.getCarsByManufacturerAndCategory(manufacturerId, category);
        return ResponseEntity.ok(cars);
    }

    // 기존 API 엔드포인트들
    @PostMapping("/car")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<String> createCar(@RequestBody Car car) {
        // 차량 생성 로직 구현 필요
        logger.info("Car created: {}", car);
        return ResponseEntity.status(HttpStatus.CREATED)
                .body("Car created successfully");
    }

    @PutMapping("/car/{id}")
    public ResponseEntity<String> updateCar(@PathVariable Long id, @RequestBody Car car) {
        // 차량 업데이트 로직 구현 필요
        logger.info("Car updated: {}", car);
        return ResponseEntity.ok("Car updated successfully");
    }

    @DeleteMapping("/car/{id}")
    public ResponseEntity<String> deleteCar(@PathVariable Long id) {
        // 차량 삭제 로직 구현 필요
        logger.info("Car deleted with id: {}", id);
        return ResponseEntity.ok("Car deleted successfully");
    }
}