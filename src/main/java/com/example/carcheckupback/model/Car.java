package com.example.carcheckupback.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Car {
    private Long id;
    private String make;
    private String model;
    private int carYear;
    private String status;
    private String createDate;
    private String category; // SEDAN, SUV, ELECTRIC, etc.
    private Long manufacturerId;
    private String imageUrl;

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", carYear=" + carYear +
                ", status='" + status + '\'' +
                ", createDate='" + createDate + '\'' +
                ", category='" + category + '\'' +
                ", manufacturerId=" + manufacturerId +
                ", imageUrl='" + imageUrl + '\'' +
                '}';
    }
}