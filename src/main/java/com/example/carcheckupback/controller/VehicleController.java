package com.example.carcheckupback.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehicleController {

    @GetMapping("/api/vehicles")
    public String getVehicleList() {
        return "Vehicle list will be here!";
    }
}
