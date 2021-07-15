package com.odianyun.internship.startup;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @description:
 * @author: EDZ
 * @time: 9:43
 * @date: 2021/7/13
 */
@SpringBootApplication()
@ComponentScan("com.odianyun.internship")
@MapperScan("com.odianyun.internship.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
