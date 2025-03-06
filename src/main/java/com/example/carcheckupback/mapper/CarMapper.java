package com.example.carcheckupback.mapper;

import com.example.carcheckupback.model.Car;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface CarMapper {
    Car getCarById(Long id);
}
