package com.example.carcheckupback.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Manufacturer {
    private Long id;
    private String name;
    private String country;
    private String createDate;

    @Override
    public String toString() {
        return "Manufacturer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", createDate='" + createDate + '\'' +
                '}';
    }
}