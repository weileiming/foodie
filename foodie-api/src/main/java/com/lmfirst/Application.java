package com.lmfirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * Application
 *
 * @author leiming
 * @date 2019/11/20
 */
@SpringBootApplication
@MapperScan(basePackages = "com.lmfirst.mapper")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
