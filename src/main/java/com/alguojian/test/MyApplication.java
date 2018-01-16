package com.alguojian.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动类
 *
 * @author ALguojian
 * @date 2018/1/16
 */
@SpringBootApplication
@MapperScan("com.alguojian.test.persistence")
public class MyApplication {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(MyApplication.class, args);
    }
}
