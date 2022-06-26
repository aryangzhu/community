package com.changzhu.community;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@MapperScan("com.changzhu.community.dao")
public class CommunityApplication {
    public static void main(String[] args) {
        SpringApplication.run(CommunityApplication.class, args);
    }

}
