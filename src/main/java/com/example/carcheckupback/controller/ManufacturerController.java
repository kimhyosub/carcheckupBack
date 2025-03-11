package com.example.carcheckupback.controller;

import com.example.carcheckupback.model.Manufacturer;
import com.example.carcheckupback.service.ManufacturerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ManufacturerController {
    private static final Logger logger = LoggerFactory.getLogger(ManufacturerController.class);

    private final ManufacturerService manufacturerService;

    @Autowired
    public ManufacturerController(ManufacturerService manufacturerService) {
        this.manufacturerService = manufacturerService;
    }

    @GetMapping("/manufacturers")
    public ResponseEntity<List<Manufacturer>> getAllManufacturers() {
        logger.debug("Fetching all manufacturers");
        List<Manufacturer> manufacturers = manufacturerService.getAllManufacturers();
        return ResponseEntity.ok(manufacturers);
    }

    @GetMapping("/manufacturer/{id}")
    public ResponseEntity<Manufacturer> getManufacturerById(@PathVariable Long id) {
        logger.debug("Fetching manufacturer with id: {}", id);
        Manufacturer manufacturer = manufacturerService.getManufacturerById(id);
        return ResponseEntity.ok(manufacturer);
    }
}