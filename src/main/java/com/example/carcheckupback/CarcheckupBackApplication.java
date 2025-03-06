package com.example.carcheckupback;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.carcheckupback.mapper")
public class CarcheckupBackApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarcheckupBackApplication.class, args);
    }

}
