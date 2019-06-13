package com.hzm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan(basePackages = "com.hzm.dao")
@SpringBootApplication
public class SpringbootProvider8100Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootProvider8100Application.class, args);
    }

}
