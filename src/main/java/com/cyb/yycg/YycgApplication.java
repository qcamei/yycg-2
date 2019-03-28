package com.cyb.yycg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.cyb.yycg.dao")
public class YycgApplication {

    public static void main(String[] args) {
        SpringApplication.run(YycgApplication.class, args);
    }

}
