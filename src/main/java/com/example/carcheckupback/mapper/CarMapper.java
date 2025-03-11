package com.example.carcheckupback.mapper;

import com.example.carcheckupback.model.Car;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface CarMapper {
    Car getCarById(Long id);
    List<Car> getCarsByManufacturer(Long manufacturerId);
    List<String> getCategoriesByManufacturer(Long manufacturerId);
    List<Car> getCarsByManufacturerAndCategory(Long manufacturerId, String category);
}