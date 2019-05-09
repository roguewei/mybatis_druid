package com.shirodemo.demo.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author Winston
 * @title: DbConfig
 * @projectName shiroDemo
 * @description:
 * @date 2019/5/9 9:59
 */
@Configuration
@MapperScan(basePackages = "com.shirodemo.demo.mapper")
public class DbConfig {
}
