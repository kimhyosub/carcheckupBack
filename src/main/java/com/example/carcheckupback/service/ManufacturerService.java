package com.example.carcheckupback.service;

import com.example.carcheckupback.exception.ResourceNotFoundException;
import com.example.carcheckupback.mapper.ManufacturerMapper;
import com.example.carcheckupback.model.Manufacturer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManufacturerService {
    private final ManufacturerMapper manufacturerMapper;

    @Autowired
    public ManufacturerService(ManufacturerMapper manufacturerMapper) {
        this.manufacturerMapper = manufacturerMapper;
    }

    public List<Manufacturer> getAllManufacturers() {
        List<Manufacturer> manufacturers = manufacturerMapper.getAllManufacturers();
        if (manufacturers == null || manufacturers.isEmpty()) {
            throw new ResourceNotFoundException("No manufacturers found");
        }
        return manufacturers;
    }

    public Manufacturer getManufacturerById(Long id) {
        Manufacturer manufacturer = manufacturerMapper.getManufacturerById(id);
        if (manufacturer == null) {
            throw new ResourceNotFoundException("Manufacturer not found with id: " + id);
        }
        return manufacturer;
    }
}