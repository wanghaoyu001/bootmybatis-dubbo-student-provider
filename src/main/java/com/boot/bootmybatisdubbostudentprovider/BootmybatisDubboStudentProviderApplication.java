package com.boot.bootmybatisdubbostudentprovider;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.bizImpl"})
@MapperScan(basePackages = {"com.mapper"})
@EnableDubboConfiguration
public class BootmybatisDubboStudentProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootmybatisDubboStudentProviderApplication.class, args);
    }

}
