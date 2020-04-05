package com.demo.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.demo.cg.mapper")
public class ItemsApplication {
    public static void main(String[] args) {
        SpringApplication.run(ItemsApplication.class);
    }
}
