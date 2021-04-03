package com.manage.drug.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 杉子
 * @date 2021/4/3 22:54
 * mp配置类
 */
@Configuration
@MapperScan(value = "com.manage.drug.mapper")
public class MybatisPlusConfig {
    /**
     * 翻页拦截器
     */
    @Bean
    public PaginationInterceptor paginationInterceptor(){
        PaginationInterceptor page = new PaginationInterceptor();
        page.setDialectType("mysql");
        return page;
    }
}
