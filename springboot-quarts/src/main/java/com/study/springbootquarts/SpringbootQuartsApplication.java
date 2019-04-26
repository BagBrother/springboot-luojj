package com.study.springbootquarts;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@MapperScan(basePackages = "com.study.springbootquarts.mapper")
@SpringBootApplication
public class SpringbootQuartsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootQuartsApplication.class, args);
    }

}
