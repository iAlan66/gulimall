package com.alan.gulimall.product;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 1. 整合MyBatis-Plus
 *  1. 导入依赖
 *  2. 配置MyBatis
 *      1. 配置数据源
 *          1. 导入数据驱动mysql
 *          2. 在application.yml配置数据源相关信息
 *      2. 配置mybatis-plus:
 *          1. 使用@MapperScan
 *          2. 告诉MyBatis-Plus，sql映射文件配置
 */
@MapperScan("com.alan.gulimall.product.dao")
@SpringBootApplication
public class GulimallProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimallProductApplication.class, args);
    }

}
