package com.example.springbootdemo1;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.example.springbootdemo1.mapper")
@SpringBootApplication
public class SpringBootDemo1Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemo1Application.class, args);
    }

}
