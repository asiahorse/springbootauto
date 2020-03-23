package com.atguigu.springboot.springbootauto;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.atguigu.springboot.springbootauto.mapper")
@SpringBootApplication
public class SpringbootautoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootautoApplication.class, args);
    }

}
