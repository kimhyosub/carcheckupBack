package com.example.carcheckupback.mapper;

import com.example.carcheckupback.model.Manufacturer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ManufacturerMapper {
    List<Manufacturer> getAllManufacturers();
    Manufacturer getManufacturerById(Long id);
}