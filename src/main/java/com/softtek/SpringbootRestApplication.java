package com.softtek;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@MapperScan("com.softtek.dao")
@SpringBootApplication
public class SpringbootRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootRestApplication.class, args);
    }

}
